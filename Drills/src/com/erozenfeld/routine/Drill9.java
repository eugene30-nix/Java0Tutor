/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) 
 * вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

public class Drill9 {
    private static double triangleArea(double lengthA, double lengthB,
            double lengthC) {
        double hp = (lengthA + lengthB + lengthC) / 2D;
        return Math.sqrt(hp * (hp - lengthA) * (hp - lengthB) * (hp - lengthC));
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double lengthX = helper.readDouble("x=");
        double lengthY = helper.readDouble("y=");
        double lengthZ = helper.readDouble("z=");
        double lengthT = helper.readDouble("t=");
        double lengthD = Math.sqrt(lengthX * lengthX + lengthY * lengthY);
        helper.write("S=", triangleArea(lengthX, lengthY, lengthD)
                + triangleArea(lengthZ, lengthT, lengthD));
    }
}
