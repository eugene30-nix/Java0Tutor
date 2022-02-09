/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его 
 * цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для
 * решения задачи использовать декомпозицию.
 */

public class Drill17 {
    private static int digitSum(int number) {
        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
    
    private static int actionCount(int number) {
        int result = 0;
        while (number != 0) {            
            number -= digitSum(number);
            result++;
        }
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int number = helper.readInt("n=");
        helper.write("ac(n)=", actionCount(number));
    }
}
