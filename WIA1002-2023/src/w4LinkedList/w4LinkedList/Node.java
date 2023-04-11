/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w4LinkedList.w4LinkedList;

/**
 1)     Write the generic Node class consisting of two components of a node (i.e.:
        element, next), with a default construct and a constructor that accepts an
        item assigned to the initially declared element variable.
 * @author jad
 */
public class Node <E> {
    E element;
    Node<E> next;
    
    public Node (E element) {
        this.element = element;
        next = null;
    }
    
    public Node (E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }
}
