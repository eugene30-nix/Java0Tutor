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
public class Drill12 {
    public static void sort(int[][] intMatrix, int rowIndex, int direction) {
        for (int indexI = 0; indexI < intMatrix[rowIndex].length; indexI++) {
            for (int indexJ = intMatrix[rowIndex].length - 1; indexJ > indexI; indexJ--) {
                if (direction * intMatrix[rowIndex][indexJ] 
                        < direction * intMatrix[rowIndex][indexJ - 1]) {
                    int tempValue = intMatrix[rowIndex][indexJ];
                    intMatrix[rowIndex][indexJ] = intMatrix[rowIndex][indexJ - 1];
                    intMatrix[rowIndex][indexJ - 1] = tempValue;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int rowCount = helper.readInt("N=");
        int columnCount = helper.readInt("M=");
        int[][] intMatrix = helper.readIntMatrix("A[N,M]", rowCount, columnCount);
        
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            sort(intMatrix, rowIndex, 1);
        }
        
        helper.write("A[N,M]=", intMatrix);

        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            sort(intMatrix, rowIndex, -1);
        }
        
        helper.write("A[N,M]=", intMatrix);
    }
}
