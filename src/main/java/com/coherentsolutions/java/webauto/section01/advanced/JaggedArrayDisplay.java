// File: com/coherentsolutions/java/webauto/section01/advanced/JaggedArrayDisplay.java
package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * Demonstrates how to display elements of a jagged array (an array of arrays with different lengths).
 */
public class JaggedArrayDisplay {
    public static void main(String[] args) {
        // Creating and initializing a jagged array.
        int[][] jaggedArray = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        // Displaying elements of the jagged array.
        System.out.println("Elements of the jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
