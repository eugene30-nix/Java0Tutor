/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.sorting;

import com.erozenfeld.util.InOutHelper;

/**
 * Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.
 * Требуется переставить числа в порядке возрастания. Для этого сравниваются два 
 * соседних числа a(i) и a(i+1). Если a(i) > a(i+1), то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в
 * порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом 
 * количества перестановок.
 */

public class Drill4 {
    private static int sort(int[] intArray) {
        int result = 0;
        for (int indexI = 0; indexI < intArray.length; indexI++) {
            for (int indexJ = intArray.length - 1; indexJ > indexI; indexJ--) {
                if (intArray[indexJ] < intArray[indexJ - 1]) {
                    int tempValue = intArray[indexJ];
                    intArray[indexJ] = intArray[indexJ - 1];
                    intArray[indexJ - 1] = tempValue;
                    result++;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("A[N]=", count);
        int changeCount = sort(intArray);
        helper.write("A[N]=", intArray);
        helper.write("changeCount=", changeCount);
    }    
}
