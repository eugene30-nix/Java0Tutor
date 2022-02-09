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
public class Drill5 {
    private static int[][] generateMatrix(int count) {
        int[][] result = new int[count][count];
        for (int rowIndex = 0; rowIndex < count; rowIndex++) {
            for (int columnIndex = 0; columnIndex < count; columnIndex++) {
                if (rowIndex + columnIndex > count - 1)
                    result[rowIndex][columnIndex] = 0;
                else
                    result[rowIndex][columnIndex] = rowIndex + 1;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        helper.write("A[N,N]=", generateMatrix(count));
    }
}
