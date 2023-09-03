package com.nazaricode.algorithms;

import com.nazaricode.algorithms.sort.RadixSort;
import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RadixSortTest extends TestCase {

    @Test
    public void testSort_SortedArray() {
        int[] array = {2, 24, 45, 66, 75, 90, 170, 802};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        Assertions.assertArrayEquals(expected, RadixSort.sort(array));
    }

    @Test
    public void testSort_UnsortedArray() {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        assertArrayEquals(expected, RadixSort.sort(array));
    }

    @Test
    public void testSort_EmptyArray() {
        int[] array = {};
        int[] expected = {};
        assertArrayEquals(expected, RadixSort.sort(array));
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] array = {11};
        int[] expected = {11};
        assertArrayEquals(expected, RadixSort.sort(array));
    }

    @Test
    public void testSort_DescendingOrderArray() {
        int[] array = {802, 170, 90, 75, 66, 45, 24, 2};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        assertArrayEquals(expected, RadixSort.sort(array));
    }
}