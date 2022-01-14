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
public class Drill5 {
    private static String printif(int[] intArray) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] > index + 1) {
                if (result.length() > 0)
                    result.append(" ");
                result.append(intArray[index]);
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("A[N]=", count);
        helper.write("A[N]=", printif(intArray));
    }
}
   
