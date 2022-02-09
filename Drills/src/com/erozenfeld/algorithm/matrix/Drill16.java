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
public class Drill16 {
    private static int max(int[][] intMatrix) {
        int result = intMatrix[0][0];
        for (int rowIndex = 0; rowIndex < intMatrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < intMatrix[rowIndex].length; 
                    columnIndex++) {
                if (result < intMatrix[rowIndex][columnIndex]) {
                    result = intMatrix[rowIndex][columnIndex];
                }
            }
        }
        return result;
    }
    
    private static void change(int[][] intMatrix, int value) {
        for (int rowIndex = 0, index = 1; rowIndex < intMatrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < intMatrix[rowIndex].length;
                    columnIndex++, index++) {
                if (index % 2 == 1) {
                    intMatrix[rowIndex][columnIndex] = value;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int rowCount = helper.readInt("N=");
        int columnCount = helper.readInt("M=");
        int[][] intMatrix = helper.readIntMatrix("A[N,M]=", rowCount, columnCount);
        change(intMatrix, max(intMatrix));
        helper.write("A[N,M]=", intMatrix);        
    }
}
