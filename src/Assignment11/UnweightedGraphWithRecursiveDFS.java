package Assignment11;

import java.util.*;
class UnweightedGraph<V> extends AbstractGraph<V> {
    //taken from textbook
    //lists methods from its superclass
    public UnweightedGraph() {}

    public UnweightedGraph(V[] vertices, int[][] edges) { super(vertices, edges); }

    public UnweightedGraph(List<V> vertices, List<Edge> edges) { super(vertices, edges); }

    public UnweightedGraph(List<Edge> edges, int numberOfVertices) { super(edges, numberOfVertices); }

    public UnweightedGraph(int[][] edges, int numberOfVertices) { super(edges, numberOfVertices); }

    @Override
    public V getVertices(int index) { return null;
    }

    @Override
    public int getDegree(V v) { return 0; }
}
public class UnweightedGraphWithRecursiveDFS extends UnweightedGraph {


    /*Pseudocode for recursion free dfs:
    dfs_norecurion(start) {
        stack = new stack
        boolean isvisited[] = allNodesNotVisited
        parent[] = new parent[]

        stack.push(start)

        while stack is !empty {
            current = stack.pop //pop current node (i) from stack

            if current is !visited {
            isvisited[i] = current

            for each neighbor in current {
                if neighbor !visited {
                    stack.push(neighbor)
                    parent[neighbor] = current
                    }
                   }
                 }


     */

    public void dfs(int u, int[] parent, List<Integer> searchOrder, boolean[] isVisited) {
        //Non-recursive DFS method
        Stack<Integer> stack = new Stack<>();
        stack.push(u);
        searchOrder.add(u); //current
        isVisited[u] = true; // Vertex v visited


        while (!(stack.isEmpty())) { //iterates through stack
            int current = stack.pop();
            if (!isVisited[current]) {
                searchOrder.add(current);
                isVisited[current] = true;
            }

            for (Object neighbor : getNeighbors(current)) { //goes through current neighbors
                if (!isVisited[(int) neighbor]) { //if neighbor isn't visited push them, and mark them
                    stack.push((int) neighbor);
                    searchOrder.add((int) neighbor);
                    isVisited[(int) neighbor] = true;
                    parent[(int) neighbor] = current;
                }
            }
        }
    }
    @Override
    public Tree dfs(int v) { //pretty much same dfs method from AbstractGraph as original
        //on line 87 calls for the iterative dfs().
        List<Integer> searchOrder = new ArrayList<>();
        int[] parent = new int[vertices.size()];
        for (int i = 0; i < parent.length; i++)
            parent[i] = -1; // Initialize parent[i] to -1
        // Mark visited vertices
        boolean[] isVisited = new boolean[vertices.size()];
        //iterative approach now
         dfs(v, parent, searchOrder, isVisited);
        // Return a search tree
        return new Tree(v, parent, searchOrder);
    }

}
