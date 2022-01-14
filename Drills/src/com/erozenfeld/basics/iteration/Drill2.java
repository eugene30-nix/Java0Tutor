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
public class Drill2 {
    private static double funcY(double x) {
        double result;
        if (x <= 2D)
            result = -x;
        else 
            result = x;
        return result;                    
    }
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double a = helper.readDouble("a=");
        double b = helper.readDouble("b=");
        double h = helper.readDouble("h=");
        
        for (double x = a; x <= b; x += h) {
            helper.write("x=", x);
            helper.write("y=", funcY(x));
        }
    }
}
