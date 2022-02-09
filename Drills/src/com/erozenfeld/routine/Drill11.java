/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше
 * цифр.
 */

public class Drill11 {
    private static int compare(int numberA, int numberB) {
        while(numberA != 0 && numberB != 0) {
            numberA /= 10;
            numberB /= 10;
        }
        
        if (numberA != 0) {
            return 1;
        } else if (numberB != 0) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int numberA = helper.readInt("a=");
        int numberB = helper.readInt("b=");
        helper.write("compare(a, b)=", compare(numberA, numberB));
    }
}
