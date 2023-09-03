package com.nazaricode.algorithms.sort;

/*
HeapSort is a comparison-based sorting algorithm that utilizes a binary heap data structure. The algorithm can be divided into two primary phases:

Build a Max Heap from the input data, where the largest item is at the root of the heap.
Heapify: Repeatedly swap the maximum element from the end to the start of the sorted partition and then "heapify" the heap's unsorted portion.
As we continue this process, the sorted elements accumulate at the end of the array. The beauty of HeapSort lies in its in-place sorting mechanism and a time complexity of
O(nlogn) for the worst, average, and best case scenarios.
 */

public class HeapSort {

    public void sort(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract maximum element from heap and
        // swap it with the end of the array then reduce the heap size
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSort ob = new HeapSort();
        ob.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
