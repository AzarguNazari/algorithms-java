package com.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest extends TestCase {

    @Test
    public void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        int[] expected = {5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

}