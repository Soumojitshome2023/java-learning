// L06_BFS.java
// Breadth First Search (BFS) traversal using Adjacency List

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class L06_BFS {

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

        // Undirected graph
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

    // BFS traversal
    static void bfs(ArrayList<Edge>[] graph, int V) {

        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        // Start BFS from node 0
        q.add(0);
        visited[0] = true;

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

    public static void main(String[] args) {

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        bfs(graph, V);
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

Edges:
0 -- 1
0 -- 2
1 -- 3
2 -- 4
3 -- 4
3 -- 5
4 -- 5
5 -- 6

Adjacency List:
0 -> 1 2
1 -> 0 3
2 -> 0 4
3 -> 1 4 5
4 -> 2 3 5
5 -> 3 4 6
6 -> 5
 */
