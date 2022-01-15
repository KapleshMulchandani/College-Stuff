//Q. Write a Java Program to create a long string and replace all the occurrence of 'an' with 'the'.

package com.byGaurav.assign1;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Gaurav Amarnani.
 */

public class ReplaceOccurrence {
    public static void main(String...args) {
        Scanner scanner = new Scanner(in);
        out.println("Enter a Paragraph: ");
        String input = scanner.nextLine();
        String updatedInput = input.replaceAll("an", "the");
        out.println(updatedInput);
    }
}
