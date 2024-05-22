// File: com/coherentsolutions/java/webauto/section02/advanced/InsertionSortExample.java
package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Demonstrates the Insertion Sort algorithm in Java.
 */
public class InsertionSortExample {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Original array:");
        printArray(array);

        insertionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    /**
     * Sorts an array using the insertion sort algorithm.
     *
     * @param arr the array to be sorted
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
