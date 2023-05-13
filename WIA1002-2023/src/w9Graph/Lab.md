# Lab Graph

## 1. The addEdge method in WeightedGraph.java adds only directed edges. Create an addUndirectedEdge method that creates undirected edges. This method receives two vertices and a weight and return a boolean.
``` java
public boolean addUndirectedEdge(T source, T destination, N w) {
    addEdge(source, destination, w);
    addEdge(destination, source, w);
    return false;
}
```

## 2. Create a method removeEdge that removes an edge if the source and destination of the edge is given.
``` java
public Edge<T, N> removeEdge(T source, T destination) {
    if (head==null) return null;
    if (!hasVertex(source) || !hasVertex(destination)) 
        return null;

    Vertex<T, N> temp = head;
    while(temp != null) {
        if(temp.vertexInfo.compareTo(source) == 0) {

            Edge<T, N> currentEdge = temp.firstEdge;
            Edge<T, N> prevEdge = currentEdge;
            while(currentEdge != null) {
                if(currentEdge.toVertex.vertexInfo.compareTo(destination) == 0) {
                    prevEdge.nextEdge = currentEdge.nextEdge;   // i didn't remove the linkage between the removed edge to the list. is it fine?
                }
                prevEdge = currentEdge;
                currentEdge = currentEdge.nextEdge;
            }
        }
        temp = temp.nextVertex;
    } return null;
}
```

## 3. We do not need weighted graphs all the time. Based on the framework of the weighted graph, create a class Graph.java for unweighted graphs. Implement both addEdge and addUndirectedEdge methods.
``` java
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
```

## 4. Modify the TestWeightedGraph.java in the lecture notes to test the Graph class created in question 3.
