//Name: David Holland
//Class: CS3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 11-Part-1-DFS
package Assignment11;

import java.util.*;
public class Part1Main {
    public static void main(String[] args) {
        System.out.println("[Assignment 11]");

        Scanner scan = new Scanner(System.in);


        UnweightedGraphWithRecursiveDFS graph = new UnweightedGraphWithRecursiveDFS(); //we need to use this class to use our new dfs() w/o recursion

        System.out.print("How many vertexes do you want?: ");
        int vertex = scan.nextInt();

        //creating test data
        for (int i = 1; i <= vertex; i++) {
            System.out.print("Enter vertex " + i +": ");
            int userVertex = scan.nextInt();
            System.out.println("Vertex Added: " + graph.addVertex(userVertex));
        }

//        System.out.print("How many edges: ");
//        int edges = scan.nextInt();
        int edges = vertex - 1;
        System.out.println();
        for (int i = 1; i <= edges; i++) {
            System.out.print("Please input the source vertex: ");
            int source = scan.nextInt();
            System.out.print("Please input the destination vertex: ");
            int destination = scan.nextInt();

            graph.addEdge(source, destination);
        }


        System.out.print("Enter the starting vertex for DFS: ");
        int start = scan.nextInt();
        System.out.println("DFS Traversal: " + graph.getVertex(start));
        AbstractGraph.Tree dfsTree = graph.dfs(start);


        System.out.println("DFS Search Order: " + dfsTree.getSearchOrder());

        dfsTree.printTree(); //prints final tree
    }
}
