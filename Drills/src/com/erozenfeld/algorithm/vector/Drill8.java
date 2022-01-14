/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.vector;

import com.erozenfeld.util.InOutHelper;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 *
 * @author eugene30
 */
public class Drill8 {
    private static int min(int[] intArray) {
        int minIndex = 0;
        int minValue = intArray[0];
        for (int index = 0; index < intArray.length; index++) {
            if (minValue > intArray[index]) {
                minValue = intArray[index];
                minIndex = 0;
                int tmpValue = intArray[minIndex];
                intArray[minIndex] = minValue;
                intArray[index] = tmpValue;
            } else if (minValue == intArray[index] && minIndex != index) {
                minIndex++;
                int tmpValue = intArray[minIndex];
                intArray[minIndex] = minValue;
                intArray[index] = tmpValue;                
            }
        }
        return minIndex;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("A[N]=", count);
        helper.write("A[N]=", Arrays.copyOfRange(intArray, min(intArray) + 1, intArray.length));
    }
}
