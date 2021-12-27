/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.util;

import java.util.Scanner;

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
    
    public void write(String prompt, double value) {
        System.out.println(prompt + value);
    }
    
}
