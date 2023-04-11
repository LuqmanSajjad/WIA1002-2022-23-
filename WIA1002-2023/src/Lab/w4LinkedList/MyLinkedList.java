/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w4LinkedList;

import java.util.NoSuchElementException;

/**
 2)     Write a class called MyLinkedList. The class should have the following :
            a. Default constructor
            b. Nodes for head and tail
            
 3) Implement the following methods from tutorial in this class:
            a. public void addFirst(E e)
            b. public void addLast(E e)
            c. public void add(int index, E e)
            d. public E removeFirst()
            e. public E removeLast()
            f. public E remove(int index)
            * 
 * @author jad
 */
public class MyLinkedList <E> {
    Node<E> head;
    Node<E> tail;
    private int size =0;
    
    public MyLinkedList () {
        head = null;
        tail = null;
    }
    
    public void addFirst(E e) {
        head = new Node<E>(e);
        tail = head;
        size++;
    }
    
    public void addLast(E e) {
        if (size==0) 
            addFirst(e);
        tail.next = new Node<E>(e);
        tail = tail.next;
    }
        
    public void add(int index, E e) {
        if(index < 0) return;
        if(index >= size) return;
        
        Node<E> current = head;
        for (int i=1; i<index; i++) {       // stops before the desired index
            current = current.next; 
        }
        
        Node<E> temp = current.next;
        current.next = new Node<E>(e, temp);
    }
    
    /* tagged */
//    public void addLast(E e) {
//        Node<E> newNode = new Node<>(e);
//        if (size == 0) {
//            head = newNode;
//        } else {
//            tail.next = newNode;
//        }
//        tail = newNode;
//        size++;
//    }
    /* tagged */
//    public void add(int index, E e) {
//        if (index < 0 || index > size) {
//            throw new IndexOutOfBoundsException();
//        }
//        if (index == 0) {
//            addFirst(e);
//        } else if (index == size) {
//            addLast(e);
//        } else {
//            Node<E> prev = getNode(index - 1);
//            prev.next = new Node<>(e, prev.next);
//            size++;
//        }
//    }
    /* tagged */
    public E removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        E removedElement = head.element;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return removedElement;
    }
    /* tagged */
    public E removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        E removedElement = tail.element;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<E> prev = getNode(size - 2);
            prev.next = null;
            tail = prev;
        }
        size--;
        return removedElement;
    }
    /* tagged */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> prev = getNode(index - 1);
            E removedElement = prev.next.element;
            prev.next = prev.next.next;
            size--;
            return removedElement;
        }
    }
    /* tagged */
    private Node<E> getNode(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    
//    public E removeFirst()
//    public E removeLast()
//    public E remove(int index)
    
    /*
    there is a problem with my toString method
    */    
//    @Override
//    public String toString() {
//        StringBuilder write = new StringBuilder();
//        Node<E> current = head;
//        do { 
//            write.append(current.element);
//        } while (current != tail);
//        
//        return "["+write.toString()+"]";
//    }
    
    public static void main(String[] args) {
        MyLinkedList<String> test = new MyLinkedList<>();
        test.addFirst("apple");
        test.addLast("banana");
        test.add(1, "papaya");
        
        System.out.println(test.toString());
    }
}
