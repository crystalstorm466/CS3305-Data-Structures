package Assignment11;

import java.util.*;
public interface Graph<V> {
    public int getSize();

    public V getVertices(int index);

    List<V> getVertices();

    V getVertex(int index);

    public int getIndex(V v);

    public List<Integer> getNeighbors(int index);

    public int getDegree(V v);

    /** Return the degree for a specified vertex */
    int getDegree(int v);

    public void printEdges();

    public void clear();

    public boolean addVertex(V vertex);

    public boolean addEdge(int u, int v);

    public AbstractGraph<V>.Tree dfs(int v);
    public AbstractGraph<V>.Tree bfs(int v);
}