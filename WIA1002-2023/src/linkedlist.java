/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jad
 */
public class linkedlist <V> {
    node<V> head;
    node<V> tail;
    int size;
    
    public static void main(String[] args) {
        linkedlist<Double> test = new linkedlist<>();
        test.addFirst(12.234);
        test.addLast(423.324);
        test.addLast(10.3);
        test.addFirst(0.3);
        test.add(3424.3, 2);
        System.out.println(test);
        test.reverse();
        System.out.println(test);
        
    }
    
    public linkedlist () {
        head = null;
        tail = null;
    }
    
    public void addFirst(V o) {
        if (head==null) {
            head = new node<V>(o);
            tail = head;
        } 
        else {
            node<V> newNode = new node<>(o);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(V o) {
        if (head==null) {
            head = new node<V>(o);
            tail = head;
        } 
        else {
            tail.next = new node<V>(o);
            tail = tail.next;
        }
        size++;
    }
    
    public void add(V o, int i) {
        node<V> beforetarget = getnode(i-1);
        node<V> temp = beforetarget.next;
        beforetarget.next = new node<V>(o);
        beforetarget.next.next = temp;
        size++;
    }
    
    public node<V> getnode(int i) {
        node<V> temp = head;
        for (int j=0; j<i; j++) {
            temp = temp.next;
        }
        return temp;
    }
    
    public String toString() {
        String result = "";
        node<V> temp = head;
        
        while(temp != null) {
            result += (temp.element + ", ");
            temp = temp.next;
        }
        return result;
    }
    
    public void reverse() {
        if (head==null) return;
        node<V> prev = null;
        node<V> current = head;
        node<V> next = null;
        
        tail = head;
        
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
    }
}

class node <V> {
    node<V> next;
    V element;
    
    public node (V element) {
        this.element = element;
    }
     
}
