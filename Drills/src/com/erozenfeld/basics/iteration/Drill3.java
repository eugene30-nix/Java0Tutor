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
public class Drill3 {
    
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 100; number++)
            sum += number * number;
        InOutHelper helper = new InOutHelper();
        helper.write("sum=", sum);
    }
}
