// L12_CycleDetection_Directed.java
// Cycle Detection in a DIRECTED graph using DFS + Recursion Stack

import java.util.ArrayList;

public class L12_CycleDetection_Directed {

    // Edge class
    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create directed graph
    static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed graph with a cycle
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0)); // cycle: 0 → 2 → 3 → 0
    }

    // DFS utility for cycle detection
    static boolean detectCycle(
            ArrayList<Edge>[] graph,
            boolean[] visited,
            boolean[] recStack,
            int curr
    ) {

        visited[curr] = true;
        recStack[curr] = true;

        for (Edge e : graph[curr]) {

            // If node is in recursion stack → cycle
            if (recStack[e.dest]) {
                return true;
            }

            // If not visited, DFS
            if (!visited[e.dest]) {
                if (detectCycle(graph, visited, recStack, e.dest)) {
                    return true;
                }
            }
        }

        // Remove from recursion stack (backtrack)
        recStack[curr] = false;
        return false;
    }

    // Cycle detection for directed graph
    static boolean hasCycle(ArrayList<Edge>[] graph, int V) {

        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycle(graph, visited, recStack, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        System.out.println(hasCycle(graph, V));
    }
}
