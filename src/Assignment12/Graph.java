package Assignment12;


import java.util.*;
public class Graph {

    public int[][] adjMatrix; //adjacency matrix
    private int numVertices;

    public Graph(int numVertices) { //creates graph with given number of vertices (constructor)
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (i == j) {
                    adjMatrix[i][j] = 0;
                }
                else {
                    adjMatrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjMatrix[source][destination] = weight;
        adjMatrix[destination][source] = weight; //for undirected graphs, consider both directions
    }

    public void removeEdge(int source, int destination) { //removes edge from graph (though technically not even needed)
        adjMatrix[source][destination] = 0;
        adjMatrix[destination][source] = 0;
    }

    public int getNumVertices() { return numVertices; } //retrieves number of vertices

    public int getEdge(int source, int destination) { return adjMatrix[source][destination]; } //retrieves weight of edge

    @Override
    public String toString() { //prints adjacency matrix
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                s.append(adjMatrix[i][j] + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

//    public void printGraph() {
//        for (int i = 0; i < numVertices - 1; i++) {
//            for (int j = 0; j < numVertices - 1  ; j++) {
//                System.out.print(adjMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }


}
