/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w5DoublyLinkedList.KinderGarten;

/**
 *
 * @author jad
 */
public class SinglyLinkedList<E> {
    class Node<E> {
        Node<E> next;
        E element;
        
        public Node(E e) {
           element = e; 
        }
    }
    
    Node<E> head;
    Node<E> tail;
    int size=0;
    
    public SinglyLinkedList() {}
    
    public void add(E e) {
        if (size==0) {
            head = new Node<>(e);
            tail = head;
        } else {
            Node<E> temp = head;
            head = new Node<>(e);
            head.next = temp;
        }
        size++;
    }
    
    public void removeElement(E e) {
        Node<E> current = head;
        while(current!=null) {
            Node<E> temp = current.next;
            
            if(temp.element.equals(e)) {    // removing
                current.next = temp.next;
                temp.next=null;             System.out.println("removal successful");
                size--;
                return;
            }
            current = current.next;
        }
    }
    
    public void printList() {
        Node<E> current = head;
        while(current!=null) {
            System.out.println(current.element.toString());
            current = current.next;
        }
    } 
    
    public int getSize() {
        return size;
    } 
    
    public boolean contains(E e) {
        Node<E> current = head;
        while(current!=null) {
            if(current.element.equals(e)) 
                return true;
        }
        return false; 
    }
    
    public void replace(E e, E newE) {
        Node<E> current = head;
        while(current!=null) {
            if(current.element.equals(e)) {
                current.element = newE;           System.out.println("replacement successful");
                return;
            }
            current = current.next;
        }
        System.out.println("No such name exist");
    }
}
