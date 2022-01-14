/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.basics.sequence;

import com.erozenfeld.util.InOutHelper;
import java.math.BigDecimal;

/**
 *
 * @author eugene30
 */
public class Drill4 {
    private static BigDecimal change(BigDecimal r) {
        BigDecimal intPart = new BigDecimal(r.toBigInteger());
        BigDecimal fracPart = r.subtract(intPart);
        return fracPart.movePointRight(fracPart.scale())
                .add(intPart.movePointLeft(intPart.precision()));
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        BigDecimal r = helper.readBigDecimal("r=");
        helper.write("change(r)=", change(r));
    }
    
}
