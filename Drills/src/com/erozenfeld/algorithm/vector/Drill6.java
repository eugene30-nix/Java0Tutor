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
public class Drill6 {
    private static double[] primeIndex(double[] doubleArray) {
        for (int step = 2; step <= doubleArray.length / 2; step++) {
            for (int index = 2 * step - 1; index < doubleArray.length; index += step)
                doubleArray[index] = 0D;
        }
        return doubleArray;
    }
    
    private static double sum(double[] doubleArray) {
        double result = 0D;
        for (int index = 0; index < doubleArray.length; index++)
            result += doubleArray[index];
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        double[] doubleArray = helper.readDoubleArray("A[N]=", count);
        helper.write("sum=", sum(primeIndex(doubleArray)));   
    }   
}
