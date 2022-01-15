//Q. Write a Java Program to calculate volume of cube, cuboid and sphere using interfaces.

package com.byGaurav.assign1;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Gaurav Amarnani.
 */

public class VolumeUsingInterface {
    public static void main(String...args) {
        takeInput();
    }

    public static void takeInput() {
        ImplementationClass implementationClass = new ImplementationClass();
        Scanner scanner = new Scanner(in);
        Integer choice = 0;
        Double volume;
        while(choice != 4) {
            out.println("\n1. Cube. \n2. Cuboid \n3. Sphere. \n4. Stop.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    out.println("Enter side for Cube: ");
                    volume = implementationClass.volume(scanner.nextDouble());
                    out.println("Volume of Cube = " + volume);
                    break;
                case 2:
                    out.println("Enter length for Cuboid: ");
                    double length = scanner.nextDouble();
                    out.println("Enter breadth for Cuboid: ");
                    double breadth = scanner.nextDouble();
                    out.println("Enter height for Cuboid: ");
                    double height = scanner.nextDouble();
                    volume = implementationClass.volume(length, breadth, height);
                    out.println("Volume of Cuboid = " + volume);
                    break;
                case 3:
                    out.println("Enter radius for Sphere: ");
                    volume = implementationClass.volume(scanner.nextInt());
                    out.println("Volume of Sphere = " + volume);
                    break;
                case 4:
                    break;
                default:
                    out.println("Please enter proper choice.");
                    main();
            }
        }
    }
}

interface Cube {
    Double volume(Double side);
}

interface Cuboid {
    Double volume(Double length, Double breadth, Double height);
}

interface Sphere {
    Double volume(Integer radius);
}

class ImplementationClass implements Cube, Cuboid, Sphere {

    @Override
    public Double volume(Double side) {
        return (side * side * side);
    }

    @Override
    public Double volume(Double length, Double breadth, Double height) {
        return (length * breadth * height);
    }

    @Override
    public Double volume(Integer radius) {
        return (double) ((4 / 3) * Math.PI * (radius * radius * radius));
    }
}