package com.example.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopologicalSortTest {


    @Test
    public void testTopologicalSort() {
        TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        Stack<Integer> result = g.topologicalSort();
        List<Integer> sortedOrder = new ArrayList<>(result);

        List<Integer> expectedOrder = Arrays.asList(5, 4, 2, 3, 1, 0);

        assertEquals(expectedOrder, sortedOrder);
    }

}