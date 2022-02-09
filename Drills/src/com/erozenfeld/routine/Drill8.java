/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; 
 * D[3] + D[4] + D[5]; D[4] + D[5] + D[6]. Пояснение. Составить метод(методы)
 * для вычисления суммы трех последовательно расположенных элементов массива 
 * с номерами от k до m.
 */

public class Drill8 {
    private static int sum3(int[] intArray, int startIndex) {
        return intArray[startIndex] 
                + intArray[startIndex + 1]
                + intArray[startIndex + 2];
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] intArray = helper.readIntArray("D[N]=", count);
        helper.write("D[1]+D[2]+D[3]=", sum3(intArray, 0));
        helper.write("D[3]+D[4]+D[5]=", sum3(intArray, 2));
        helper.write("D[4]+D[5]+D[6]=", sum3(intArray, 3));
    }
}
