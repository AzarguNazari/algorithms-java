package com.example.graph;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static com.example.graph.FloydWarshallAlgorithm.INF;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FloydWarshallAlgorithmTest  {


    @Test
    public void testAllPairShortestPath() {
        int[][] graph = {
                {0, 3, INF, 5},
                {2, 0, INF, 4},
                {INF, 1, 0, INF},
                {INF, INF, 2, 0}
        };

        FloydWarshallAlgorithm floydWarshall = new FloydWarshallAlgorithm(graph);
        int[][] result = floydWarshall.allPairShortestPath();

        int[][] expected = {
                {0, 3, 7, 5},
                {2, 0, 6, 4},
                {3, 1, 0, 5},
                {5, 3, 2, 0}
        };

        for (int i = 0; i < graph.length; i++) {
            assertArrayEquals(expected[i], result[i]);
        }
    }

}