/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.util;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;



/**
 *
 * @author eugene30
 */
public class InOutHelper {
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    
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
    
    public int[] randomIntArray(int count, int origin, int bound) {
        int[] result = new int[count];
        for (int index = 0; index < count; index++) {
            result[index] = random.nextInt(origin, bound);
        }
        return result;
    }
    
    public int[] readIntArray(String prompt, int count) {
        return readIntArray(prompt, count, count);
    }
    
    public int[] readIntArray(String prompt, int length, int count) {
        System.out.print(prompt);
        int[] result = new int[length];
        for (int index = 0; index < count; index++) {
            result[index] = scanner.nextInt();
        }
        return result;
    }
    
    public double[] randomDoubleArray(int count, double origin, double bound) {
        double[] result = new double[count];
        for (int index = 0; index < count; index++) {
            result[index] = random.nextDouble(origin, bound);
        }
        return result;
    }
        
    public double[] readDoubleArray(String prompt, int count) {
        return readDoubleArray(prompt, count, count);
    }
    
    public double[] readDoubleArray(String prompt, int length, int count) {
        System.out.print(prompt);
        double[] result = new double[length];
        for (int index = 0; index < count; index++)
            result[index] = scanner.nextDouble();
        return result;        
    }
    
    public Fraction[] readFractionArray(String prompt, int count) {
        return readFractionArray(prompt, count, count);
    }
    
    public Fraction[] readFractionArray(String prompt, int length, int count) {
        System.out.print(prompt);
        Fraction[] result = new Fraction[length];
        for (int index = 0; index < count; index++) {
            result[index] = new Fraction(scanner.next());
        }
        return result;
    }

    public Point2D[] readPointArray(String prompt, int count) {
        return readPointArray(prompt, count, count);
    }
    
    public Point2D[] readPointArray(String prompt, int length, int count) {
        System.out.print(prompt);
        Point2D[] result = new Point2D[length];
        for (int index = 0; index < count; index++) {
            result[index] = new Point2D(scanner.next());
        }
        return result;
    }

    public int[][] randomIntMatrix(int rowCount, int columnCount, int origin,
            int bound) {
        int[][] result = new int[rowCount][];
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            result[rowIndex] = randomIntArray(columnCount, origin, bound);
        }
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
    
    public double[][] randomDoubleMatrix(int rowCount, int columnCount,
            double origin, double bound) {
        double[][] result = new double[rowCount][];
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            result[rowIndex] = randomDoubleArray(columnCount, origin, bound);
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
        write(prompt, value, 0, value.length);
    }

    public void write(String prompt, int[] value, int startIndex,
            int finishIndex) {
        System.out.print(prompt);
        for (int index = startIndex; index < finishIndex; index++) {
            if (index > startIndex)
                System.out.print(" ");
            System.out.print(value[index]);
        }
        System.out.println("");        
    }
    
    public void write(String prompt, double[] value) {
        write(prompt, value, 0, value.length);
    }

    public void write(String prompt, double[] value, int startIndex,
            int finishIndex) {
        System.out.print(prompt);
        for (int index = startIndex; index < finishIndex; index++) {
            if (index > startIndex)
                System.out.print(" ");
            System.out.print(value[index]);
        }       
        System.out.println("");
    }
        
    public void write(String prompt, Fraction[] value) {
        write(prompt, value, 0, value.length);
    }
    
    public void write(String prompt, Fraction[] value, int startIndex,
            int finishIndex) {
        System.out.print(prompt);
        for (int index = startIndex; index < finishIndex; index++) {
            if (index > startIndex)
                System.out.print(" ");
            System.out.print(value[index]);
        }       
        System.out.println("");
    }

    public void write(String prompt, Point2D[] value) {
        write(prompt, value, 0, value.length);
    }
    
    public void write(String prompt, Point2D[] value, int startIndex,
            int finishIndex) {
        System.out.print(prompt);
        for (int index = startIndex; index < finishIndex; index++) {
            if (index > startIndex)
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

    public void write(String prompt, int[][] value, int columnIndex) {
        System.out.print(prompt);
        for (int rowIndex = 0; rowIndex < value.length; rowIndex++) {
            if (rowIndex > 0)
                System.out.print(" ");
            System.out.print(value[rowIndex][columnIndex]);
        }
        System.out.println("");
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
    public void write(String prompt, double[][] value, int columnIndex) {
        System.out.print(prompt);
        for (int rowIndex = 0; rowIndex < value.length; rowIndex++) {
            if (rowIndex > 0)
                System.out.print(" ");
            System.out.print(value[rowIndex][columnIndex]);
        }
        System.out.println("");
    }
}
