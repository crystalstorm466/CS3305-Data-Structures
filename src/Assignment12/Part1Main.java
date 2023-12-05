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
        int verticies = 9; //based off provided graph in assignment .pdf


        Graph graph = new Graph(verticies);

        //graph.addEdge(source, destination, weight); //formula for addEdge();
        //We add weighted Edges based off of provided graph in assignment .pdf
        //Alphabetical order of verticies
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
        System.out.println(graph); //print current graph

      System.out.println("Primm's Algorithm - MST");
      primm(graph); //preform primm's algorithm on graph
        //System.out.println("Kruskal's Algorithm - MST");
        //Part2Main.kruskal(graph); //preform kruskal's algorithm on graph
        //System.out.println("Dijkstra's Algorithm - Shortest Path");
        //Part3Main.dijkstra(graph, 0); //preform dijkstra's algorithm on graph

    }

    static void primm(Graph graph) {
        boolean[] visited = new boolean[graph.getNumVertices()]; //create visited array
        boolean[] selected = new boolean[graph.getNumVertices()]; //create selected array
        Arrays.fill(selected, false);
        visited[0] = true; //Our start vertex
        selected[0] = true;  //Our start vertex
        //int edges = (graph.getNumVertices() * (graph.getNumVertices() - 1)) / 2;
        int edges = 0;
        while (edges < graph.getNumVertices() - 1) { //O(n^2
            int minWeight = Integer.MAX_VALUE; //set minWeight to max value
            int minSrc = -1; //set minSrc to -1
            int minDest = -1; //set minDest to -1
            int x = 0;
            int y = 0;

            for (int i = 0; i < graph.getNumVertices(); i++) { //O(n^2)
                if (selected[i]) { //if vertex is selected
                    for (int j = 0; j < graph.getNumVertices(); j++) { //O(n^2) //find minimum edge
                        if (!visited[j] && graph.getEdge(i, j) != 0) { //if vertex is not visited and edge is not 0
                            if (minWeight > graph.getEdge(i, j)) { //if current edge is less than minWeight
                                minWeight = graph.getEdge(i, j); //set minWeight to current edge
                                minSrc = i; //set minSrc to current vertex
                                minDest = j; //set minDest to current vertex
                            }
                        }
                    }
                }
            }
            if (minSrc != -1 && minDest != -1) { //if minSrc and minDest are not -1
                System.out.println(minSrc + " - " + minDest + " : " + minWeight ); //print edge
                visited[minDest] = true;
                selected[minDest] = true;
                edges++;
            } else {
                break;
            }

        }
    }
}//EOF
