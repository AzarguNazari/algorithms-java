package com.nazaricode.algorithms.search;

/*
Linear search, also known as a sequential search, is a straightforward method to find a specific element within a list. It works by iterating over all elements in the list one by one until the desired element is found or until all elements have been checked.

The efficiency of linear search is O(n), where n is the number of elements in the list. This means that in the worst case, you might need to check each element of the list. Due to its simplicity, linear search is practical when the list is short or not sorted. However, for larger lists, more efficient search algorithms like binary search are preferred.
 */
public class LinearSearch {

    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;  // Element found, return its index
            }
        }
        return -1;  // Element not present in the array
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 6, 7, 2, 4};
        int result = search(arr, 6);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

}
