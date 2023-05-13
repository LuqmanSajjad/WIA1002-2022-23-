/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w9Graph;

/**
 * this is an unweighted graph.
 *
 * Question 3 We do not need weighted graphs all the time. Based on the
 * framework of the weighted graph, create a class Graph.java for unweighted
 * graphs. Implement both addEdge and addUndirectedEdge methods.
 *
 * @author jad
 */
public class LabGraph<V extends Comparable<V>> { // didin't use the ordered name because I already have that in tutorial

    int totalVertices = 0;
    WeightedGraph<V, Integer> graph;

    public LabGraph() {
        WeightedGraph graph = new WeightedGraph();
    }
    
    public boolean addEdge(V source, V destination) {
        return graph.addEdge(source, destination, 0);
    }
    
    public boolean addUndirectedEdge(V source, V destination) {
        return graph.addUndirectedEdge(source, destination,0);
    }

}

//class Vertex<V, E> {
//    Vertex<V, E> nextVertex;
//    Edge<V, E> firstEdge;
//    V element;
//    
//    public Vertex (V element) {
//        nextVertex = null; 
//        firstEdge = null;
//        this.element = element;
//    }
//}
//
//class Edge<V, E> {
//    Edge<V, E> nextEdge;
//    Vertex<V, E> toVertex;
//    
//    public Edge (Vertex<V, E> toVertex) {
//        this.toVertex = toVertex;
//    }
//}
