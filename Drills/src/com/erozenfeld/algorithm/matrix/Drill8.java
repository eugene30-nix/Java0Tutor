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
public class Drill8 {
    private static void exchangeColumns(int[][] intMatrix, int srcColumnIndex,
            int dstColumnIndex) {
        for (int[] intRow : intMatrix) {
            int tempValue = intRow[srcColumnIndex];
            intRow[srcColumnIndex] = intRow[dstColumnIndex];
            intRow[dstColumnIndex] = tempValue;
        }
    }
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int rowCount = helper.readInt("N=");
        int columnCount = helper.readInt("M=");
        int[][] intMatrix = helper.readIntMatrix("A[N,M]=", rowCount,
                columnCount);
        int srcColumnIndex = helper.readInt("P=") - 1;
        int dstColumnIndex = helper.readInt("Q=") - 1;
        exchangeColumns(intMatrix, srcColumnIndex, dstColumnIndex);
        helper.write("A[N,M]", intMatrix);
    }
}
