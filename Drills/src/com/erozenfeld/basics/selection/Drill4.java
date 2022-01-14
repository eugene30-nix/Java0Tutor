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
import java.math.BigDecimal;
public class Drill4 {
    private static boolean isPassThrough(double holeLength, double holeBreadth,
            double sideLength, double sideBreadth) {
        return (holeLength >= sideLength && holeBreadth >= sideBreadth)
                || (holeLength >= sideBreadth && holeBreadth >= sideLength);
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double holeLength = helper.readDouble("A=");
        double holeBreadth = helper.readDouble("B=");
        double brickLength = helper.readDouble("x=");
        double brickBreadth = helper.readDouble("y=");
        double brickHeight = helper.readDouble("z=");
        
        if (isPassThrough(holeLength, holeBreadth, brickLength, brickBreadth)
                || isPassThrough(holeLength, holeBreadth, brickBreadth, brickHeight)
                || isPassThrough(holeLength, holeBreadth, brickBreadth, brickHeight))
            helper.write("", "yes");
        else
            helper.write("", "no");
                
    }
}
