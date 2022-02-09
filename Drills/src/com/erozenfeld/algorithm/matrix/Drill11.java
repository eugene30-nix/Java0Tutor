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
public class Drill11 {
    private static int count5(int[] intArray) {
        int result = 0;
        for (int value : intArray) {
            if (value == 5) {
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int[][] intMatrix = helper.randomIntMatrix(10, 20, 0, 16);
        helper.write("A[N,N]=", intMatrix);
        
        System.out.print("row numbers:");
        for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
            if (count5(intMatrix[rowIndex]) > 2)
                System.out.print(" " + (rowIndex + 1));
        }
        System.out.println("");
    }
}
