//Name: David Holland
//Class: CS 3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 12-Part-1-Prims
package Assignment12;

import java.util.*;
public class Part1Main { //Primm's Algorithm
    public static void main(String[] args) {
        System.out.println("[Assignment 12]");
        System.out.println("[Primm's Algorithm]");

        Scanner scan = new Scanner(System.in);


        //System.out.print("How many verticies do you want in your graph?: ");
        //  int verticies = scan.nextInt();
        int verticies = 9;


        Graph graph = new Graph(verticies);

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
        graph.addEdge(2, 5,2); //C - F
        graph.addEdge(2, 3, 3); //C - D
        graph.addEdge(2, 6, 9); //C - G
        graph.addEdge(3, 6, 7); //D - G
        graph.addEdge(3, 4, 3); //D - E
        graph.addEdge(4, 8, 8); //E - H
        graph.addEdge(6, 7, 3); //G - H


        System.out.println("Adjacency Matrix: ");
        System.out.println(graph);

      System.out.println("Primm's Algorithm - MST");
      primm(graph);

    }

    static void primm(Graph graph) {
        boolean[] visited = new boolean[graph.getNumVertices()];
        boolean[] selected = new boolean[graph.getNumVertices()];
        Arrays.fill(selected, false);
        visited[0] = true;
        selected[0] = true;
        //int edges = (graph.getNumVertices() * (graph.getNumVertices() - 1)) / 2;
        int edges = 0;
        while (edges < graph.getNumVertices() - 1) { //O(n^2
            int minWeight = Integer.MAX_VALUE;
            int minSrc = -1;
            int minDest = -1;
            int x = 0;
            int y = 0;

            for (int i = 0; i < graph.getNumVertices() - 1; i++) {
                if (selected[i]) {
                    for (int j = 0; j < graph.getNumVertices() - 1; j++) {
                        if (!visited[j] && graph.getEdge(i, j) != 0) {
                            if (minWeight > graph.getEdge(i, j)) {
                                minWeight = graph.getEdge(i, j);
                                minSrc = i;
                                minDest = j;
                            }
                        }
                    }
                }
            }
            if (minSrc != -1 && minDest != -1) {
                System.out.println(minSrc + " - " + minDest + " : " + minWeight );
                visited[minDest] = true;
                selected[minDest] = true;
                edges++;
            } else {
                break;
            }

        }
    }
}
