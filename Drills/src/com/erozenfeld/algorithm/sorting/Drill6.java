/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.sorting;

import com.erozenfeld.util.InOutHelper;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
 * его по возрастанию. Делается это следующим образом: сравниваются два соседних
 * элемента a(i) и a(i+1). Если a(i) <= a(i+1), то продвигаются на один элемент
 * вперед. Если a(i) > a(i+1), то производится перестановка и сдвигаются на один
 * элемент назад. Составить алгоритм этой сортировки. 
 */

public class Drill6 {
    private static void sort(double[] doubleArray) {
        for (int index = 0; index < doubleArray.length - 1; ) {
            if (doubleArray[index] <= doubleArray[index + 1]) {
                index++;
            } else {
                double tempValue = doubleArray[index];
                doubleArray[index] = doubleArray[index + 1];
                doubleArray[index + 1] = tempValue;
                if (index > 0) {
                    index--;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        double[] doubleArray = helper.readDoubleArray("A[N]=", count);
        sort(doubleArray);
        helper.write("A[N]=", doubleArray);
    }
}
