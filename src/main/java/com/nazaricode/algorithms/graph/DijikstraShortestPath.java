package com.nazaricode.algorithms.graph;
/*
Dijkstra's Shortest Path Algorithm is a graph search algorithm that finds the shortest path from a source vertex to every other vertex in the graph. It works with both directed and undirected weighted graphs but assumes that all weights are non-negative.

The idea is to maintain a set of vertices whose shortest path from the source vertex is already known and a set whose shortest path is yet to be determined. In every step, a vertex is chosen from the latter set that has the smallest distance from the source vertex, and then this vertex is moved to the set of known vertices.
 */
public class DijikstraShortestPath {

    private static final int INF = Integer.MAX_VALUE;
    private int vertices;
    private int[][] graph;

    public DijikstraShortestPath(int[][] graph) {
        this.graph = graph;
        this.vertices = graph.length;
    }

    private int findMinDistance(int[] distances, boolean[] processed) {
        int min = INF, minIndex = -1;

        for (int v = 0; v < vertices; v++) {
            if (!processed[v] && distances[v] <= min) {
                min = distances[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public int[] shortestPath(int src) {
        int[] distances = new int[vertices];
        boolean[] processed = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            distances[i] = INF;
            processed[i] = false;
        }

        distances[src] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            int u = findMinDistance(distances, processed);
            processed[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!processed[v] && graph[u][v] != 0 && distances[u] != INF && distances[u] + graph[u][v] < distances[v]) {
                    distances[v] = distances[u] + graph[u][v];
                }
            }
        }
        return distances;
    }

}
