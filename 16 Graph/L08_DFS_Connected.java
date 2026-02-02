// L08_DFS_Connected.java
// Depth First Search (DFS) traversal for a CONNECTED graph
// Using Adjacency List (Undirected)

import java.util.ArrayList;

public class L08_DFS_Connected {

    // Edge class
    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create a CONNECTED graph
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

    // DFS utility (recursive)
    static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {

        visited[curr] = true;
        System.out.print(curr + " ");

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        boolean[] visited = new boolean[V];

        // DFS starting from node 0 (graph is connected)
        dfs(graph, 0, visited);
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

*/
