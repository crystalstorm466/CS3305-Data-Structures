//Name: David Holland
//Class: CS 3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 12-ExtraCredit-1-Kruskal
package Assignment12;

import java.util.*;
public class Part2Main { //Kruskal's Algorithm
    public static Graph graph = new Graph(9); //create graph
    public static int[] parent; //create parent array
    public static void main(String[] args) {
        System.out.println("[Assignment 12]");
        System.out.println("[Kruskal's Algorithm]");


        //System.out.print("How many verticies do you want in your graph?: ");
      //  int verticies = scan.nextInt();





        parent = new int[graph.getNumVertices()];

        //graph.addEdge(source, destination, weight);
        //We add Edges based off of provided graph in assignment .pdf
        //A - 0
        //B - 1
        //C - 2
        //D - 3
        //E - 4
        //F - 5
        //G - 6
        //H - 7
        graph.addEdge(0, 2, 4); //A - C
        graph.addEdge(0, 5, 7);//A - F
        graph.addEdge(1, 4, 9); //B - E
        graph.addEdge(1, 7, 3); //B - H
        graph.addEdge(2, 5, 2); //C - F
        graph.addEdge(2, 3, 3); //C - D
        graph.addEdge(2, 6, 9); //C - G
        graph.addEdge(3, 6, 7); //D - G
        graph.addEdge(3, 4, 3); //D - E
        graph.addEdge(4, 8, 8); //E - H
        graph.addEdge(6, 7, 3); //G - H


        System.out.println("Adjacency Matrix: ");
        System.out.println(graph); //print current graph

        System.out.println("Kruskal's Algorithm - MST");
        kruskal(graph); //preform kruskal's algorithm on graph
//        System.out.println("Primm's Algorithm - MST");
//        Part1Main.primm(graph); //preform primm's algorithm on graph
//        System.out.println("Dijkstra's Algorithm - Shortest Path");
//        Part3Main.dijkstra(graph, 0); //preform dijkstra's algorithm on graph

    }

    public static void kruskal(Graph graph) { //main meat of program

        int minCost = 0;

        for (int i = 0; i < graph.getNumVertices(); i++) {
           parent[i] = i;
        }

        int edge_count = 0;
        while(edge_count < graph.getNumVertices() - 1) { //O(n^2)  //while there are still edges to be added
            int min = Integer.MAX_VALUE, a = -1, b = -1; //find minimum edge

            for (int i = 0; i < graph.getNumVertices(); i++) { //what does these for loops do?
                for (int j = 0; j < graph.getNumVertices(); j++) {
                //  the nested for loops are used to iterate through the matrix and find the minimum edge

                    if (find(i) != find(j) && graph.getEdge(i, j) < min) { //if the edge is not already in the tree and the edge is less than the current minimum
                        min = graph.getEdge(i, j);
                        a = i;
                        b = j;
                    }
                }
            }
            union1(a, b); //merge sets
            System.out.println("Edge " + edge_count++ + ": (" + a + ", " + b + ") cost: " + min); //print edge
            minCost += min;
        }
        System.out.println("Minimum cost = " + minCost); //print minimum cost
    }

    static int find(int i) { //finds parent of node
       while (parent[i] != i) {
           i = parent[i];
       }
       return i;
    }
    static void union1(int i, int j) { //unites two nodes
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }
}
