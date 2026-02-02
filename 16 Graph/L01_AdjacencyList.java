// L01_AdjacencyList.java
// Graph representation using Adjacency List (Non-weighted, Undirected)

import java.util.ArrayList;

public class L01_AdjacencyList {

    // Edge class to store source and destination
    static class Edge {

        int src;
        int dest;

        // Constructor
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Method to create the graph
    static void createGraph(ArrayList<Edge>[] graph) {

        // Initialize adjacency list for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (Undirected Graph)
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {

        int V = 4; // Number of vertices

        // Adjacency list declaration
        // @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        // Print adjacency list
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }
    }
}


/*
Graph Structure (Undirected Graph)

      0
      |
      2
     / \
    1---3

Vertices:
0, 1, 2, 3

Adjacency List:
0 -> 2
1 -> 2 3
2 -> 0 1 3
3 -> 1 2

 */
