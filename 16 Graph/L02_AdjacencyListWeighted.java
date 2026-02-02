// L02_AdjacencyListWeighted.java
// Graph representation using Adjacency List (Weighted, Undirected)

import java.util.ArrayList;

public class L02_AdjacencyListWeighted {

    // Edge class to store source, destination and weight
    static class Edge {

        int src;
        int dest;
        int weight;

        // Constructor
        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Create weighted graph
    static void createGraph(ArrayList<Edge>[] graph) {

        // Initialize adjacency list
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (Undirected, Weighted)
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    public static void main(String[] args) {

        int V = 4; // number of vertices

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        // Print weighted adjacency list
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + ", wt=" + e.weight + ") ");
            }
            System.out.println();
        }
    }
}
