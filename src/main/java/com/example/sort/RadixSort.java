package com.example.sort;

import java.util.Arrays;

/*
Radix sort is a non-comparative sorting algorithm that works by processing individual digits of integer numbers. Given that integers have d digits (where d is the maximum number of digits in the integers to sort), radix sort works in O(d*(n+b)) time where n is the number of integers and b is the base (e.g., base 10 for decimal numbers).

The idea behind Radix sort is to sort numbers one digit at a time, starting from the least significant digit (LSD) and moving to the most significant digit (MSD), or vice-versa. Typically, counting sort is used as a subroutine to sort numbers at each digit.
 */
public class RadixSort {

    public static int[] sort(int[] arr) {

        if(arr == null || arr.length == 0) return arr;

        int max = Arrays.stream(arr).max().getAsInt(); // Find the maximum number to know the number of digits
        int exp = 1;  // Start with the least significant digit

        while (max / exp > 0) {
            countingSortByDigit(arr, exp);
            exp *= 10;
        }
        return arr;
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
