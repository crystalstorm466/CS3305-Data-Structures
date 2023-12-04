//Name: David Holland
//Class: CS 3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 12-ExtraCredit-1-Kruskal
package Assignment12;

import java.util.*;
public class Part2Main { //Kruskal's Algorithm
    public static Graph graph = new Graph(9);
    public static int[] parent;
    public static void main(String[] args) {
        System.out.println("[Assignment 12]");
        System.out.println("[Kruskal's Algorithm]");

        Scanner scan = new Scanner(System.in);

        //System.out.print("How many verticies do you want in your graph?: ");
      //  int verticies = scan.nextInt();





        parent = new int[graph.getNumVertices()];

        //graph.addEdge(source, destination, weight);
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
        System.out.println(graph);

        System.out.println("Kruskal's Algorithm - MST");
        kruskal(graph);

    }

    private static void kruskal(Graph graph) {

        int minCost = 0;

        for (int i = 0; i < graph.getNumVertices(); i++) {
           parent[i] = i;
        }

        int edge_count = 0;
        while(edge_count < graph.getNumVertices() - 1) {
            int min = Integer.MAX_VALUE, a = -1, b = -1;
            for (int i = 0; i < graph.getNumVertices(); i++) {
                for (int j = 0; j < graph.getNumVertices(); j++) {
                    if (find(i) != find(j) && graph.getEdge(i, j) < min) {
                        min = graph.getEdge(i, j);
                        a = i;
                        b = j;
                    }
                }
            }
            union1(a, b);
        //    System.out.println("Edge " + edge_count++ + ": (" + a + ", " + b + ") cost: " + min);
            System.out.printf("Edge %d: (%d, %d) cost:%d \n", edge_count++, a, b, min);
            minCost += min;
        }
        System.out.println("Minimum cost = " + minCost);
    }

    static int find(int i) {
       while (parent[i] != i) {
           i = parent[i];
       }
       return i;
    }
    static void union1(int i, int j) {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }
}
