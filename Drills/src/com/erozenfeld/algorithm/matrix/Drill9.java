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
public class Drill9 {
    private static int[] columnSum(int[][] intMatrix){
        int[] result = new int[intMatrix[0].length];
        for (int rowIndex = 0; rowIndex < intMatrix.length; rowIndex++) {
            for (int columnIndex = 0;
                    columnIndex < intMatrix[rowIndex].length; columnIndex++) {
                result[columnIndex] += intMatrix[rowIndex][columnIndex];
            }
        }
        return result;
    }
    
    private static int maxIndex(int[] intArray) {
        int result = 0;
        int value = intArray[result];        
        for (int index = 0; index < intArray.length; index++) {
            if (value < intArray[index]) {
                value = intArray[index];
                result = index;
            }
        }
        return result;
    }
    
    public static void main(String[] arg) {
        InOutHelper helper = new InOutHelper();
        int rowCount = helper.readInt("N=");
        int columnCount = helper.readInt("M=");
        int[][] intMatrix = helper.readIntMatrix("A[N,M]=", rowCount, columnCount);
        int[] columSumArray = columnSum(intMatrix);
        helper.write("S[M]=", columSumArray);
        helper.write("maxIndex=", maxIndex(columSumArray) + 1);
    }
}
