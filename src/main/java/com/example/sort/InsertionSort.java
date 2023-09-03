package com.example.sort;

/**
 * Insertion sort is a simple and intuitive sorting algorithm. It works by building a sorted list one element at a time. It compares each new element to the already-sorted elements and inserts the new element into the correct position, ensuring that the sorted list remains sorted.
 *
 * The algorithm can be thought of as analogous to playing cards. Imagine you're dealt a hand of cards one at a time. With each new card, you insert it into its proper place among those already in your hand (the sorted ones). In the end, you have a sorted hand.
 */

public class InsertionSort {

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        int[] sortedArray = sort(array);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

}
