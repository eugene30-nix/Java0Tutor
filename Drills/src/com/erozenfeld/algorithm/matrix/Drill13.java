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
public class Drill13 {
    public static void sort(int[][] intMatrix, int columnIndex, int direction) {
        for (int indexI = 0; indexI < intMatrix.length; indexI++) {
            for (int indexJ = intMatrix.length - 1; indexJ > indexI; indexJ--) {
                if (direction * intMatrix[indexJ][columnIndex]
                        < direction * intMatrix[indexJ - 1][columnIndex]) {
                    int tempValue = intMatrix[indexJ][columnIndex];
                    intMatrix[indexJ][columnIndex] = intMatrix[indexJ - 1][columnIndex];
                    intMatrix[indexJ - 1][columnIndex] = tempValue;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int rowCount = helper.readInt("N=");
        int columnCount = helper.readInt("M=");
        int[][] intMatrix = helper.readIntMatrix("A[N,M]=", rowCount, columnCount);
        
        for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
            sort(intMatrix, columnIndex, 1);
        }

        helper.write("A[N,M]=", intMatrix);

        for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
            sort(intMatrix, columnIndex, -1);
        }

        helper.write("A[N,M]=", intMatrix);        
    }    
}
