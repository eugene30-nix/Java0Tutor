/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не 
 * большее N.
 */
public class Drill12 {
    private static int sumDigits(int number) {
        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
    
    private static int fill(int numberK, int numberN, int[] arrayA) {
        int result = 0;
        for (int number = 1; number <= numberN; number++) {
            if (sumDigits(number) == numberK) {
                arrayA[result] = number;
                result++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int numberK = helper.readInt("k=");
        int numberN = helper.readInt("n=");
        int[] arrayA = new int[numberN];
        int finishIndex = fill(numberK, numberN, arrayA);
        helper.write("A[N]=", arrayA, 0, finishIndex);
    }
}
