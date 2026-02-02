// L05_EdgeList.java
// Graph representation using Edge List (Weighted, Undirected)

import java.util.ArrayList;

public class L05_EdgeList {

    // Edge class to store src, dest, and weight
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

    public static void main(String[] args) {

        // Create edge list
        ArrayList<Edge> edges = new ArrayList<>();

        /*
        Graph Structure (Weighted, Undirected)

              0
            (5)|\(10)
               |
               2
              / \
          (3) /   \ (7)
            1 ----- 3

        Edge List:
        0 -- 1 (10)
        0 -- 2 (5)
        1 -- 3 (7)
        2 -- 3 (3)
         */
        // Add edges
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 5));
        edges.add(new Edge(1, 3, 7));
        edges.add(new Edge(2, 3, 3));

        // Print edge list
        for (Edge e : edges) {
            System.out.println(
                    e.src + " -- " + e.dest + " (weight = " + e.weight + ")"
            );
        }
    }
}
