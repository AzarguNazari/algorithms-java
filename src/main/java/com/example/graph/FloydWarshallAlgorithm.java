package com.example.graph;

/*
The Floyd-Warshall algorithm is a dynamic programming approach used to find the shortest paths between all pairs of vertices in a weighted graph with positive or negative weight edges. The algorithm works by iteratively refining an estimate of the shortest path between every pair of vertices until the estimate is accurate.

The core idea behind the algorithm is to consider every vertex as an intermediate point between every other pair of vertices and update the shortest path if passing through the intermediate vertex provides a shorter route.

The algorithm has a time complexity of O(Vˆ3) V is the number of vertices in the graph.
 */

public class FloydWarshallAlgorithm {


    public static final int INF = 99999;
    private int[][] dist;
    private int vertices;

    public FloydWarshallAlgorithm(int[][] graph) {
        this.vertices = graph.length;
        this.dist = new int[vertices][vertices];

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                dist[i][j] = graph[i][j];
            }
        }
    }

    public int[][] allPairShortestPath() {
        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        return dist;
    }

}
