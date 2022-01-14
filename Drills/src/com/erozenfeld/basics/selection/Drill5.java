/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.basics.selection;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author eugene30
 */
public class Drill5 {
    public static double funcF(double x) {
        double result;
        if (x <= 3)
            result = x*x - 3*x + 9;
        else
            result = 1/(x*x*x + 6);
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double x = helper.readDouble("x=");
        helper.write("f(x)=", funcF(x));
    }
}
