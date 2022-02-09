/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.matrix;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author Администратор
 */
public class Drill7 {
    private static double func(int rowIndex, int columnIndex, int count) {
        return (double)(rowIndex*rowIndex - columnIndex*columnIndex) / count;
    }
    
    private static double[][] generateMatrix(int count) {
        double[][] result = new double[count][count];
        for (int rowIndex = 0; rowIndex < count; rowIndex++) {
            for (int columnIndex = 0; columnIndex < count; columnIndex++) {
                result[rowIndex][columnIndex] 
                        = func(rowIndex, columnIndex, count);
            }
        }
        return result;
    }
    
    private static int countPositive(double[][] doubleMatrix) {
        int result = 0;
        for (int rowIndex = 0; rowIndex < doubleMatrix.length; rowIndex++) {
            for (int columnIndex = 0; 
                    columnIndex < doubleMatrix[rowIndex].length;
                    columnIndex++) {
                if (doubleMatrix[rowIndex][columnIndex] > 0D) {
                    result++;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        double[][] doubleMatrix = generateMatrix(count);
        helper.write("A[N,N]=", doubleMatrix);
        helper.write("positive elements: ", countPositive(doubleMatrix));
    }
}
