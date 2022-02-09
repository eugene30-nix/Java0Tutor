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
public class Drill2 {
    private static int[] getDiag(int[][] intMatrix) {
        int[] result = new int[intMatrix.length];
        for (int index = 0; index < result.length; index++) {
            result[index] = intMatrix[index][index];
        }
        return result;
    }
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[][] intMatrix = helper.readIntMatrix("A[N,N]=", count, count);
        helper.write("diag:", getDiag(intMatrix));
    }
}
