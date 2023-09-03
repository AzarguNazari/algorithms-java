package com.nazaricode.algorithms.sort;

/**
 Quick Sort is a divide-and-conquer algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

 Steps:

 Choose an element, called a pivot, from the array.
 Partition the array around the pivot, such that elements smaller than the pivot come before it, while elements greater than the pivot come after it.
 Recursively apply the above steps to the two sub-arrays.
 The efficiency of Quick Sort comes from the fact that, on average, each element only needs to be compared about log(n) times before it's in its final position.
 */
public class QuickSort
{
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
