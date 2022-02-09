/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но
 * больше всех других элементов).
 */

public class Drill5 {
    private static String max2(int[] intArray) {
        int maxValue1 = intArray[0];
        int maxValue2 = intArray[0];
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] < maxValue2 && maxValue2 == maxValue1) {
                maxValue2 = intArray[index];
            } else if (maxValue2 < intArray[index]
                    && intArray[index] < maxValue1) {
                maxValue2 = intArray[index];
            } else if (maxValue1 < intArray[index]) {
                maxValue2 = maxValue1;
                maxValue1 = intArray[index];
            }
        }
        if (maxValue2 == maxValue1) {
            return "null";
        } else {
            return String.valueOf(maxValue2);
        }
           
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("A[N]=", count);
        helper.write("max2(A[N])=", max2(intArray));
    }
}
