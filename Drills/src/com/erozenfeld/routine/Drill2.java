/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
 * натуральных чисел.
 */

public class Drill2 {
    private static int min(int[] numbers) {
        int result = numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            if (result > numbers[index]) {
                result = numbers[index];
            }
        }
        return result;
    }
    
    private static boolean equal(int[] numbers) {
        boolean result = true;
        for (int index = 1; index < numbers.length && result; index++) {
            result = (numbers[0] == numbers[index]);
        }        
        return result;
    }
    
    private static void dec(int[] numbers, int value) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > value) {
                numbers[index] -= value;
            }        
        }
    }
    
    private static int gcd(int[] numbers) {
        while (!equal(numbers)) {
            dec(numbers, min(numbers));
        }
        return numbers[0];
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        int[] numbers = helper.readIntArray("A[N]=", count);
        helper.write("НОД(A[N])=", gcd(numbers));
    }
}
