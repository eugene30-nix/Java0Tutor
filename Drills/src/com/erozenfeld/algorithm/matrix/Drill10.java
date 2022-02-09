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
public class Drill10 {
    public static void main(String[] args){
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[][] intMatrix = helper.readIntMatrix("A[N,N]=", count, count);
                
        System.out.print("positive diagonal elements:");
        for (int index = 0; index < count; index++) {
            if (intMatrix[index][index] > 0) {
                System.out.print(" " + intMatrix[index][index]);
            }
        }        
        System.out.println("");
    }
}
