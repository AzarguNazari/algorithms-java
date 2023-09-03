package com.example;

import com.example.sort.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testSort_SortedArray() {
        int[] array = {5, 6, 11, 12, 13};
        int[] expected = {5, 6, 11, 12, 13};
        assertArrayEquals(expected, InsertionSort.sort(array));
    }

    @Test
    public void testSort_UnsortedArray() {
        int[] array = {12, 11, 13, 5, 6};
        int[] expected = {5, 6, 11, 12, 13};
        assertArrayEquals(expected, InsertionSort.sort(array));
    }

    @Test
    public void testSort_EmptyArray() {
        int[] array = {};
        int[] expected = {};
        assertArrayEquals(expected, InsertionSort.sort(array));
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] array = {5};
        int[] expected = {5};
        assertArrayEquals(expected, InsertionSort.sort(array));
    }

    @Test
    public void testSort_DescendingOrderArray() {
        int[] array = {13, 12, 11, 6, 5};
        int[] expected = {5, 6, 11, 12, 13};
        assertArrayEquals(expected, InsertionSort.sort(array));
    }

}