/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.sorting;

import com.erozenfeld.util.InOutHelper;

/**
 * Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.
 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и 
 * ставится на первое место, а первый - на место наибольшего. Затем, начиная со 
 * второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
 */

public class Drill3 {
    private static int findMaxIndex(int[] intArray, int startIndex) {
        int result = startIndex;
        for (int index = startIndex; index < intArray.length; index++) {
            if (intArray[result] < intArray[index]) {
                result = index;
            }
        }
        return result;
    }
    
    private static void sort(int[] intArray) {
        for (int index = 0; index < intArray.length; index++) {
            int maxIndex = findMaxIndex(intArray, index);
            int tempValue = intArray[index];
            intArray[index] = intArray[maxIndex];
            intArray[maxIndex] = tempValue;
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("A[N]=", count);
        sort(intArray);
        helper.write("A[N]=", intArray);        
    }    
}
