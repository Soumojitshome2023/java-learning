// L11_CycleDetection_Undirected.java
// Cycle Detection in an UNDIRECTED graph using DFS

import java.util.ArrayList;

public class L11_CycleDetection_Undirected {

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

        // Undirected graph with a cycle
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));

        graph[3].add(new Edge(3, 0));
        graph[0].add(new Edge(0, 3)); // forms a cycle
    }

    // DFS utility to detect cycle
    static boolean detectCycle(
            ArrayList<Edge>[] graph,
            boolean[] visited,
            int curr,
            int parent
    ) {
        visited[curr] = true;

        for (Edge e : graph[curr]) {

            // If neighbor is not visited, DFS further
            if (!visited[e.dest]) {
                if (detectCycle(graph, visited, e.dest, curr)) {
                    return true;
                }
            } // If visited and not parent -> cycle exists
            else if (e.dest != parent) {
                return true;
            }
        }
        return false;
    }

    // Cycle detection for disconnected graph
    static boolean hasCycle(ArrayList<Edge>[] graph, int V) {

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycle(graph, visited, i, -1)) {
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

        /*
        Graph Structure (Undirected Cycle)

            0 -------- 1
            |          |
            |          |
            3 -------- 2
         */
        createGraph(graph);

        System.out.println(hasCycle(graph, V));
    }
}
