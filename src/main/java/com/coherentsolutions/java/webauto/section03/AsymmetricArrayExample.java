// File: com/coherentsolutions/java/webauto/section03/AsymmetricArrayExample.java
package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates the creation and usage of asymmetric arrays in Java.
 */
public class AsymmetricArrayExample {
    public static void main(String[] args) {
        // Creating a two-dimensional array with only the first dimension specified.
        int[][] a1 = new int[5][];

        // Defining the number of elements in each row.
        a1[0] = new int[1];
        a1[1] = new int[2];
        a1[2] = new int[3];
        a1[3] = new int[4];
        a1[4] = new int[5];

        // Initializing the array with values.
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = i + j;
            }
        }

        // Printing the elements of the array.
        System.out.println("Elements of the asymmetric array a1:");
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
