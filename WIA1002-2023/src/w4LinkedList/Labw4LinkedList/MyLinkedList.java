/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w4LinkedList.Labw4LinkedList;

import java.util.NoSuchElementException;

/**
 * 2) Write a class called MyLinkedList. The class should have the following :
 * a. Default constructor b. Nodes for head and tail
 *
 * 3) Implement the following methods from tutorial in this class: a. public
 * void addFirst(E e) b. public void addLast(E e) c. public void add(int index,
 * E e) d. public E removeFirst() e. public E removeLast() f. public E
 * remove(int index)
 *
 * @author jad
 */
public class MyLinkedList<E> {

    Node<E> head;
    Node<E> tail;
    private int size = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(E e) {
        head = new Node<E>(e);
        tail = head;
        size++;
    }

    public void addLast(E e) {
        if (size == 0) {
            addFirst(e);
        }
        tail.next = new Node<E>(e);
        tail = tail.next;
        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = head;
        for (int i = 1; i < index; i++) // stops before the desired index
        {
            current = current.next;
        }
        /* alternative: use getNode() to reach specified index*/

        Node<E> temp = current.next;
        current.next = new Node<E>(e, temp);
        size++;
    }

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

    public E removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        E removedElement = tail.element;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<E> prev = getNode(size - 2); // get the node before tail
            prev.next = null;
            tail = prev;
        }
        size--;
        return removedElement;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) { // last element
            return removeLast();
        } else {
            Node<E> prev = getNode(index - 1);
            E removedElement = prev.next.element;
            prev.next = prev.next.next;
            size--;
            return removedElement;
        }
    }

    private Node<E> getNode(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    
    public int indexOf(E e) {
        int index = 0;
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        int index = 0;
        int lastIndexOfMatch = -1;
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) {
                lastIndexOfMatch = index;
            }
            current = current.next;
            index++;
        }
        return lastIndexOfMatch;
    }

    public E set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = getNode(index);
        E oldElement = node.element;
        node.element = e;
        return oldElement;
    }

    public void clear() {
        Node<E> current = head;
        while(current.next != null) {
            current = head.next;
            head.next = null;
            head = current;
        }
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        if (size <= 1) {
            return;
        }
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
    }

    public static void main(String[] args) {
        MyLinkedList<String> test = new MyLinkedList<>();
        test.addFirst("apple");
        test.addLast("banana");
        test.add(1, "papaya");

        System.out.println(test.toString());
    }

    public int size() {
        return size;
    }

    public E getFirst() {
        return getNode(0).element;
    }

    public E getLast() {
        return getNode(size-1).element;
    }

    public E get(int i) {
        Node<E> element = this.getNode(i);
        return element.element;
    }

    public boolean contains(E o) {
        Node<E> node = head;
        while (node != null) {
            if(node.element.equals(o))
                return true;
            node = node.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public String toString() {
        Node<E> node = head;
        String output = "";
        while (node != null) {
            output += node.element.toString() + ", ";
            node = node.next;
        }
        return output; 
    }
}