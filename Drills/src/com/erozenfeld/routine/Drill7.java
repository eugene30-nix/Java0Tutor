/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
 * от 1 до 9
 */

public class Drill7 {
    private static int sum() {
        int result = 0;
        int fact = 1;
        for (int number = 1; number < 10; number++) {
            fact *= number;
            if (number % 2 == 1) {
                result += fact;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        helper.write("sum=", sum());
    }
}
