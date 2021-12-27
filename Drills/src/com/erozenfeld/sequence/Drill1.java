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
public class Drill1 {
    private static double funcZ(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
    
    public static void main(String[] args) {
        InOutHelper helper  = new InOutHelper();
        double a = helper.readDouble("a=");
        double b = helper.readDouble("b=");
        double c = helper.readDouble("c=");
        helper.write("z=", funcZ(a, b, c));
    }
    
}
