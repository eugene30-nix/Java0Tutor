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
public class Drill3 {
    private static class Counter {
        int negativeCount;
        int zeroCount;
        int positiveCount;        
    }
    
    private static Counter count(double[] doubleArray) {
        Counter result = new Counter();
        for (int index = 0; index < doubleArray.length; index++) {
            if (doubleArray[index] < 0D)
                result.negativeCount++;
            else if (doubleArray[index] == 0D)
                result.zeroCount++;
            else
                result.positiveCount++;
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        double[] doubleArray = helper.readDoubleArray("A[N]=", count);
        Counter counter = count(doubleArray);
        helper.write("negative numbers count=", counter.negativeCount);
        helper.write("zero numbers count=", counter.zeroCount);
        helper.write("positive numbers count=", counter.positiveCount);
    }
    
}
