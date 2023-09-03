package com.example;

import com.example.sort.MergeSort;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest extends TestCase {

    @Test
    public void testMergeSort() {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] expected = {3, 9, 10, 27, 38, 43, 82};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        int[] expected = {5};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }


}