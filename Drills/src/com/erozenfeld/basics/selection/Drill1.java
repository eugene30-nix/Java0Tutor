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
public class Drill1 {
    public static boolean isTriangle(double alpha, double beta) {
        return alpha > 0D && beta > 0D && alpha + beta < 180D;
    }
    
    public static boolean isRightTriangle(double  alpha, double beta) {
        return alpha == 90D || beta == 90D || alpha + beta == 90D;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double alpha = helper.readDouble("alpha=");
        double beta = helper.readDouble("beta=");
        boolean isTriangle = isTriangle(alpha, beta);

        helper.write("Is triangle: ", isTriangle);
        if (isTriangle)
            helper.write("Is right triangle: ", isRightTriangle(alpha, beta));
    }
}
