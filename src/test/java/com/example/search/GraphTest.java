package com.example.search;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class GraphTest{

    @Test
    public void testDFS() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        String result = captureDFSOutput(graph, 2);
        assertEquals("2 0 1 3 ", result);
    }

    private String captureDFSOutput(Graph graph, int startVertex) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        graph.DFS(startVertex);
        return out.toString();
    }

    @Test
    public void testBFS() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        String result = captureBFSOutput(graph, 2);
        assertEquals("2 0 3 1 ", result);
    }

    private String captureBFSOutput(Graph graph, int startVertex) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        graph.BFS(startVertex);
        return out.toString();
    }

}