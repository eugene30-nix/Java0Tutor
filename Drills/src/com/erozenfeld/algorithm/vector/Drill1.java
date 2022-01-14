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
public class Drill1 {
    private static int sum(int[] intArray, int divider) {
        int result = 0;
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % divider == 0)
                result += intArray[index];
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("A[N]=", count);
        int divider = helper.readInt("K=");
        helper.write("sum=", sum(intArray, divider));
    }
}
