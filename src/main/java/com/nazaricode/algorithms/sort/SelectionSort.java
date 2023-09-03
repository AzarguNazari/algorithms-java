package com.nazaricode.algorithms.sort;

/**
 * Selection sort is a straightforward sorting algorithm that divides the input list into two parts: a sorted and an unsorted region. The algorithm continuously selects the smallest (or largest, depending on sorting order) element from the unsorted region and swaps it with the first unsorted element. This process moves the boundary of the sorted and unsorted regions one element to the right until the entire list is sorted.
 *
 * The idea is to "select" the minimum element in each iteration and place it in its correct position in the sorted portion.
 */

public class SelectionSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the minimum element with the first unsorted position
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        int[] sortedArray = sort(array);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

}
