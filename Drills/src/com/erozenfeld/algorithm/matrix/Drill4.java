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
public class Drill4 {
    private static int[][] generateMatrix(int count) {
        int[][] result = new int[count][count];
        for (int rowIndex = 0; rowIndex < count; rowIndex++) {
            int number;
            int increment;
            
            if (rowIndex % 2 == 0) {
                number = 1;
                increment = 1;
            } else {
                number = count;
                increment = -1;
            }
            
            for (int columnIndex = 0; columnIndex < count; columnIndex++) {
                result[rowIndex][columnIndex] = number;
                number += increment;
            }
        }
        return result;
    }
    public static void main(String[] srgs) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        helper.write("A[N,N]=", generateMatrix(count));
    }
}
