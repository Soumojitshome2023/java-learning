// L04_AdjacencyMatrixWeighted.java
// Graph representation using Adjacency Matrix (Weighted, Undirected)

public class L04_AdjacencyMatrixWeighted {

    public static void main(String[] args) {

        int V = 4; // number of vertices

        // Create adjacency matrix
        int[][] graph = new int[V][V];

        /*
        Graph Structure (Weighted, Undirected)

              0
            (5)|\(10)
               |
               2
              / \
          (3) /   \ (7)
            1 ----- 3

        Edges with weights:
        0 -- 1 (10)
        0 -- 2 (5)
        1 -- 3 (7)
        2 -- 3 (3)
         */
        // Add weighted edges
        graph[0][1] = 10;
        graph[1][0] = 10;

        graph[0][2] = 5;
        graph[2][0] = 5;

        graph[1][3] = 7;
        graph[3][1] = 7;

        graph[2][3] = 3;
        graph[3][2] = 3;

        // Print adjacency matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
