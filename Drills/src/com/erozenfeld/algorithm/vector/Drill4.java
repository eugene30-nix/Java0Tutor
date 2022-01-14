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
public class Drill4 {
    private static void changeMinMax(double[] doubleArray) {
        int minIndex = 0;
        int maxIndex = 0;
        double min = doubleArray[minIndex];
        double max = doubleArray[maxIndex];
        
        for (int index = 0; index < doubleArray.length; index++) {
            if (doubleArray[index] > max) {
                maxIndex = index;
                max = doubleArray[maxIndex];
            }
            
            if (doubleArray[index] < min) {
                minIndex = index;
                min = doubleArray[minIndex];
            } 
        }
        
        if (minIndex != maxIndex) {
            double tmp = doubleArray[minIndex];
            doubleArray[minIndex] = doubleArray[maxIndex];
            doubleArray[maxIndex] = tmp;
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        double[] doubleArray = helper.readDoubleArray("A[N]=", count);
        changeMinMax(doubleArray);
        helper.write("A[N]=", doubleArray);
    }
}
