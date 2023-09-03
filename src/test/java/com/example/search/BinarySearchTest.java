package com.example.search;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testSearch_ElementPresent() {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        assertEquals(4, BinarySearch.search(array, 10));
    }

    @Test
    public void testSearch_ElementNotPresent() {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        assertEquals(-1, BinarySearch.search(array, 5));
    }

    @Test
    public void testSearch_EmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearch.search(array, 5));
    }

    @Test
    public void testSearch_SingleElementArray_Present() {
        int[] array = {11};
        assertEquals(0, BinarySearch.search(array, 11));
    }

    @Test
    public void testSearch_SingleElementArray_NotPresent() {
        int[] array = {11};
        assertEquals(-1, BinarySearch.search(array, 5));
    }

    @Test
    public void testSearch_ElementAtStart() {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        assertEquals(0, BinarySearch.search(array, 2));
    }

    @Test
    public void testSearch_ElementAtEnd() {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        assertEquals(7, BinarySearch.search(array, 16));
    }

}