// File: com/coherentsolutions/java/webauto/section03/SimplifiedInitializationExample.java
package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates simplified initialization of two-dimensional arrays in Java.
 */
public class SimplifiedInitializationExample {
    public static void main(String[] args) {
        // Simplified initialization at the time of declaration.
        int[][] matrixB = {
                {-9, 1, 0},
                {4, 1, 1},
                {-2, 2, -1}
        };

        // Printing the elements of the array.
        System.out.println("Elements of matrixB:");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
