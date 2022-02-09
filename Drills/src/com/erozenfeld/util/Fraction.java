/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.util;

/**
 *
 * @author Администратор
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Fraction(String value) {
        int slashIndex = value.indexOf("/");
        if (slashIndex != -1) {
            this.numerator = Integer.parseInt(value.substring(0, slashIndex));
            this.denominator = Integer.parseInt(value.substring(slashIndex + 1));
        }
    }
            
    public int getNumerator() {
        return numerator;
    }
    
    public void setNominator(int numerator) {
        this.numerator = numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
