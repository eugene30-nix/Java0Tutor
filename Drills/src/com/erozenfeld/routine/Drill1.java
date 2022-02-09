/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел.
 */
public class Drill1 {
    private static int gcd(int valueA, int valueB) {
        while (valueA != valueB) {
            if (valueA < valueB) {
                valueB -= valueA;
            } else {
                valueA -= valueB;
            }
        }
        return valueA;
    }
    
    private static int lcm(int valueA, int valueB) {
        return (valueA * valueB) / gcd(valueA, valueB);
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int valueA = helper.readInt("A=");
        int valueB = helper.readInt("B=");
        helper.write("НОД(A, B)=", gcd(valueA, valueB));
        helper.write("НОK(A, B)=", lcm(valueA, valueB));
    }
}
