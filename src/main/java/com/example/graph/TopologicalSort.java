package com.example.graph;

/*
Topological sorting is an ordering of the vertices in a directed acyclic graph (DAG) such that, for every directed edge
�
�
UV from vertex
�
U to vertex
�
V, vertex
�
U comes before vertex
�
V in the ordering. A topological ordering is only possible for a DAG. A common application is to schedule tasks represented by vertices in a way that every task comes after its prerequisites.

Topological Sort can be achieved using Depth First Search (DFS) by stacking the vertices as we're done processing their descendants.
 */

import java.util.*;

public class TopologicalSort {
    private int V;
    private LinkedList<Integer> adj[];

    TopologicalSort(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;
        Integer i;

        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor, visited, stack);
            }
        }
        stack.push(v);
    }

    Stack<Integer> topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }
        return stack;
    }
}
