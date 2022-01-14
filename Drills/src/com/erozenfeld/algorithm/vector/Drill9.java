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
public class Drill9 {
    private static int maxFreq(int[] intArray) {
        int mfValue = intArray[0];
        int mfCount = 1;
        
        for (int value : intArray) {
            int count = 0;
            
            for (int index = 0; index < intArray.length; index++) {
                if (value == intArray[index])
                    count++;
            }
            
            if ((mfCount < count) || (mfCount == count && mfValue > value)) {
                mfValue = value;
                mfCount = count;
            }
        }
        
        return mfValue;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("A[N]=", count);
        helper.write("maxFreq=", maxFreq(intArray));
    }
}
