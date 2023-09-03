package com.nazaricode.algorithms;

import com.nazaricode.algorithms.sort.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest  {

    @Test
    public void testSort_SortedArray() {
        int[] array = {11, 12, 22, 25, 64};
        int[] expected = {11, 12, 22, 25, 64};
        assertArrayEquals(expected, SelectionSort.sort(array));
    }

    @Test
    public void testSort_UnsortedArray() {
        int[] array = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        assertArrayEquals(expected, SelectionSort.sort(array));
    }

    @Test
    public void testSort_EmptyArray() {
        int[] array = {};
        int[] expected = {};
        assertArrayEquals(expected, SelectionSort.sort(array));
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] array = {11};
        int[] expected = {11};
        assertArrayEquals(expected, SelectionSort.sort(array));
    }

    @Test
    public void testSort_DescendingOrderArray() {
        int[] array = {64, 25, 22, 12, 11};
        int[] expected = {11, 12, 22, 25, 64};
        assertArrayEquals(expected, SelectionSort.sort(array));
    }

}