/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w9Graph;

/**
 * This data structure implementation is assimilated from the lecture note
 * @author jad
 */
public class Graph {
    public static void main(String[] args) {
        Graph test = new Graph();
        test.addVertex('a');
        test.addVertex('b');
        test.addVertex('c');
        test.addVertex('d');
        test.addVertex('e');
        test.addVertex('f');
        test.addVertex('g');
        test.addVertex('h');
        test.addVertex('i');
        
        test.addEdge('a', 'c');
        test.addEdge('a', 'd');
        test.addEdge('b', 'd');
        test.addEdge('c', 'f');
        test.addEdge('c', 'e');
        test.addEdge('d', 'e');
        test.addEdge('e', 'g');
        test.addEdge('f', 'h');
        test.addEdge('g', 'h');
        test.addEdge('h', 'i');
        
        test.display();
        
    }
    
    vertex head;        // this graph has a head
    int size;
    
    public Graph() {
        head = null;        // this graph has a head
        size = 0;
    }
    
    public void addVertex(char a) {
        /*
        two pointer, tranverse and newVertex
        */
        vertex temp = head;
        vertex newVertex = new vertex(a, null);
        
        /*
        for a simple adding like this, 
        we have to make sure to avoid duplicate vertices (same element)
        */
        if(size==0)
            head = newVertex;
        else {
            while (temp.nextVertex != null)     // get to the last vertex
                temp = temp.nextVertex;
            temp.nextVertex = newVertex;
        }
        size++;
    }
    
    public boolean addEdge (char src, char dest) {
        if(size==0) return false;
        /*
        add a condition when both src and dest is not available
        */
        vertex source = head;
        vertex destination = head;
        
        while (source!=null) {                // find src
            if (source.element == src) {      // arrived at src
                
                while (destination!=null) {       // find dest
                    if(destination.element == dest) {     // dest found
                        /*
                        adding edge
                        */
                        edge newEdge = new edge(destination, null);
                        
                        if(source.totalEdges == 0)                  
                            source.firstEdge = newEdge;         // first edge (head) is the newEdge .. the lecture seems to not have this condition for ==0. ??
                        else {
                            edge temp = source.firstEdge;
                            while(temp.nextEdge != null)      // tranverse to the last edge to add a new edge
                                temp = temp.nextEdge;
                            temp.nextEdge = newEdge;        // the lecture note doesn't include tail, for unknown reason atm
                        }
                        source.totalEdges++;
                    }
                    destination = destination.nextVertex;
                }
            }
            source = source.nextVertex;
        }
        return false;
    }
    
    public void display() {
        vertex temp = head;
        while (temp != null)  {
            System.out.print("\n\n"+temp.element+" ==>");          // print element
            
            edge temp2 = temp.firstEdge;
            System.out.println("Edges: ");                  // print edges
            while (temp2 != null) {
                System.out.print(temp2.toVertex.element + " ");
                temp2 = temp2.nextEdge;
            }
            
            temp = temp.nextVertex;
        }
    }
}

class vertex {
    /*
    this graph has a linked list (all the vertices) and 
    inside all the vertices has its own linked list of
    adjacent edges
    */
    vertex nextVertex;
    edge firstEdge;
    int totalEdges=0;
    char element;
    
    public vertex () {
        nextVertex = null;
        firstEdge = null;
    }
    
    public vertex (char letter) {  // do note that the next is a vertex, not char. Why?
        this.element = letter;
        nextVertex = null;
        firstEdge = null;
    }
    
    public vertex (char letter, vertex next) {  // why the vertex next here is necessary? do we need to add edges automatically?
        this.element = letter;
        nextVertex = next;
        firstEdge = null;
    }
}

class edge {
    vertex toVertex;
    edge nextEdge;
    
    public edge() {
        toVertex = null;
        nextEdge = null;
    }
    
    public edge(vertex destination, edge nextEdge) {
        toVertex = destination;
        this.nextEdge = nextEdge;
    }
}