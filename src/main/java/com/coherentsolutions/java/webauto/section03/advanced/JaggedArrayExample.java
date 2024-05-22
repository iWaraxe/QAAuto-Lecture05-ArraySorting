// File: com/coherentsolutions/java/webauto/section03/advanced/JaggedArrayExample.java
package com.coherentsolutions.java.webauto.section03.advanced;

/**
 * Demonstrates the creation and usage of jagged arrays in Java.
 */
public class JaggedArrayExample {
    public static void main(String[] args) {
        // Creating and initializing a jagged array.
        int[][] jaggedArray = {
                {2, 50, 30, 40},
                {1, 25, 65, 50},
                {1}
        };

        // Printing the elements of the jagged array.
        System.out.println("Elements of the jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Accessing and printing a specific element.
        System.out.println("Element jaggedArray[1][3]: " + jaggedArray[1][3]);
    }
}
