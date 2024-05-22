### Selection Sort

**Explanation:**
Selection Sort is an in-place comparison sorting algorithm. It divides the input list into two parts: a sorted sublist of items which is built up from left to right at the front (left) of the list and a sublist of the remaining unsorted items. Initially, the sorted sublist is empty, and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on the sorting order) element in the unsorted sublist, swapping it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.

**Steps:**
1. Start with the first element as the minimum.
2. Compare this minimum with the second element. If the second element is smaller, update the minimum.
3. Continue this process for the entire array.
4. Swap the first element with the minimum element found.
5. Repeat the process for the next element.

**Code:**
```java
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
```

### Bubble Sort

**Explanation:**
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm gets its name because smaller elements "bubble" to the top of the list.

**Steps:**
1. Compare the first two elements. If the first is greater than the second, swap them.
2. Move to the next pair of elements, compare them, and swap if necessary.
3. Continue this process for the entire array.
4. The largest element will move to the end of the array after the first pass.
5. Repeat the process, excluding the last sorted element, until the entire array is sorted.

**Code:**
```java
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
```

### Insertion Sort

**Explanation:**
Insertion Sort is a simple and efficient comparison sort. It builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. Insertion Sort is more efficient in practice compared to other quadratic sorting algorithms such as bubble sort and selection sort.

**Steps:**
1. Assume the first element is already sorted.
2. Take the next element and compare it with the elements in the sorted part.
3. Insert the element in the correct position by shifting the sorted elements if needed.
4. Repeat the process for all elements.

**Code:**
```java
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
```

### Merge Sort

**Explanation:**
Merge Sort is an efficient, stable, comparison-based, divide and conquer sorting algorithm. Most implementations produce a stable sort, meaning that the implementation preserves the input order of equal elements in the sorted output. Merge Sort is a recursive algorithm that continuously splits the array in half until it cannot be split anymore, i.e., the subarray has only one element. Then, it merges the smaller arrays into new sorted arrays.

**Steps:**
1. Divide the unsorted array into n subarrays, each containing one element (a single element is considered sorted).
2. Repeatedly merge subarrays to produce new sorted subarrays until there is only one subarray remaining.

**Code:**
```java
public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }
}

public static void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; ++i)
        L[i] = arr[left + i];
    for (int j = 0; j < n2; ++j)
        R[j] = arr[mid + 1 + j];

    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}
```

These explanations and code examples provide a thorough understanding of each sorting algorithm, their mechanisms, and their implementations in Java.