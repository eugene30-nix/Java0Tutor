/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно
 * простыми.
 */
public class Drill6 {
    private static int min(int valueA, int valueB, int valueC) {
        int result = valueA;
        if (valueB < result) {
            result = valueB;
        }
        if (valueC < result) {
            result = valueC;
        }
        return result;
    }
    
    private static boolean isCoprime(int valueA, int valueB, int valueC) {        
        while(!(valueA == valueB && valueB == valueC)) {
            int minValue = min(valueA, valueB, valueC);
            if (minValue < valueA) {
                valueA -= minValue;
            }
            if (minValue < valueB) {
                valueB -= minValue;
            }
            if (minValue < valueC) {
                valueC -= minValue;
            }
        }
        return valueA == 1;
    }
   
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int valueA = helper.readInt("a=");
        int valueB = helper.readInt("b=");
        int valueC = helper.readInt("c=");
        helper.write("coprime numbres: ", isCoprime(valueA, valueB, valueC));
    }
}
