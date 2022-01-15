//Q. Write a Java Program to calculate the hypotenuse of a right angled triangle when other sides of the triangle are given.

package com.byGaurav.assign1;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Gaurav Amarnani.
 */

public class Hypotenuse {
    public static void main(String...args) {
        calculateHypotenuse();
    }

    public static void calculateHypotenuse() {
        Scanner scanner = new Scanner(in);
        out.println("Enter the value of Adjacent Side: ");
        Double adjacentSide = scanner.nextDouble();
        out.println("Enter the value of Opposite Side: ");
        Double oppositeSide = scanner.nextDouble();

        Double hypotenuse = Math.sqrt((adjacentSide * adjacentSide) + (oppositeSide * oppositeSide));
        out.format("Hypotenuse of Triangle with sides %.2f and %.2f is %.2f", adjacentSide, oppositeSide, hypotenuse);
    }
}
