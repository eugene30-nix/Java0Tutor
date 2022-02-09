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
public class Drill3 {
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int rowCount = helper.readInt("N=");
        int columnCount = helper.readInt("M=");
        int [][] intMatrix = helper.readIntMatrix("A[N,M]=", rowCount, columnCount);
        int rowIndex = helper.readInt("K=");
        helper.write("row " + rowIndex + ": ", intMatrix[rowIndex - 1]);
        int columnIndex = helper.readInt("P=");
        helper.write("column " + columnIndex + ": ", intMatrix, columnIndex - 1);
    }
}
