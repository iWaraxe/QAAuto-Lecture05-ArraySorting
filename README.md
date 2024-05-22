# Java - Arrays, Sorting, and Multidimensional Arrays

## Example: Displaying Even and Odd Elements of an Array

In this example, we demonstrate how to display even and odd elements of an array in Java.

```java
public class Test {
    public static void main(String[] args) {
        // Array myList of 5 elements of type double.
        double[] myList = {2, 2.7, 3, 12, 23.8};

        // Displaying even elements of the array.
        System.out.print("Even elements of the array myList: ");
        for (int i = 0; i < myList.length; i++) {
            if(myList[i] % 2 == 0) {
                System.out.print(myList[i] + ", ");
            }
        }

        // Displaying odd elements of the array.
        System.out.print("\nOdd elements of the array myList: ");
        for (int i = 0; i < myList.length; i++) {
            if(myList[i] % 2 != 0) {
                System.out.print(myList[i] + ", ");
            }
        }
    }
}
```

## Selection Sort in Java

The idea is simple: with each pass, select the smallest element and move it to the beginning. Each new pass starts from the next element, shifting to the right. This looks as follows:

### Implementation of Selection Sort in Java

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

## Bubble Sort in Java

The algorithm traverses the array from start to end, comparing adjacent elements. If the elements are in the wrong order, they are swapped. Thus, after the first pass, the largest element is at the end of the array (for ascending order). This process is repeated, placing the next largest element at the penultimate position, and so on. The smallest element gradually moves to the beginning of the array, "bubbling" to its correct position like a bubble in water.

### Implementation of Bubble Sort in Java (Ascending Order)

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

Since we use a nested loop, the complexity of our algorithm increases. For `n` elements, it becomes `n * n`, i.e., `O(n^2)`. This complexity is called quadratic. We cannot know exactly how many iterations are needed. The complexity measure indicates the trend of growth in complexity, representing the worst-case scenario. It shows how much the runtime will increase with changes in the number of elements `n`.

## Multidimensional Arrays in Java

Let's create a two-dimensional array of this size:

```java
int[][] matrixA;
matrixA = new int[2][3];
```

We use a simplified initialization method at the time of declaration, similar to one-dimensional arrays.

```java
int[][] matrixB = {
    {-9, 1, 0},
    {4, 1, 1},
    {-2, 2, -1}
};
```

To access the elements of a two-dimensional array, two indices are required: the first for the row and the second for the column. As with one-dimensional arrays, indices also start from zero. Thus, the numbering of rows and columns in the table starts from 0.

```java
matrixA[0][0] = 1;
matrixA[0][1] = -2;
matrixA[0][2] = 3;
matrixA[1][0] = 4;
matrixA[1][1] = 1;
matrixA[1][2] = 7;
```

To print the matrix to the console, we need to traverse all the elements using two loops. The number of loops is equal to the array's dimension. In our case, the first loop iterates over the rows, and the second over the columns.

```java
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(matrixA[i][j] + "\t");
    }
    System.out.println();
}
```

## Multidimensional and Asymmetric Arrays

Multidimensional arrays in Java are created similarly. The number of square brackets indicates the dimension.

Examples of creating fixed-length arrays:

```java
int[][] a = new int[5][5]; // two-dimensional array
int[][][] b = new int[3][4][5]; // three-dimensional array
int[][][][] c = new int[2][4][5][5]; // four-dimensional array
// and so on
```

However, it is not necessary to specify the size at all levels initially. You can specify the size only at the first level.

```java
int[][] a1 = new int[5][]; // two-dimensional array with 5 rows
```

In this case, it is not yet known how many elements each row will have. This can be determined later, and the array can have a different number of elements in each row, i.e., be asymmetric. We define the number of elements in each row for the array `a1`.

```java
a1[0] = new int[1];
a1[1] = new int[2];
a1[2] = new int[3];
a1[3] = new int[4];
a1[4] = new int[5];
```

```java
int[][] multiArr = {{2, 50, 30, 50}, {1, 25, 65, 50}, {1}};
System.out.println(multiArr[1][3]);
```

As a result, when printed to the screen,

```java
for(int i = 0; i < a1.length; i++) {
    for(int j = 0; j < a1[i].length; j++) {			
        System.out.print(a1[i][j] + " ");
    }
    System.out.println();
}
```

When the array is created, its elements are automatically initialized to zeros, so this example will print zeros to the screen.