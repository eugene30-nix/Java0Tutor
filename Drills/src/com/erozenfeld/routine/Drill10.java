/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */

public class Drill10 {
    private static int toIntArray(int number, int[] intArray) {
        int result = intArray.length - 1;
        while (number != 0) {
            int digit = number % 10;
            number = (number - digit) / 10;
            intArray[result] = digit;
            result--;
        }
        return result + 1;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int number = helper.readInt("n=");
        int[] intArray = new int[10];
        int startIndex = toIntArray(number, intArray);
        helper.write("Z(n)=", intArray, startIndex, 10);
    }
}
