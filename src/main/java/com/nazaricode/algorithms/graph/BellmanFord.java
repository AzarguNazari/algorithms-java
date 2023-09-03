package com.nazaricode.algorithms.graph;
/*
The Bellman-Ford algorithm calculates the shortest path from a single source vertex to all other vertices in a weighted graph. It handles both positive and negative weight edges and can detect negative weight cycles in the graph.

The algorithm operates by iteratively "relaxing" the paths. It does this V-1 times (V being the number of vertices) for all edges to guarantee the shortest path. If in the V-th iteration there's still a shorter path found, it means there's a negative cycle.

Steps:

Initialize distances from the source vertex to all vertices as infinite and distance to the source itself as 0.
Repeat V-1 times:
For each edge
�
−
�
U−V, if the distance to vertex
�
U + weight of edge
�
−
�
U−V is less than the distance to
�
V, update the distance to
�
V.
Check for negative weight cycles. If we get a shorter path, then there's a cycle.
 */
public class BellmanFord {
    class Edge {
        int src, dest, weight;

        Edge() {
            src = dest = weight = 0;
        }
    }

    private int V, E;
    Edge[] edge;

    BellmanFord(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i=0; i<e; ++i) {
            edge[i] = new Edge();
        }
    }

    int[] BellmanFordShortestPath(int src) {
        int dist[] = new int[V];

        for (int i=0; i<V; ++i) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i=1; i<V; ++i) {
            for (int j=0; j<E; ++j) {
                int u = edge[j].src;
                int v = edge[j].dest;
                int weight = edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        for (int j=0; j<E; ++j) {
            int u = edge[j].src;
            int v = edge[j].dest;
            int weight = edge[j].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Graph contains negative weight cycle");
                return null;
            }
        }
        return dist;
    }

}