// File: com/coherentsolutions/java/webauto/section01/MultidimensionalArrayDisplay.java
package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * Demonstrates how to display elements of a multidimensional array.
 */
public class MultidimensionalArrayDisplay {
    public static void main(String[] args) {
        // Creating and initializing a 2D array.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Displaying elements of the 2D array.
        System.out.println("Elements of the 2D array matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
