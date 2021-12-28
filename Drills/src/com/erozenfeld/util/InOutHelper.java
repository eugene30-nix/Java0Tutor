/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.util;

import java.util.Scanner;
import java.math.BigDecimal;



/**
 *
 * @author eugene30
 */
public class InOutHelper {
    private final Scanner scanner = new Scanner(System.in);
    
    public double readDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    
    public BigDecimal readBigDecimal(String prompt) {
        System.out.print(prompt);
        return new BigDecimal(scanner.next());
    }
    
    public int readInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    public void write(String prompt, double value) {
        System.out.println(prompt + value);
    }
    
    public void write(String prompt, BigDecimal value) {
        System.out.println(prompt + value);
    }
    
    public void write(String prompt, int value) {
        System.out.println(prompt + value);
    }
    
    public void write(String prompt, String value) {
        System.out.println(prompt + value);
    }

    public void write(String prompt, boolean value) {
        System.out.println(prompt + value);
    }
}
