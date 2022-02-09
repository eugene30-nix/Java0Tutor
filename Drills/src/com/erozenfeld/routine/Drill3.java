/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.InOutHelper;
import java.math.BigDecimal;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
 * вычисления площади треугольника.
 */
public class Drill3 {
    private static double regularTriangleArea(double sideLength) {
        return (Math.sqrt(3D) * sideLength * sideLength) / 4D;
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        double sideLength = helper.readDouble("a=");
        helper.write("S(a)=", 6D * regularTriangleArea(sideLength));
    }    
}
