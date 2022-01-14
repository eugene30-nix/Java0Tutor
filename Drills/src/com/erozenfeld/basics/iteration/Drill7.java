/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.basics.iteration;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author eugene30
 */
public class Drill7 {
    private static String divString(int number) {
        StringBuilder result = new StringBuilder();
        for (int n = 2; n < number; n++) {
            if (number % n == 0) {
                if (result.length() > 0)                        
                    result.append(", ");
                result.append(n);
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int m = helper.readInt("a=");
        int n = helper.readInt("n=");
        
        for (int number = m; number <= n; number++) {
            helper.write(number + " : ", divString(number));
        }
    }
}
