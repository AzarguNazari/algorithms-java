package com.nazaricode.algorithms.sort;

/**
 Merge Sort is a divide-and-conquer algorithm. It works by recursively splitting the array into two halves until each sub-array contains a single element and then merging those sub-arrays in a manner that results in a sorted array.

 Steps:

 Divide: Divide the unsorted list into n sublists, each containing one element.
 Conquer: Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining.
 The main part of the algorithm is the merge process. Given two sorted arrays, the merge function should produce a single sorted array containing all elements from the input arrays.

 Usage of Merge Sort:
 Merge Sort is especially good for scenarios where:

 Stability is required: Merge Sort is a stable sort.
 External Sorting: When the data to be sorted does not fit into memory and needs to be held in an external storage like a hard drive, merge sort (specifically the external variant) can be particularly effective.
 Predictable time: Merge Sort guarantees O(nlogn) time complexity in worst, average, and best cases.
 However, Merge Sort is not as space efficient as some other sorts (like QuickSort) because it requires extra space for the left and right arrays. This can make it less suitable for scenarios where memory is a concern.
 */
public class MergeSort
{
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
