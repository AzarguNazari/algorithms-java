package com.nazaricode.algorithms.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DijikstraShortestPathTest {


    @Test
    public void testShortestPath() {
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        DijikstraShortestPath dijkstra = new DijikstraShortestPath(graph);
        int[] result = dijkstra.shortestPath(0);

        int[] expected = {0, 4, 12, 19, 21, 11, 9, 8, 14};
        assertArrayEquals(expected, result);
    }

}