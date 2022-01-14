/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.basics.selection;

import com.erozenfeld.util.InOutHelper;
import java.math.BigDecimal;

/**
 *
 * @author eugene30
 */



public class Drill3 {
  public static boolean isLine(double x1, double y1, double x2, double y2,
          double x3, double y3) {
      double k1 = (x3 - x1) * (y2 - y1);
      double k2 = (y3 - y1) * (x2 - x1);
      return k1 == k2;
  }
    
  public static void main(String[] args) {
      InOutHelper helper = new InOutHelper();
      double x1 = helper.readDouble("x1=");
      double y1 = helper.readDouble("y1=");
      double x2 = helper.readDouble("x2=");
      double y2 = helper.readDouble("y2=");
      double x3 = helper.readDouble("x3=");
      double y3 = helper.readDouble("y3=");
    
      if (isLine(x1, y1, x2, y2, x3, y3))
          helper.write("", "yes");
      else
          helper.write("", "no");
  }
}
