/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только
 * нечетные цифры. Определить также, сколько четных цифр в найденной сумме.
 * Для решения задачи использовать декомпозицию.
 */

public class Drill16 {
    private static int initNumber(int count) {
        int result = 0;
        for (int position = 0; position < count; position++) {
            result = 10 * result + 1;
        }
        return result;
    }
    
    private static int nextNumber(int number) {
        int lastDigit = number % 10;
        if (1 <= lastDigit && lastDigit <= 7) {
            return number + 2;
        } else if (number / 10 > 0) {
            number = nextNumber(number / 10);
            if (number != -1) {
                return 10 * number + 1;
            }
        }
        return -1;
    }
    
    private static int sum(int count) {
        int result = 0;
        int number = initNumber(count);
        while (number != -1) {
            result += number;
            number = nextNumber(number);
        }
        return result;
    }
      
    private static int OddDigitCount(int number) {
        int result = 0;
        while (number != 0) {
            if ((number % 10) % 2 == 1) {
                result++;
            }
            number /= 10;
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("n=");
        int sigma = sum(count);
        helper.write("sum(n)=", sigma);
        helper.write("odc(sum(n))=", OddDigitCount(sigma));
    }
}
