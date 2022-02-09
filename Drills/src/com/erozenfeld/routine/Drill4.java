/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erozenfeld.routine;

import com.erozenfeld.util.Point2D;
import com.erozenfeld.util.InOutHelper;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние. Указание. 
 * Координаты точек занести в массив.
 */

public class Drill4 {
    private static double distance(Point2D pointA, Point2D pointB) {
        double distanceX = pointA.getX() - pointB.getX();
        double distanceY = pointA.getY() - pointB.getY();
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }
    
    private static void max(Point2D[] inPoints, Point2D[] outPoints) {
        double maxDistance = 0D;
        for(int indexI = 0; indexI < inPoints.length; indexI++) {
            for (int indexJ = indexI + 1; indexJ < inPoints.length; indexJ++) {
                double currDistance = distance(inPoints[indexI],
                        inPoints[indexJ]);
                if (maxDistance < currDistance) {
                    maxDistance = currDistance;
                    outPoints[0] = inPoints[indexI];
                    outPoints[1] = inPoints[indexJ];
                }
            }
        }
    }
    
    public static void main(String[] args) {
        InOutHelper helper = new InOutHelper();
        int count = helper.readInt("N=");
        Point2D[] inPoints = helper.readPointArray("P[N]=", count);
        Point2D[] outPoints = new Point2D[2];
        max(inPoints, outPoints);
        helper.write("max distance between ", outPoints);
    }
}
