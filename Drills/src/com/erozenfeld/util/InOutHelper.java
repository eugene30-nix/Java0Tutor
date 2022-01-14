/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.util;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;



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
    
    public int[] readIntArray(String prompt, int count) {
        System.out.print(prompt);
        int[] result = new int[count];
        for (int index = 0; index < count; index++)
            result[index] = scanner.nextInt();
        return result;
    }
    
    public double[] readDoubleArray(String prompt, int count) {
        System.out.print(prompt);
        double[] result = new double[count];
        for (int index = 0; index < count; index++)
            result[index] = scanner.nextDouble();
        return result;
    }
    
    public int[][] readIntMatrix(String prompt, int rowCount, int columnCount) {
        System.out.println(prompt);
        int[][] result = new int[rowCount][columnCount];
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
                result[rowIndex][columnIndex] = scanner.nextInt();
            }
        }
        return result;
    }
    
    public double[][] readDoubleMatrix(String prompt, int rowCount, int columnCount) {
        System.out.println(prompt);
        double[][] result = new double[rowCount][columnCount];
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
                result[rowIndex][columnIndex] = scanner.nextDouble();
            }
        }
        return result;
    }
    
    public void write(String prompt, double value) {
        System.out.println(prompt + value);
    }
    
    public void write(String prompt, BigDecimal value) {
        System.out.println(prompt + value);
    }
    
    public void write(String prompt, BigInteger value) {
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
    
    public void write(String prompt, int[] value) {
        System.out.print(prompt);
        for (int index = 0; index < value.length; index++) {
            if (index > 0)
                System.out.print(" ");
            System.out.print(value[index]);
        }
        System.out.println("");
    }

    public void write(String prompt, double[] value) {
        System.out.print(prompt);
        for (int index = 0; index < value.length; index++) {
            if (index > 0)
                System.out.print(" ");
            System.out.print(value[index]);
        }       
        System.out.println("");
    }
    
    public void write(String prompt, int[][] value) {
        System.out.println(prompt);
        for (int rowIndex = 0; rowIndex < value.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < value[rowIndex].length; columnIndex++) {
                if (columnIndex > 0)
                    System.out.print(" ");
                System.out.print(value[rowIndex][columnIndex]);
            }
            System.out.println("");
        }
    }

    public void write(String prompt, double[][] value) {
        System.out.println(prompt);
        for (int rowIndex = 0; rowIndex < value.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < value[rowIndex].length; columnIndex++) {
                if (columnIndex > 0)
                    System.out.print(" ");
                System.out.print(value[rowIndex][columnIndex]);
            }
            System.out.println("");
        }
    }
}
