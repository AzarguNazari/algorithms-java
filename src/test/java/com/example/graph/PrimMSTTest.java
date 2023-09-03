package com.example.graph;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class PrimMSTTest {

    @Test
    public void testPrimMST() {
        int[][] graph = new int[][] {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        PrimMST prim = new PrimMST(graph);
        int[] parent = prim.primMST();
        int[] expectedParent = {-1, 0, 1, 0, 1};

        assertArrayEquals(expectedParent, parent);
    }

}