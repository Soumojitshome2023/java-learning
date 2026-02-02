// L09_DFS_Disconnected.java
// Depth First Search (DFS) traversal for a DISCONNECTED graph
// Using Adjacency List (Undirected)

import java.util.ArrayList;

public class L09_DFS_Disconnected {

    // Edge class
    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create a DISCONNECTED graph
    static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // -------- Component 1 --------
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        // -------- Component 2 (Disconnected) --------
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));
    }

    // DFS utility (recursive)
    static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited) {

        visited[curr] = true;
        System.out.print(curr + " ");

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                dfsUtil(graph, e.dest, visited);
            }
        }
    }

    // DFS for DISCONNECTED graph
    static void dfs(ArrayList<Edge>[] graph, int V) {

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfsUtil(graph, i, visited);
                System.out.println(); // new line for each component
            }
        }
    }

    public static void main(String[] args) {

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        dfs(graph, V);
    }
}


/*
DISCONNECTED Graph

Component 1:
        1 -------- 3
       /           |
      0            |
       \           |
        2 -------- 4

Component 2:
        5 -------- 6


*/
