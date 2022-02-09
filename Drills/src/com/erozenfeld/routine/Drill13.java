/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга
 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка 
 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
 * использовать декомпозицию.
 */

public class Drill13 {
    private static int[] genPrimeNumbers(int startNumber, int finishNumber) {
        int length = finishNumber - startNumber + 1;
        int[] result = new int[length];
        
        for (int number = startNumber, index = 0; 
                number <= finishNumber; number++, index++) {
            result[index] = number;
        }
        
        for (int step = 2; step <= finishNumber / 2; step++) {
            for (int number = 2 * step; number <= finishNumber; number += step) {
                if (startNumber <= number && number <= finishNumber) {
                    result[number - startNumber] = 0;
                }
            }
        }
        
        return result;
    }
    
    private static void writeTwins(int[] primeNumbers, InOutHelper helper) {
        for (int index = 0; index < primeNumbers.length - 2; index++) {
            int number = primeNumbers[index];
            int nextNumber = primeNumbers[index + 2];
            if (number != 0 && nextNumber != 0) {
                helper.write("twins: ", "(" + number + ", " + nextNumber + ")");
            }
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int numberN = helper.readInt("n=");
        writeTwins(genPrimeNumbers(numberN, 2 * numberN), helper);
    }
}
