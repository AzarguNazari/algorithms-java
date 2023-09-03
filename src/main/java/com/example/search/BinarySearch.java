package com.example.search;
/*
Binary search is an efficient algorithm used to find a specific element in a sorted list of elements. Instead of linearly searching through each element, binary search divides the list in half repetitively until the desired element is found or the whole list has been searched.

The key idea behind binary search is to determine if the desired element is in the left half or right half of the list. If the desired element is greater than the midpoint, then the right half of the list is searched. If it is less, the left half is searched. This process repeats until the desired element is found or until there are no more elements left to search.
 */
public class BinarySearch {


    public static int search(int[] arr, int x) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;  // Element not present in the array
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int result = search(arr, 10);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

}
