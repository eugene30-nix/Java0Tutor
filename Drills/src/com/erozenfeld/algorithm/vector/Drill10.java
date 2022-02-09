/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.vector;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author eugene30
 */
public class Drill10 {
    private static void compress(int[] intArray) {
        for(int dstIndex = 1, srcIndex = 2;
                dstIndex < intArray.length; 
                dstIndex += 1, srcIndex += 2) {
            if (dstIndex <= intArray.length / 2 + 0.5
                    && srcIndex < intArray.length) {
                intArray[dstIndex] = intArray[srcIndex];
            } else {
                intArray[dstIndex] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("A[N]=", count);
        compress(intArray);
        helper.write("A[N]=", intArray);
    }
}
