/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.basics.sequence;

import com.erozenfeld.util.InOutHelper;

/**
 *
 * @author eugene30
 */
public class Drill5 {
    private static String format(int seconds) {
        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        return String.format("%02dч %02dмин %02dс", hours, minutes, seconds);
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int seconds = helper.readInt("T=");
        helper.write("T=", format(seconds));
    }
}
