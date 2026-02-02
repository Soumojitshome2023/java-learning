// L10_AllPaths_SourceToTarget.java
// Print all paths from source to target using DFS (Backtracking)

import java.util.ArrayList;

public class L10_AllPaths_SourceToTarget {

    // Edge class
    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create graph
    static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // DFS to print all paths
    static void printAllPaths(
            ArrayList<Edge>[] graph,
            boolean[] visited,
            int curr,
            int target,
            String path
    ) {

        // If target is reached, print path
        if (curr == target) {
            System.out.println(path);
            return;
        }

        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                printAllPaths(graph, visited, e.dest, target, path + " -> " + e.dest);
            }
        }

        // Backtrack
        visited[curr] = false;
    }

    public static void main(String[] args) {

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        int src = 0;
        int target = 5;
        boolean[] visited = new boolean[V];

        printAllPaths(graph, visited, src, target, "" + src);
    }
}


/*
Graph Structure (Undirected)

            1 -------- 3 
           /           | \        
          /            |  \       
         0             |   5 -----6
          \            |  /
           \           | /
            2 ---------4

Vertices:
0, 1, 2, 3, 4, 5, 6


 */
