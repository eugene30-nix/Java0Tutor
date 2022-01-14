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
public class Drill5 {
    private static double sum(double e) {
        double result = 0;
        double s1 = 1/2D;
        double s2 = 1/3D;
        
        while (s1 + s2 > e) {
            result += s1 + s2;
            s1 /= 2D;
            s2 /= 3D;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double e = helper.readDouble("e=");
        helper.write("sum=", sum(e));
    }
}
