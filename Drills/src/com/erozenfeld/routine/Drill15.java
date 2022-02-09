/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго
 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
 * использовать декомпозицию.
 */

public class Drill15 {
    private static int initNumber(int count) {
        int result = 0;
        for (int digit = 1; digit <= count; digit++) {
            result = 10 * result + digit;
        }
        return result;
    }
    
    private static int nextNumber(int number, int position) {
        int lastDigit = number % 10;
        if (0 < lastDigit && lastDigit < 9 - position) {            
            return number + 1;
        } else if (number / 10 > 0) {
            number = nextNumber(number / 10, position + 1);
            if (number != -1) {
                lastDigit = nextNumber(number % 10, position);
                if (lastDigit != -1) {
                    return 10 * number + lastDigit;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("n=");
        int number = initNumber(count);
        while (number != -1) {
            helper.write("number: ", number);
            number = nextNumber(number, 0);
        }
    }
}
