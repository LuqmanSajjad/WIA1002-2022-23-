/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w5DoublyLinkedList.SList;

/**
 *
 * @author jad
 */
public class SList<E> {

    class SNode<E> {

        E element;
        SNode<E> next;
        SNode<E> prev=null;

        public SNode() {
        }
                               
        public SNode(E e) {
            this.element = e;
        }
    }

    SNode<E> head;
    SNode<E> tail;
    int size = 0;

    /*
    SList Constructor
    */
    public SList() {
    }

    /*
Append a new element at the end of the list.
     */
    public void appendEnd(E e) {  // similar to add last      
        SNode<E> temp = head;       // temp here is not necessary, just refrence it to null and start working there
        
        if (size > 0) {
            while(temp != tail) 
                temp = temp.next;
           
            tail = new SNode<>(e);
            temp.next = tail;
        } else {
            head = new SNode<>(e);
            tail = head;
        }
        size++;
    }

    /*
Eliminate the first element in the list.
     */
    public E removeInitial() {
        if (head==null) return null;
        if (size == 1) {
            // we need to handle for tail
        }
        SNode<E> temp = head;
        head = head.next;
        temp.next = null;
        size--;
        return temp.element;
    }

    /*
    Search for an element and returns true if this list contains the searched element 
     */
    public boolean contains(E e) {
        SNode<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /*
    Empty all elements in the list and return a statement 
    that reports that the list is empty.  
     */
    public void clear() {
        tail = null;
        head = null;
        size = 0;
    }

    /*
    Display all values from the list in a successive order.
     */
    public void display() {
        SNode<E> current = head;
        while (current != null) {
            System.out.println(current.element.toString());
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SList<String> list = new SList<>();
        
//      1) Append the following values individually: “Linked list, is, easy.”
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy.");

//      2) Display these values.        
        list.display();

//      3) Remove the word “Linked list” and display the removed value. 
        System.out.println("\nRemoved element: " + list.removeInitial());

//      4) Check if ‘difficult’ is in the list. 
        System.out.println("\n" + list.contains("difficult"));

//      5) Clear the list.
        list.clear();
        list.display();
    }
}