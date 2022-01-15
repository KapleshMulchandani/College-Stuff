//Q. Write a Java Program to Print the spiral Matrix of order 5.

package com.byGaurav.assign1;

import static java.lang.System.*;

/**
 * @author Gaurav Amarnani.
 */

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][]array = {{1,  2,  3,  4,  5},
                     {16, 17, 18, 19, 6},
                     {15, 24, 25, 20, 7},
                     {14, 23, 22, 21, 8},
                     {13, 12, 11, 10, 9}};

        int numberOfRows = 5;
        int numberOfColumns = 5;

        int firstRow = 0;
        int lastRow = numberOfRows - 1;
        int firstColumn = 0;
        int lastColumn = numberOfColumns - 1;

        for(int i = 0; i < numberOfRows; i++) {
            for(int j = 0; j < numberOfColumns; j++)
                out.print(array[i][j] + "\t");
            out.println();
        }

        out.println("\n\nThe output of the given Matrix in Spiral Order: \n");

        int count = 0;

        while((firstRow <= lastRow) && (firstColumn <= lastColumn)) {
            for(int i = firstColumn; i <= lastColumn; i++) {
                if(count < numberOfRows * numberOfColumns) {
                    count++;
                    out.print(array[firstRow][i] + " ");
                }
            }
            for(int i = firstRow+1; i <= lastRow; i++) {
                if(count < numberOfRows * numberOfColumns) {
                    count++;
                    out.print(array[i][lastColumn] + " ");
                }
            }
            for(int i = lastColumn-1; i >= firstColumn; i--) {
                if(count < numberOfRows * numberOfColumns) {
                    count++;
                    out.print(array[lastRow][i] + " ");
                }
            }
            for(int i = lastRow-1; i > firstRow; i--) {
                if(count < numberOfRows * numberOfColumns) {
                    count++;
                    out.print(array[i][firstColumn] + " ");
                }
            }
            firstRow++;
            firstColumn++;
            lastRow--;
            lastColumn--;
        }
        out.println();
    }
}
