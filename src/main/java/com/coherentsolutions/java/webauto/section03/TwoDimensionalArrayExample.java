// File: com/coherentsolutions/java/webauto/section03/TwoDimensionalArrayExample.java
package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates the creation and usage of two-dimensional arrays in Java.
 */
public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        // Creating a two-dimensional array of size 2x3.
        int[][] matrixA;
        matrixA = new int[2][3];

        // Initializing the array with values.
        matrixA[0][0] = 1;
        matrixA[0][1] = -2;
        matrixA[0][2] = 3;
        matrixA[1][0] = 4;
        matrixA[1][1] = 1;
        matrixA[1][2] = 7;

        // Printing the elements of the array.
        System.out.println("Elements of matrixA:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
