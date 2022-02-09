/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.algorithm.sorting;

import com.erozenfeld.util.Fraction;
import com.erozenfeld.util.InOutHelper;

/**
 * Даны дроби p1/q1, p2/q2,...,pn/qn (pi, qi - натуральные). Составить
 * программу, которая приводит эти дроби к общему знаменателю и упорядочивает их
 * в порядке возрастания.
 */

public class Drill8 {
    private static int gcd(int valueA, int valueB) {
        while (valueA != valueB) {
            if (valueA > valueB) {
                valueA -= valueB;
            } else {
                valueB -= valueA;
            }
        }
        return valueA;
    }
    
    private static int lcm(int valueA, int valueB) {
        return (valueA * valueB) / gcd(valueA, valueB);
    }
    
    private static Fraction[] reduction(Fraction[] fracArray) {
        int commonDenominator = 1;
        
        for (int index = 0; index < fracArray.length; index++) {
            commonDenominator = lcm(commonDenominator,
                    fracArray[index].getDenominator());
        }
        
        for (int index = 0; index < fracArray.length; index++) {
            Fraction value = fracArray[index];
            value.setNominator(value.getNumerator()
                    * (commonDenominator / value.getDenominator()));
            value.setDenominator(commonDenominator);
        }
        
        return fracArray;
    }
    
    private static Fraction[] sort(Fraction[] fracArray) {
        for (int indexI = 0; indexI < fracArray.length; indexI++) {
            for (int indexJ = fracArray.length - 1; indexJ > indexI; indexJ--) {
                if (fracArray[indexJ - 1].getNumerator() 
                        > fracArray[indexJ].getNumerator()) {
                    Fraction tempValue = fracArray[indexJ - 1];
                    fracArray[indexJ - 1] = fracArray[indexJ];
                    fracArray[indexJ] = tempValue;
                }
            }
        }
        return fracArray;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        Fraction[] fracArray = helper.readFractionArray("Z[N]=", count);
        sort(reduction(fracArray));
        helper.write("Z[N]=", fracArray);       
    }
}
