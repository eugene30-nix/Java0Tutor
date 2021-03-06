/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.matrix;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author eugene30
 */
public class Drill1 {
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int rowCount = helper.readInt("N=");
        int columnCount = helper.readInt("M=");
        int[][] intMatrix = helper.readIntMatrix("A[N,M]=", rowCount, columnCount);

        for (int columnIndex = 0; columnIndex < columnCount; columnIndex += 2) {
            if (intMatrix[0][columnIndex] 
                    > intMatrix[rowCount - 1][columnIndex])
                helper.write("column " + (columnIndex + 1) + ": ", intMatrix, 
                        columnIndex);
        }
    }
}
