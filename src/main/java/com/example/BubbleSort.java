
package com.example;

/**
 Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated for each item in the list, causing the largest unsorted element to "bubble up" to its correct position.

 Usage of Bubble Sort:
 Bubble Sort is often used for its simplicity, especially for small datasets. However, due to its O(Nˆ2) average and worst-case time complexity, it's not suitable for lists of a non-trivial size. It's generally used for educational purposes to introduce sorting algorithms, rather than for practical, large-scale applications.

 Note: You mentioned "merge short" in your request, but I've provided the Bubble Sort implementation as requested. If you need the Merge Sort again or any other information, please let me know.
 */

public class BubbleSort
{
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // If no two elements were swapped in the inner loop, then the list is sorted
        }
    }
}
