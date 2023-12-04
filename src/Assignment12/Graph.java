package Assignment12;


import java.util.*;
public class Graph {

    public int[][] adjMatrix;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices -1 ; i++) {
            for (int j = 0; j < numVertices - 1; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjMatrix[source][destination] = weight;
        adjMatrix[destination][source] = weight; //for undirected graphs, consider both directions
    }

    public void removeEdge(int source, int destination) {
        adjMatrix[source][destination] = 0;
        adjMatrix[destination][source] = 0;
    }

    public int getNumVertices() { return numVertices; }

    public int getEdge(int source, int destination) { return adjMatrix[source][destination]; }

    @Override
    public String toString() {
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
