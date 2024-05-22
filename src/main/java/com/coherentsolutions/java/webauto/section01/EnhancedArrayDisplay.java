// File: com/coherentsolutions/java/webauto/section01/EnhancedArrayDisplay.java
package com.coherentsolutions.java.webauto.section01;

/**
 * Demonstrates enhanced ways to display array elements using for-each loop.
 */
public class EnhancedArrayDisplay {
    public static void main(String[] args) {
        // Array myList of 5 elements of type double.
        double[] myList = {2, 2.7, 3, 12, 23.8};

        // Displaying all elements using a for-each loop.
        System.out.print("All elements of the array myList: ");
        for (double element : myList) {
            System.out.print(element + ", ");
        }
    }
}
