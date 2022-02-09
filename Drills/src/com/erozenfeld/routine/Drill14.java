/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
 * числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class Drill14 {
    public static int fillDigits(int number, int[] digits) {
        int result = digits.length - 1;
        while (number != 0) {
            digits[result] = number % 10;
            number /= 10;
            result--;
        }
        return result + 1;
    }
    
    private static boolean isPpdi(int number) {
        int[] digits = new int[10];
        int startIndex = fillDigits(number, digits);
        int power = digits.length - startIndex;
        int sigma = 0;
        for (int index = startIndex; index < digits.length; index++) {
            sigma += Math.pow(digits[index], power);
        }
        return number == sigma;
    }
    
    private static int fillPpdi(int count, int[] ppdis) {
        int result = 0;
        for (int number = 1; number <= count; number++) {
            if (isPpdi(number)) {
                ppdis[result] = number;
                result++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("k=");
        // В десятичной системе существует всего 88 чисел Армстронга.
        int[] ppdis = new int[88];
        int finishIndex = fillPpdi(count, ppdis);
        helper.write("A[K]=", ppdis, 0, finishIndex);
    }
}
