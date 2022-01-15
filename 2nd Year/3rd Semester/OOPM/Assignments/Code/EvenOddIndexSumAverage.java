//Q. Write a Java Program to find sum and average of numbers on even and odd indexes in the array entered by the user.

package com.byGaurav.assign1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Gaurav Amarnani.
 */

public class EvenOddIndexSumAverage {

    private static ArrayList<Integer> listOfNumbers;
    private static Scanner scanner;

    public static void main(String...args) {
        takeInputOfArray();
        findSumAndAverageOfEvenOddIndexes();
    }

    public static void takeInputOfArray() {
        listOfNumbers = new ArrayList<>();
        scanner = new Scanner(in);
        out.println("Enter elements of Array. If you want to stop enter any alphabet.");

        while (scanner.hasNextInt()) {
            listOfNumbers.add(scanner.nextInt());
        }
    }

    public static void findSumAndAverageOfEvenOddIndexes() {
        Integer sumOfEvenIndexes = 0, sumOfOddIndexes = 0, sizeOfEvenIndexes = 0, sizeOfOddIndexes = 0, averageOfEvenIndexes = 0, averageOfOddIndexes = 0;

        for(int i = 0; i < listOfNumbers.size(); i++) {
            if (i % 2 == 0) {
                sumOfEvenIndexes += listOfNumbers.get(i);
                sizeOfEvenIndexes++;
            } else {
                sumOfOddIndexes += listOfNumbers.get(i);
                sizeOfOddIndexes++;
            }
        }

        averageOfEvenIndexes = sumOfEvenIndexes / sizeOfEvenIndexes;
        averageOfOddIndexes = sumOfOddIndexes / sizeOfOddIndexes;

        out.println("Even Indexes: \nSum = " + sumOfEvenIndexes + " and Average = " + averageOfEvenIndexes);
        out.println("Odd Indexes: \nSum = " + sumOfOddIndexes + " and Average = " + averageOfOddIndexes);
    }
}
