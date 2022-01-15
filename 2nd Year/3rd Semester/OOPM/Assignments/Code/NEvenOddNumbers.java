//Q. Write a Java Program to print first n even and odd nos. Take the value of n from the keyboard via command line argument.

package com.byGaurav.assign1;

import static java.lang.System.*;

/**
 * @author Gaurav Amarnani.
 */

public class NEvenOddNumbers {
    public static void main(String...args) {
        printNEvenOddNumber(args);
    }

    public static void printNEvenOddNumber(String ... commandLineArgument) {
        Integer nNumber = Integer.valueOf(commandLineArgument[0]);

        out.println("Even Numbers: ");
        for(int i = 0; i < nNumber; i++)
            if(i % 2 == 0)
                out.println(i);

        out.println("Odd Numbers: ");
        for(int i = 0; i < nNumber; i++)
            if(i % 2 != 0)
                out.println(i);
    }
}
