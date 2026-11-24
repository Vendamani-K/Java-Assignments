package DataStructures.GraphTraversalAssignment;

import java.util.*;

public class Graph {

    private Map<String, List<String>> adjacencyList;

    public Graph() {
        adjacencyList = new LinkedHashMap<>();
    }


    public void addVertex(String vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String source, String destination) {

        addVertex(source);
        addVertex(destination);

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    
    public void dfs(String start) {

        if (!adjacencyList.containsKey(start)) {
            System.out.println("Starting Node not found");
            return;
        }

        Set<String> visited = new HashSet<>();

        System.out.print("DFS Traversal: ");

        dfsRecursive(start, visited);

        System.out.println();
    }

    private void dfsRecursive(String vertex, Set<String> visited) {

        visited.add(vertex);

        System.out.print(vertex + " ");

    
        for (String neighbour : adjacencyList.get(vertex)) {

            if (!visited.contains(neighbour)) {
                dfsRecursive(neighbour, visited);
            }
        }
    }


    public void bfs(String start) {

        if (!adjacencyList.containsKey(start)) {
            System.out.println("Starting Node not found");
            return;
        }

        Set<String> visited = new HashSet<>();

        Queue<String> queue = new LinkedList<>();

         
        visited.add(start);
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            // Remove the front Node
            String vertex = queue.poll();

            System.out.print(vertex + " ");

            // Visit all unvisited neighbours
            for (String neighbour : adjacencyList.get(vertex)) {

                if (!visited.contains(neighbour)) {

                    visited.add(neighbour);

                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    // Display graph connections
    public void displayGraph() {

        System.out.println("Graph Connections:");

        for (String vertex : adjacencyList.keySet()) {

            System.out.println(
                vertex + " -> " + adjacencyList.get(vertex)
            );
        }
    }
}
