/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.sorting;

import com.erozenfeld.util.InOutHelper;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное 
 * число k. Объединить их в один массив, включив второй массив между k-м и
 * (k+1) - м элементами первого, при этом не используя дополнительный массив.
 */

public class Drill1 {
    private static void shift(int[] array, int startIndex, int finishIndex) {
        for (int srcIndex = finishIndex - 1, dstIndex = array.length - 1; 
                srcIndex > startIndex; srcIndex--, dstIndex--) {
            array[dstIndex] = array[srcIndex];
        }
    }
    
    private static void merge(int[] dstArray, int[] srcArray, int startIndex) {
        for (int srcIndex = 0, dstIndex = startIndex + 1; 
                srcIndex < srcArray.length; srcIndex++, dstIndex++) {
            dstArray[dstIndex] = srcArray[srcIndex];
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int lengthA = helper.readInt("Length(A)=");
        int lengthB = helper.readInt("Length(B)=");
        int startIndex = helper.readInt("K=") - 1;
        int[] arrayA = helper.readIntArray("A[N]=", lengthA + lengthB, lengthA);
        int[] arrayB = helper.readIntArray("B[N]=", lengthB, lengthB);
        shift(arrayA, startIndex, lengthA);
        merge(arrayA, arrayB, startIndex);
        helper.write("A[N]=", arrayA);
    }    
}
