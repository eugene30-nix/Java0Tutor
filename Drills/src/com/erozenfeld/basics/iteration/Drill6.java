/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.basics.iteration;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author eugene30
 */
public class Drill6 {
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        
        for (char c = 0; c <= 0xffff; c++) {
            if (!Character.isISOControl(c))
                helper.write(Character.toString(c) + " : ", c);
        }
    }
    
}
