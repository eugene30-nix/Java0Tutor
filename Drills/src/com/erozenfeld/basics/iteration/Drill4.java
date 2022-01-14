/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.basics.iteration;

import com.erozenfeld.util.InOutHelper;
import java.math.BigInteger;

/**
 *
 * @author eugene30
 */
public class Drill4 {
    public static void main(String[] args) {
        BigInteger prod = BigInteger.ONE;
        for (int number = 1; number <= 200; number++)
            prod = prod.multiply(BigInteger.valueOf(number * number));
        InOutHelper helper = new InOutHelper();
        helper.write("prod=", prod);
    }
    
}
