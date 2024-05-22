// File: com/coherentsolutions/java/webauto/section01/AdvancedArrayDisplay.java
package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * Demonstrates more advanced array display techniques including formatted output.
 */
public class AdvancedArrayDisplay {
    public static void main(String[] args) {
        // Array myList of 5 elements of type double.
        double[] myList = {2, 2.7, 3, 12, 23.8};

        // Displaying elements with formatted output.
        System.out.print("Formatted elements of the array myList: ");
        for (double element : myList) {
            System.out.printf("%.2f, ", element);
        }
        System.out.println();

        // Displaying elements with their indices.
        System.out.println("Elements with their indices:");
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("Index %d: %.2f%n", i, myList[i]);
        }
    }
}
