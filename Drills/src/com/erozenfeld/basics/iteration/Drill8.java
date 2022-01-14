/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.basics.iteration;

import com.erozenfeld.util.InOutHelper;
import java.math.BigDecimal;

/**
 *
 * @author eugene30
 */
public class Drill8 {
    private static boolean hasDigit(int number, int digit) {
        boolean result = false;
                
        while (number > 0 && !result) {
            int numberDigit = number % 10;
            result = numberDigit == digit;
            number = (number - numberDigit) / 10;
        }
        
        return result;
    } 
    
    private static String commonDigits(int a, int b) {
        boolean[] flags = new boolean[10];
        
        for (int index = 0; index < 10; index++)
            flags[index] = false;

        while (a > 0) {
            int digit = a % 10;
            if (!flags[digit] && hasDigit(b, digit))
                flags[digit] = true;                
            a = (a - digit) / 10;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int index = 0; index < 10; index++) {
            if (flags[index]) {
                if (result.length() > 0)
                    result.append(", ");
                result.append(index);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {        
        InOutHelper helper = new InOutHelper();
        int a = helper.readInt("a=");
        int b = helper.readInt("b=");
        helper.write("common digits: ", commonDigits(a, b));
    }
    
}
