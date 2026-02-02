// L07_BFS_Disconnected.java
// Breadth First Search (BFS) for a DISCONNECTED graph

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class L07_BFS_Disconnected {

    // Edge class
    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create graph (DISCONNECTED)
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

    // BFS for one component
    static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visited, int start) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                if (!visited[e.dest]) {
                    visited[e.dest] = true;
                    q.add(e.dest);
                }
            }
        }
    }

    // BFS for DISCONNECTED graph
    static void bfs(ArrayList<Edge>[] graph, int V) {

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                bfsUtil(graph, visited, i);
                System.out.println(); // new line for each component
            }
        }
    }

    public static void main(String[] args) {

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        bfs(graph, V);
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

Adjacency List:
0 -> 1 2
1 -> 0 3
2 -> 0 4
3 -> 1 4
4 -> 2 3
5 -> 6
6 -> 5
 */
