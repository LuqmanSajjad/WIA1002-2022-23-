/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w5DoublyLinkedList.Doubly;

/**
 *
 * @author jad
    Implement all the DoublyLinked List methods in the lecture’s slide. Write a test program 
    by using the appropriate methods, do the following:

    1) Add first node with value of 1
    2) Add last node with value of 100
    3) Add node with value of 2 at position index of 2
    4) Remove node at position index of 3
    5) Traverse Forward
    6) Traverse Backward
    7) Print current size of linked list
    8) Clear all nodes in the linked list
    9) Print again current size of linked list
 */
public class DoublyLinkedList<E> {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(100);
        list.add(2, 2);

        list.tranverseForward();
        list.tranverseBackward();
        System.out.println("\nsize: "+list.getSize());
        list.clear();
        System.out.println("\nlist cleared, size: "+list.getSize());
    }
    
    class Node<E> {
        Node<E> next;
        Node<E> prev;
        E element;
        
        public Node(E e) {
            this.element = e;
        }
        
        public Node(E e, Node<E> next, Node<E> prev) {
            this.element = e;
            this.next = next;
            this.prev = prev;
        }
    }
    
    Node<E> head;
    Node<E> tail;
    int size=0;
    
    public DoublyLinkedList() {}
    
    /*
    This is an optimized code, requires some time to understand
    */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, head, null);
        if (head != null)
            head.prev = newNode;    // only necessary when list is not empty
        head = newNode;
        if (tail == null) 
            tail = head;
        size++;
    }
    
    public void addLast(E e) {
        /*
        doesn't work. please fix
        */
//        if(size==0) addFirst(e);
//        Node<E> newNode = new Node<>(e, null, tail);
//        tail.next = newNode;
//        size++;

        Node<E> newNode = new Node<>(e, null, tail);
        if (tail!=null)
            tail.next = newNode;
        tail=newNode;
        if (head==null)
            head=tail;
        size++;
    }
    
    public void add(int index, E e) {
        if (index < 0 || index > size) 
            throw new IndexOutOfBoundsException();
        if (index == 0)
            addFirst(e);
        else if (index == size) 
            addLast(e); 
        else {
            /*
            stop at index
            */
            Node<E> current = head;
            for (int i=0; i<index; i++)
                current = current.next;
            
            /*
            new node, add next and prev pointers to it
            */
            Node<E> insert = new Node<>(e, current, current.prev);
            
            /*
            changer the pointer for prior nodes
            */
            current.prev.next = insert;
            current.prev = insert;
            size++;
        } 
    }
    
    public E remove(int index, E e) {
        Node<E> temp = null;
        if (index < 0 || index > size) 
            throw new IndexOutOfBoundsException();
        if (index == 0) { // remove first
            temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null; // lecture note skip this part
        }
        else if (index == size) { // remove last
            temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null; // lecture note skip this part
        }
        else {
            for (int i=0; i<index; i++) 
                temp = temp.next;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.prev = null;
            temp.next = null;
        }
        size--;
        return temp.element;
    }
    
    public void tranverseForward() {
        System.out.println("\ntranversing forward..");
        Node<E> current = head;
        while(current!=null) {
            System.out.print(current.element.toString() + ", ");
            current = current.next;
        }        
    }
    
    public void tranverseBackward() {
        System.out.println("\ntranversing backward..");
        Node<E> current = tail;
        while(current!=null) {
            System.out.print(current.element.toString() + ", ");
            current = current.prev;
        }        
    }
    
    public int getSize() {
        return size;
    }
    
    public void clear() {
       head = null;
       tail = null; 
       size=0;
    }
    
    public void displayAll() {
        Node<E> current = head;
        while(current!=null) {
            System.out.print("node: "+current.element.toString() + ",\n" +
                    "node.next = "+current.next+",  "+
                    "node.prev = "+current.prev+"\n");
            current = current.next;
        } 
    }

}
