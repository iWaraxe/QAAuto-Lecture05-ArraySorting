// File: com/coherentsolutions/java/webauto/section02/SelectionSortExample.java
package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the Selection Sort algorithm in Java.
 */
public class SelectionSortExample {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    /**
     * Sorts an array using the selection sort algorithm.
     *
     * @param arr the array to be sorted
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
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
