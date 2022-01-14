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
public class Drill7 {
    private static double max(double[] doubleArray) {
        int count = doubleArray.length;
        double result = doubleArray[0];
        if (count - 1 > 0)
            result += doubleArray[count - 1];
 
        for (int index = 0; index < count/2D + 0.5; index++) {
            double element = doubleArray[index];
            if (count - 1 - index > index)
                element += doubleArray[count - 1 - index];
            if (result < element)
                result = element;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        double[] doubleArray = helper.readDoubleArray("A[N]=", count);
        helper.write("max=", max(doubleArray));
    }
}
