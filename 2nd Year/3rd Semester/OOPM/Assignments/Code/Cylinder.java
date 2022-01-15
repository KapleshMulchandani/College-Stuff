// Q. Write a Java Program to calculate total surface area and volume of the cylinder.

package com.byGaurav.assign1;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author  Gaurav Amarnani.
 */

public class Cylinder {

    private static final Double PI_VALUE = Math.PI;

    public static void main(String...args) {
        calculateSurfaceAreaAndVolume();
    }

    public static void calculateSurfaceAreaAndVolume() {
        Scanner scanner = new Scanner(in);
        out.println("Please enter the Radius of the Cylinder:");
        Double radius = scanner.nextDouble();
        out.println("Please enter the Height of the Cylinder:");
        Double height = scanner.nextDouble();

        Double surfaceArea = 2 * PI_VALUE * radius * (radius + height);
        Double volume = PI_VALUE * radius * radius * height;

        out.format("Cylinder Surface Area of the provided Radius and Height = %.2f", surfaceArea);
        out.format("\nCylinder Volume of provided Radius and Height = %.2f", volume);
    }
}
