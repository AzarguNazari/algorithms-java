package com.nazaricode.algorithms;

import com.nazaricode.algorithms.sort.HeapSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest {


    @Test
    public void testSort_SortedArray() {
        HeapSort sorter = new HeapSort();
        int[] array = {5, 6, 7, 11, 12, 13};
        int[] expected = {5, 6, 7, 11, 12, 13};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSort_UnsortedArray() {
        HeapSort sorter = new HeapSort();
        int[] array = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSort_EmptyArray() {
        HeapSort sorter = new HeapSort();
        int[] array = {};
        int[] expected = {};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSort_SingleElementArray() {
        HeapSort sorter = new HeapSort();
        int[] array = {11};
        int[] expected = {11};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSort_DescendingOrderArray() {
        HeapSort sorter = new HeapSort();
        int[] array = {13, 12, 11, 7, 6, 5};
        int[] expected = {5, 6, 7, 11, 12, 13};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

}