package com.example.graph;

import java.util.Arrays;
import java.util.Comparator;

/*
Kruskal's algorithm is a greedy algorithm used to find the minimum spanning tree (MST) of a connected, undirected graph with weighted edges. The main idea is to sort all the edges in non-decreasing order of their weight and then pick the smallest edge, checking if it forms a cycle with the MST formed so far. If the cycle is not formed, the edge is added to the MST; otherwise, it is discarded. The process is repeated until there are
V−1 edges in the MST, where

V is the number of vertices in the graph.
 */
public class KruskalMST {

    class Edge {
        int src, dest, weight;
    }

    int V, E;
    Edge[] edges;

    KruskalMST(int v, int e) {
        V = v;
        E = e;
        edges = new Edge[E];
        for (int i = 0; i < e; i++) {
            edges[i] = new Edge();
        }
    }

    int find(int[] parents, int i) {
        if (parents[i] != i)
            parents[i] = find(parents, parents[i]);
        return parents[i];
    }

    void union(int[] parents, int x, int y) {
        int xroot = find(parents, x);
        int yroot = find(parents, y);
        parents[xroot] = yroot;
    }

    Edge[] kruskalMST() {
        Edge[] result = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; i++) {
            result[i] = new Edge();
        }

        Arrays.sort(edges, Comparator.comparingInt(o -> o.weight));

        int[] parents = new int[V];
        for (i = 0; i < V; i++) {
            parents[i] = i;
        }

        i = 0;
        while (e < V - 1) {
            Edge nextEdge = edges[i++];

            int x = find(parents, nextEdge.src);
            int y = find(parents, nextEdge.dest);

            if (x != y) {
                result[e++] = nextEdge;
                union(parents, x, y);
            }
        }
        return result;
    }

}
