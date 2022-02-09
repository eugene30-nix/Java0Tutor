/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.matrix;

import com.erozenfeld.util.InOutHelper;
import java.util.Random;

/**
 *
 * @author Администратор
 */
public class Drill14 {
    private static void generateColumn(int[][] intMatrix, int columnIndex) {
        for (int rowIndex = 0; rowIndex < intMatrix.length; rowIndex++) {
            if (rowIndex <= columnIndex) {
                intMatrix[rowIndex][columnIndex] = 1;
            } else {
                intMatrix[rowIndex][columnIndex] = 0;
            }
        }
        
        Random random = new Random();
        for (int count = 0; count < intMatrix.length / 2; count++) {
            int rowIndex1 = random.nextInt(intMatrix.length);
            int rowIndex2 = (rowIndex1 + 1) % intMatrix.length;
            int tempValue = intMatrix[rowIndex1][columnIndex];
            intMatrix[rowIndex1][columnIndex] =
                    intMatrix[rowIndex2][columnIndex];
            intMatrix[rowIndex2][columnIndex] = tempValue;
        }
    }
    
    private static int[][] generateMatrix(int rowCount, int columnCount) {
        int[][] result = new int[rowCount][columnCount];
        for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
            generateColumn(result, columnIndex);
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int rowCount = helper.readInt("N=");
        int columnCount = helper.readInt("M=");
        int [][] intMatrix = generateMatrix(rowCount, columnCount);
        helper.write("A[N,M]=", intMatrix);        
    }    
}
