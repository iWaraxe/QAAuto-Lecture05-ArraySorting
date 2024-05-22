// File: com/coherentsolutions/java/webauto/section01/Test.java
package com.coherentsolutions.java.webauto.section01;

/**
 * Demonstrates how to display even and odd elements of an array in Java.
 */
public class Test {
    public static void main(String[] args) {
        // Array myList of 5 elements of type double.
        double[] myList = {2, 2.7, 3, 12, 23.8};

        // Displaying even elements of the array.
        System.out.print("Even elements of the array myList: ");
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 == 0) {
                System.out.print(myList[i] + ", ");
            }
        }

        // Displaying odd elements of the array.
        System.out.print("\nOdd elements of the array myList: ");
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 != 0) {
                System.out.print(myList[i] + ", ");
            }
        }
    }
}
