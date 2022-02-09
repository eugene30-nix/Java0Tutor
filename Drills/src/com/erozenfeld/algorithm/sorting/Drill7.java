/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.sorting;

import com.erozenfeld.util.InOutHelper;

/**
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm. Требуется указать те места, на 
 * которые нужно вставлять элементы последовательности b1 <= b2 <=...<= bm в 
 * первую последовательность так, чтобы новая последовательность оставалась
 * возрастающей.
 */

public class Drill7 {
    private static int[] merge(double[] arrayA, double[] arrayB) {
        int[] result = new int[arrayB.length];
        for (int index = 0, indexA = 0, indexB = 0; 
                index < arrayA.length + arrayB.length; index++) {
            if (indexA < arrayA.length && indexB < arrayB.length) {
                if (arrayA[indexA] > arrayB[indexB]) {
                    result[indexB] = index + 1;
                    indexB++;
                } else {
                    indexA++;
                }
            } else if (indexB < arrayB.length) {
                result[indexB] = index + 1;
                indexB++;
            } else {
                indexA++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int countA = helper.readInt("N=");
        double[] arrayA = helper.readDoubleArray("A[N]=", countA);
        int countB = helper.readInt("M=");
        double[] arrayB = helper.readDoubleArray("B[M]=", countB);
        int[] indexes = merge(arrayA, arrayB);
        helper.write("I[M]=", indexes);
    }
}
