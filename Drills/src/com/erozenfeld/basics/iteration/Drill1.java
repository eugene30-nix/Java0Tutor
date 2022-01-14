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
public class Drill1 {
    private static int sum(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++)
            result += i;
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int number = helper.readInt("n=");
        helper.write("s=", sum(number));
    }
}
