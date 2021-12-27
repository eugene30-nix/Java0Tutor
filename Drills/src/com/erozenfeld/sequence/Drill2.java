/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.sequence;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author eugene30
 */

public class Drill2 {
    private static double funcZ(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2.0) + 4 * a * c)) / (2 * a) 
                - Math.pow(a, 3.0) * c 
                + Math.pow(b, -2.0);
    }
    
    public static void main(String[] agrs) {
        InOutHelper helper = new InOutHelper();
        double a = helper.readDouble("a=");
        double b = helper.readDouble("b=");
        double c = helper.readDouble("c=");
        helper.write("z=", funcZ(a, b, c));
    }
    
}
