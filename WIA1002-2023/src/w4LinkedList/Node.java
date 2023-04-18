/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w4LinkedList;

/**
 *
 * @author jad
 */
public class Node<E> {

    Node<E> next;
    Node<E> head;
    Node<E> tail;
    E value;

    public Node(E value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');
        Node<Character> head = node1;
        Node<Character> tail = node2;
    }

    public void addLast(E input) {
                    Node<E> newNode = new Node<>(input);
        if (tail == null) {
            tail = new Node<E>(input);
        } else {
            tail.next = new Node<>(input);
        }
        tail = tail.next;
    }

}
