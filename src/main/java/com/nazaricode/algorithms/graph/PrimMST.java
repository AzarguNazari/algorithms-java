package com.nazaricode.algorithms.graph;
/*
Prim's Minimum Spanning Tree (MST) Algorithm Explanation:

Prim's algorithm is another popular method to determine the minimum spanning tree (MST) of a weighted, connected graph. Starting from an arbitrary vertex, at each step, it grows the MST by adding the minimum weight edge that connects a vertex not in the MST to the growing MST. This algorithm is greedy, as it chooses the minimal weight edge at every step.


 */
public class PrimMST {

    private static final int INF = Integer.MAX_VALUE;
    private int V;
    private int[][] graph;

    public PrimMST(int[][] graph) {
        this.V = graph.length;
        this.graph = graph;
    }

    private int minKey(int[] key, boolean[] mstSet) {
        int min = INF, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public int[] primMST() {
        int[] parent = new int[V];
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = INF;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        return parent;
    }

}
