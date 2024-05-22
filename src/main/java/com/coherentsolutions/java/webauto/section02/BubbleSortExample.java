// File: com/coherentsolutions/java/webauto/section02/BubbleSortExample.java
package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the Bubble Sort algorithm in Java.
 */
public class BubbleSortExample {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    /**
     * Sorts an array using the bubble sort algorithm.
     *
     * @param arr the array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * Prints the elements of an array.
     *
     * @param arr the array to be printed
     */
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
