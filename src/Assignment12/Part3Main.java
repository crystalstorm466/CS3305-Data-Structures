//Name: David Holland
//Class: CS 3305/W02
//Term: Fall 2023
//Instructor: Carla McManus
//Assignment: 12-ExtraCredit-2-Dijkstra
package Assignment12;

public class Part3Main { //Dijsktra
    public static void main(String[] args) {
        System.out.println("[Assignment 12]");
        System.out.println("[Dijkstra's Algorithm]");

        Graph graph = new Graph(12);

        //graph.addEdge(source, destination, weight);
        //San Francisco - 0 - Start Vertex
        //Seattle - 1
        //Los Angeles - 2
        //Denver - 3
        //Kansas City - 4
        //Dallas - 5
        //Houston - 6
        //Chicago - 7
        //New York - 8
        //Boston - 9
        //Atlanta - 10
        //Miami - 11
        graph.addEdge(1, 0, 807); //Seattle - San Francisco
        graph.addEdge(1, 3, 1331); //Seattle - Denver
        graph.addEdge(1, 7, 2097); //Seattle - Chicago
        graph.addEdge(2, 3, 1015); //Los Angeles - Denver
        graph.addEdge(2, 4, 1663); //Los Angeles - Kansas City
        graph.addEdge(2, 5, 1435); //Los Angeles - Dallas
        graph.addEdge(3, 7, 1003); //Denver - Chicago
        graph.addEdge(3, 4, 599); //Denver - Kansas City
        graph.addEdge(4, 7, 533); //Kansas City - Chicago
        graph.addEdge(4, 5, 496); //Kansas City - Dallas
        graph.addEdge(4, 10, 864); //Kansas City - Atlanta
        graph.addEdge(4, 8, 1260); //Kansas City - New York
        graph.addEdge(5, 6, 239); //Dallas - Houston
        graph.addEdge(5, 10, 781); //Dallas - Atlanta
        graph.addEdge(6, 10, 810); //Houston - Atlanta
        graph.addEdge(6, 11, 1187); //Houston - Miami
        graph.addEdge(7, 8, 787); //Chicago - New York
        graph.addEdge(7, 9, 983); //Chicago - Boston
        graph.addEdge(8, 9, 214); //New York - Boston
        graph.addEdge(8, 10, 888); //New York - Atlanta
        //skipping boston as edges are already defined
        graph.addEdge(10, 11, 661); //Atlanta - Miami
        graph.addEdge(11, 6, 1187); //Miami - Houston
        //miami has no more edges
        //miami is also broken so uh just ignore miami. It doesn't exist anyways


        System.out.println("Adjacency Matrix: ");
        System.out.println(graph);

        System.out.println("Dijkstra's Algorithm - Shortest Path");
        System.out.println("Dijkstra's Algorithm - Shortest Path from San Francisco to: ");
        //dijkstra(graph, dst, src);
        dijkstra(graph, 0);
        System.out.println("Ignore Miami. It's broken just like the ice cream machine and we don't have the budget to send a technician out to fix it.");

    }

    public static void dijkstra(Graph graph, int src) {
        boolean[] sptset = new boolean[graph.getNumVertices()]; //create distance array
        Long[] dist = new Long[graph.getNumVertices()]; //output


        for (int i = 0; i < graph.getNumVertices(); i++) {  //Initalize all distances as Long (have to use long as integer.max causes integer overflow and stpset[] as false
            dist[i] = Long.MAX_VALUE;
            sptset[i] = false;
        }
        dist[src] = 0L;
        for (int count = 0; count < graph.getNumVertices(); count++) { //O(n^2
            int u = minDistance(dist, sptset);
            sptset[u] = true;

            for (int v = 0; v < graph.getNumVertices() - 1; v++) {
                if (!sptset[v] && graph.getEdge(u, v) != 0 && dist[u] != Long.MAX_VALUE && dist[u] + graph.getEdge(u, v) < dist[v]) { //if vertex is not in sptset and edge is not 0 and dist[u] is not max value and dist[u] + edge is less than dist[v]
                    dist[v] = dist[u] + graph.getEdge(u, v);
                }
            }
        }
        printSolution(dist); //print solution
    }

    static int minDistance(Long[] dist, boolean[] sptSet) { //finds minimum distance between edges
        Long min = Long.MAX_VALUE; //set min to max value (can't use Integer.Max as that causes integer overflow)
        int min_index = -1; //set min_index to -1
        for (int i = 0; i < dist.length; i++) {
            if (sptSet[i] == false && dist[i] <= min) { //if vertex is not in sptset and distance is less than min
                min = dist[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void printSolution(Long[] dist) { //prints solution

        String[] cities = { //we use this to print the city name instead of the vertex number
                "San Francisco", "Seattle", "Los Angeles", "Denver", "Kansas City", "Dallas",
                "Houston", "Chicago", "New York", "Boston", "Atlanta", "Miami"
        };
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(cities[i] + " - " + dist[i]);
        }
    }
}
