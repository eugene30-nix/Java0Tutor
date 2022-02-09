/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.sorting;

import com.erozenfeld.util.InOutHelper;

/**
 * Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
 * Образовать из них новую последовательность чисел так, чтобы она тоже была
 * неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Drill2 {
    private static void shift(int[] array, int startIndex, int finishIndex) {
        for (int index = finishIndex - 1; index >= startIndex; index--) {
            array[index + 1] = array[index];
        }
    }
    
    private static void merge(int[] dstArray, int dstLength, 
            int[] srcArray, int srcLength) {
        for (int dstIndex = 0, srcIndex = 0, lstIndex = dstLength;
                dstIndex < dstLength + srcLength; dstIndex++) {
            if (dstIndex < lstIndex && srcIndex < srcLength) {
                if (dstArray[dstIndex] > srcArray[srcIndex]){
                    shift(dstArray, dstIndex, lstIndex);
                    dstArray[dstIndex] = srcArray[srcIndex];
                    srcIndex++;
                    lstIndex++;
                }
            } else if (srcIndex < srcLength) {
                dstArray[dstIndex] = srcArray[srcIndex];
                srcIndex++;
            }
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int lengthA = helper.readInt("Length(A)=");
        int lengthB = helper.readInt("Length(B)=");
        int[] arrayA = helper.readIntArray("A[N]=", lengthA + lengthB, lengthA);
        int[] arrayB = helper.readIntArray("B[N]=", lengthB);
        merge(arrayA, lengthA, arrayB, lengthB);
        helper.write("A[N]=", arrayA);
    }
    
}
