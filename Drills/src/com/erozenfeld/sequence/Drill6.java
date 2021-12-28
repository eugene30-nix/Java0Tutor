/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.sequence;

import com.erozenfeld.util.InOutHelper;
import java.math.BigDecimal;

/**
 *
 * @author eugene30
 */
public class Drill6 {
    public static boolean isExists(double x, double y) {
        return (-2D <= x && x <=2D && 0D <= y && y <= 4D) 
                || (-4D <= x && x <= 4D && -3D <= y && y <= 0D);
    }
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double x = helper.readDouble("x=");
        double y = helper.readDouble("y=");
        helper.write("E=", isExists(x, y));
    }
    
}
