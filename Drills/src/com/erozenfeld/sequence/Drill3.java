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
public class Drill3 {
    private static double funcZ(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))
                * Math.tan(x * y);
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double x = helper.readDouble("x=");
        double y = helper.readDouble("y=");
        helper.write("z=", funcZ(x, y));                
    }
    
}
