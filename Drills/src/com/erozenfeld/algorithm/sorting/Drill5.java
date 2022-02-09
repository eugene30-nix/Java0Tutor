/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.sorting;

import com.erozenfeld.util.InOutHelper;

/**
 * Сортировка вставками. Дана последовательность чисел a1, a2,..,an. Требуется
 * переставить числа в порядке возрастания. Делается это следующим образом.
 * Пустьa a1, a2,...,ai - упорядоченная последовательность,
 * т. е. a1 <= a2 <= ... <= ai. Берется следующее число a(i+1) и вставляется в
 * последовательность так, чтобы новая последовательность была тоже
 * возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в
 * отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
 * оформить в виде отдельной функции.
 */

public class Drill5 {
    private static void shift(int[] intArray, int length, int startIndex) {
        for (int index = length - 1; index > startIndex; index--) {
            intArray[index + 1] = intArray[index];
        }
    }
    private static int binarySearch(int[] intArray, int length, int value) {
        if (value <= intArray[0]) {
            return -1;
        } else if (value > intArray[length - 1]) {
            return length - 1;
        } else {
            int startIndex = 0;
            int finishIndex = length - 1;
            while (finishIndex - startIndex > 1) {
                int probeIndex = (finishIndex + startIndex) / 2;
                if (value <= intArray[probeIndex]) {
                    finishIndex = probeIndex;
                } else {
                    startIndex = probeIndex;
                }
            }
            return startIndex;
        }
    }
    
    private static void sort(int[] intArray) {
        for (int index = 1; index < intArray.length; index++) {
            int value = intArray[index];
            int valueIndex = binarySearch(intArray, index, value);
            if (valueIndex + 1 < index) {
                shift(intArray, index, valueIndex);
                intArray[valueIndex + 1] = value;
            }
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
