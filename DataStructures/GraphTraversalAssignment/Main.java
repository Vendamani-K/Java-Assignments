package DataStructures.GraphTraversalAssignment;


public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

       
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");

        graph.displayGraph();

        System.out.println();

        // Perform DFS
        graph.dfs("A");

        // Perform BFS
        graph.bfs("A");
    }
}
