/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.selection;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author eugene30
 */
public class Drill2 {
    private static double min(double x, double y) {
        double result= x;
        if (y < result)
            result = y;
        return result;
    }
    
    private static double max(double x, double y) {
        double result = x;
        if (result < y)
            result = y;
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double a = helper.readDouble("a=");
        double b = helper.readDouble("b=");
        double c = helper.readDouble("c=");
        double d = helper.readDouble("d=");
        helper.write("max{min(a, b), min(c, d)}=", max(min(a, b), min(c, d)));
    }
}
