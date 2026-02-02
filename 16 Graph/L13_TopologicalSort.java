// L13_TopologicalSort.java
// Topological Sort using DFS (for Directed Acyclic Graph - DAG)

import java.util.ArrayList;
import java.util.Stack;

public class L13_TopologicalSort {

    // Edge class
    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create directed graph (DAG)
    static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
    }

    // DFS utility for topological sort
    static void topoSortUtil(
            ArrayList<Edge>[] graph,
            int curr,
            boolean[] visited,
            Stack<Integer> stack
    ) {

        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                topoSortUtil(graph, e.dest, visited, stack);
            }
        }

        // Push after all neighbors are processed
        stack.push(curr);
    }

    // Topological Sort
    static void topoSort(ArrayList<Edge>[] graph, int V) {

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoSortUtil(graph, i, visited, stack);
            }
        }

        // Print topological order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {

        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        /*
        Directed Acyclic Graph (DAG)

            5 → 2 → 3 → 1
            ↓
            0

            4 → 0
            ↓
            1

        One valid Topological Order:
        5 4 2 3 1 0
         */
        createGraph(graph);
        topoSort(graph, V);
    }
}
