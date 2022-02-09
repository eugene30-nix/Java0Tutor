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
class Index {    
    int rowIndex;
    int columnIndex;
    
    Index(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }
}

public class Drill17 {
    private static int[][] init(int count) {
        int[][] result = new int[count][count];
        for (int rowIndex = 0, number = 1; rowIndex < count; rowIndex++) {
            for (int columnIndex = 0; columnIndex < count; 
                    columnIndex++, number++) {
                result[rowIndex][columnIndex] = number;
            }
        }
        return result;
    }
    
    private static void next(int[][] intMatrix, Index index) {
        int rowIndex = index.rowIndex;
        int columnIndex = index.columnIndex;
        
        int rowCount = intMatrix.length;
        int columnCount = intMatrix[rowIndex].length;        
        
        index.columnIndex++;
        if (index.columnIndex > columnCount - 1) {
            index.columnIndex = 0;
            index.rowIndex++;
        }
        
        int tempValue = intMatrix[rowIndex][columnIndex];
        intMatrix[rowIndex][columnIndex] = 
                intMatrix[index.rowIndex][index.columnIndex];
        intMatrix[index.rowIndex][index.columnIndex] = tempValue; 
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[][] intMatrix = init(count);
        helper.write("A[N,N]=", intMatrix);
        
        for (int changeCount = count * count - 1; changeCount > 0; changeCount--) {
            Index index = new Index(0, 0);
            for (int changeIndex = 0; changeIndex < changeCount; changeIndex++) {
                next(intMatrix, index);
                helper.write("A[N,N]=", intMatrix);
            }
        }
    }
}
