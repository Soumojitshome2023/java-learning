// L03_AdjacencyMatrix.java
// Graph representation using Adjacency Matrix (Non-weighted, Undirected)

public class L03_AdjacencyMatrix {

    public static void main(String[] args) {

        int V = 4; // number of vertices

        // Create adjacency matrix
        int[][] graph = new int[V][V];

        /*
        Graph Structure (Undirected)

              0
              |
              2
             / \
            1---3

        Adjacency List:
        0 -> 2
        1 -> 2 3
        2 -> 0 1 3
        3 -> 1 2
         */
        // Add edges (undirected, non-weighted)
        graph[0][2] = 1;

        graph[1][2] = 1;
        graph[1][3] = 1;

        graph[2][0] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;

        graph[3][1] = 1;
        graph[3][2] = 1;

        // Print adjacency matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
