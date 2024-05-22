// File: com/coherentsolutions/java/webauto/section03/FixedSizeMultidimensionalArrays.java
package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates the creation of fixed-size multidimensional arrays in Java.
 */
public class FixedSizeMultidimensionalArrays {
    public static void main(String[] args) {
        // Examples of creating fixed-length arrays.
        int[][] a = new int[5][5]; // two-dimensional array
        int[][][] b = new int[3][4][5]; // three-dimensional array
        int[][][][] c = new int[2][4][5][5]; // four-dimensional array

        // Printing a sample element from each array.
        System.out.println("Sample elements from multidimensional arrays:");
        System.out.println("a[0][0]: " + a[0][0]);
        System.out.println("b[0][0][0]: " + b[0][0][0]);
        System.out.println("c[0][0][0][0]: " + c[0][0][0][0]);
    }
}
