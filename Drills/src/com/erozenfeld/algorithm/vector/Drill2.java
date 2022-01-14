/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.vector;

import com.erozenfeld.util.InOutHelper;
import java.math.BigDecimal;
/**
 *
 * @author eugene30
 */
public class Drill2 {
    private static int change(double[] doubleArray, double maxValue) {
        int result = 0;
        for (int index = 0; index < doubleArray.length; index++) {
            if (doubleArray[index] > maxValue) {
                doubleArray[index] = maxValue;
                result++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        double[] doubleArray = helper.readDoubleArray("A[N]=", count);
        double maxValue = helper.readDouble("Z=");
        helper.write("C=", change(doubleArray, maxValue));
        helper.write("A[N]=", doubleArray);
    }
    
}
