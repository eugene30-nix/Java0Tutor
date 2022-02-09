/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.util;

/**
 *
 * @author Администратор
 */
public class Point2D {
    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point2D(String value) {
        int leftBracketIndex = value.indexOf("(");
        int commaIndex = value.indexOf(",", leftBracketIndex);
        int rightBracketIndex = value.indexOf(")", commaIndex);
        if (-1 < leftBracketIndex 
                && leftBracketIndex < commaIndex 
                && commaIndex < rightBracketIndex) {
            x = Double.parseDouble(value.substring(leftBracketIndex + 1,
                    commaIndex));
            y = Double.parseDouble(value.substring(commaIndex + 1,
                    rightBracketIndex));
        }
    }
    
    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
}
