package com.nazaricode.algorithms.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KruskalMSTTest {

    @Test
    public void testKruskalMST() {
        int V = 4;
        int E = 5;
        KruskalMST kruskal = new KruskalMST(V, E);

        kruskal.edges[0].src = 0;
        kruskal.edges[0].dest = 1;
        kruskal.edges[0].weight = 10;

        kruskal.edges[1].src = 0;
        kruskal.edges[1].dest = 2;
        kruskal.edges[1].weight = 6;

        kruskal.edges[2].src = 0;
        kruskal.edges[2].dest = 3;
        kruskal.edges[2].weight = 5;

        kruskal.edges[3].src = 1;
        kruskal.edges[3].dest = 3;
        kruskal.edges[3].weight = 15;

        kruskal.edges[4].src = 2;
        kruskal.edges[4].dest = 3;
        kruskal.edges[4].weight = 4;

        KruskalMST.Edge[] result = kruskal.kruskalMST();

        int totalWeight = 0;
        for (KruskalMST.Edge edge : result) {
            totalWeight += edge.weight;
        }

        assertEquals(19, totalWeight);
    }

}