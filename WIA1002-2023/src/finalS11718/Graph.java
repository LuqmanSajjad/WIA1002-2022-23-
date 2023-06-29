/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalS11718;

/**
 *
 * @author jad
 */
public class Graph <V, W> {
    Vertex<V, W> head; 
    Vertex<V, W> tail;
    
    public void add(V element) {
        if (hasElement(element)) return; 
        Vertex<V, W> newVer = new Vertex<>(element, null);
        if (head==null) {
            head = newVer;
        } else {
            tail.nextVertex = newVer;
        }
        tail = newVer;
    }
    
    public boolean addEdge(V source, V destination, W weight) {
        Vertex<V,W> src = getVertex(source);
        Vertex<V,W> dest = getVertex(destination);
        
        if (src==null || dest==null) {
            return false;
        }
        
        // add to the last edge
        Edge<V,W> nowEdge = src.firstEdge;
        if (nowEdge != null) {
            while (nowEdge.nextEdge!=null) {
                nowEdge = nowEdge.nextEdge;
            }
            nowEdge.nextEdge = new Edge<>(weight, dest);
        } else {
            src.firstEdge = new Edge<>(weight, dest);
        }
        return true;
    }
    
    public Vertex<V,W> getVertex(V element) {
        Vertex<V, W> curr = head;
        while (curr != null) {
            if (curr.element.equals(element))
                return curr;
            curr = curr.nextVertex;
        }
        return null;
    }
    
    public boolean hasElement(V element) {
        return (getVertex(element)!=null);
    }
    
    public void display () {
        Vertex<V,W> vertex = head;
        while (vertex!=null) {
            System.out.println("<< "+vertex.element.toString()+" >>");
            Edge<V,W> edge = vertex.firstEdge;
            while (edge!=null) {
                System.out.printf("\t(%s) > %s\n",edge.weight.toString(), edge.toVertex.element.toString());
                edge = edge.nextEdge;
            }
            vertex = vertex.nextVertex;
        }
    }
    
    public static void main(String[] args) {
        int[][] adjm = {
            {1,1,0,0,0,0},
            {1,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,1,0,0},
            {0,0,0,0,0,1},
            {0,0,0,0,0,1},
        };
        
        Graph<String, Integer> graph = new Graph<>();
        graph.add("Satu");
        graph.add("Dua");
        graph.addEdge("Satu", "Dua", 23);
        graph.add("Tiga");
        graph.add("Empat");
        graph.addEdge("Empat", "Tiga", 54);
        graph.addEdge("Tiga", "Satu", 90);
        
        graph.display();
    }
}

class Vertex<V, W> {
    V element;
    Vertex<V, W> nextVertex;
    Edge<V, W> firstEdge;
    
    public Vertex (V element, Vertex<V, W> nextVertex) {
        this.element = element;
        this.nextVertex = nextVertex;
    }
}

class Edge<V, W> {
    W weight;
    Vertex<V, W> toVertex;
    Edge<V, W> nextEdge;
    
    public Edge (W weight, Vertex<V, W> toVertex) {
        this.weight = weight;
        this.toVertex = toVertex;
    }
}