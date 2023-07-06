/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalJun2022;

import java.util.Random;

/**
 *
 * @author jad
 */
public class q4LuckyDraw {

    public static void main(String[] args) {
        LinkedList<Staff> staffList1 = new LinkedList<>();
        staffList1.addLast(new Staff(1, "Luke Skywalker", "Manager"));
        staffList1.addLast(new Staff(2, "Han Solo", "Supervisor"));
        staffList1.addLast(new Staff(6, "Moff Tarkin", "Assistant"));
        staffList1.addLast(new Staff(8, "Obi Wan", "Assistant"));
        staffList1.addLast(new Staff(9, "Organa", "Assistant"));
        staffList1.addLast(new Staff(12, "Leia Organa", "Supervisor"));
        staffList1.addLast(new Staff(15, "Chewbacca", "Assistant"));
        staffList1.addLast(new Staff(16, "Uncle Owen", "Assistant"));
        staffList1.addLast(new Staff(17, "Aunt Beru", "Assistant"));
        staffList1.addLast(new Staff(19, "lando Calrissian", "Assistant"));
        
        // cloned
        LinkedList<Staff> staffList2 = staffList1.clone();
        
        // 
        int prizesWon=0;      
        Random random = new Random();
        while (prizesWon<5) {
            Staff winner = staffList1.remove(random.nextInt(staffList1.getSize()));
            System.out.printf("\n%2s %s wins a drone!", winner.getID(), winner.getName());
            prizesWon++;
        }
    }
    
}

class Staff {

    private int staffID;
    private String staffName;
    private String position;

    public Staff() {
    }

    public Staff(int id, String name, String post) {
        staffID = id;
        staffName = name;
        position = post;
    }

    public int getID() {
        return staffID;
    }

    public String getName() {
        return staffName;
    }

    public String getPosition() {
        return position;
    }
}

class Node<E> {

    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
    }
}

class LinkedList<E> {

    private Node<E> head, tail;
    private int size = 0;

    public LinkedList() {
    }

    public int getSize() {
        return size;
    }
    
    public E get(int index) {
        if (index<size) {
            Node<E> current = head;
            for (int i=0; i<index; i++) {
                current = current.next;
            }
            return current.element;
        } 
        return null;
    }
    
    public LinkedList<E> clone() {
        LinkedList<E> clone = new LinkedList<>();
        Node<E> current = head;
        while(current!=null) {
            clone.addLast(current.element);
            current = current.next;
        }
        return clone;
    }
    public void addLast(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
}
