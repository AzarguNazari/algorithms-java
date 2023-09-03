package com.example.search;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class LinearSearchTest {


    @Test
    public void testSearch_ElementPresent() {
        int[] array = {5, 3, 8, 1, 9, 6, 7, 2, 4};
        assertEquals(5, LinearSearch.search(array, 6));
    }

    @Test
    public void testSearch_ElementNotPresent() {
        int[] array = {5, 3, 8, 1, 9, 6, 7, 2, 4};
        assertEquals(-1, LinearSearch.search(array, 10));
    }

    @Test
    public void testSearch_EmptyArray() {
        int[] array = {};
        assertEquals(-1, LinearSearch.search(array, 5));
    }

    @Test
    public void testSearch_SingleElementArray_Present() {
        int[] array = {11};
        assertEquals(0, LinearSearch.search(array, 11));
    }

    @Test
    public void testSearch_SingleElementArray_NotPresent() {
        int[] array = {11};
        assertEquals(-1, LinearSearch.search(array, 5));
    }

    @Test
    public void testSearch_ElementAtStart() {
        int[] array = {5, 3, 8, 1, 9, 6, 7, 2, 4};
        assertEquals(0, LinearSearch.search(array, 5));
    }

    @Test
    public void testSearch_ElementAtEnd() {
        int[] array = {5, 3, 8, 1, 9, 6, 7, 2, 4};
        assertEquals(8, LinearSearch.search(array, 4));
    }

}