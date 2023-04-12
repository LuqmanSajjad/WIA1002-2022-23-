/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1_U2101039;

/**
 *
 * @author jad
 */
public class Node <ValueType> { 
    private ValueType value;
    private String edgeName1;
    private String edgeName2;
    private Node<ValueType> edgeNode1;
    private Node<ValueType> edgeNode2;
    
    public Node (ValueType value) {
        this.value = value;
    }
    
    public void setEdge1(String edgeName, Node<ValueType> node) {
        this.edgeName1 = edgeName;
        this.edgeNode1 = node;
    }    
        
    public void setEdge2(String edgeName, Node<ValueType> node) {
        this.edgeName2 = edgeName;
        this.edgeNode2 = node;
    }    
    
    public ValueType getValue() {
        return value;
    }
    
    public Node<ValueType> traverse(String edgeName) {
        if (edgeName1.equals(edgeName)) return edgeNode1;
        if (edgeName2.equals(edgeName)) return edgeNode2;
        return null;
    }
    
    public void printEdgesAndNodes() { 
        System.out.println("-------------------------------------");
        System.out.println(value.toString());
        
        System.out.println("\t:" + edgeName1 + "-->");
        System.out.println("\t\t" + edgeNode1.getValue().toString());
        
        System.out.println("\t:" + edgeName2 + "-->");
        System.out.println("\t\t" + edgeNode2.getValue().toString());
        System.out.println("-------------------------------------");
        
    }
}
