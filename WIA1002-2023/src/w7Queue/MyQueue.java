/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w7Queue;
import w4LinkedList.Labw4LinkedList.MyLinkedList;
/**
 * @author jad
 */
public class MyQueue<E> {
    private MyLinkedList<E> queue;
    
    public MyQueue(E[] e) {
        queue = new MyLinkedList<E>();
        for(E element: e) {
            queue.addLast(element);    
        }
    }

    public MyQueue() {
        queue = new MyLinkedList<E>();
    }

    public void enqueue(E e) {
        queue.addLast(e);
    }

    public E dequeue() {
        return queue.removeFirst();
    }

    public E getElement(int i) {
        return queue.get(i);
    }

    public E peek() {
        return queue.getFirst();
    }

    public int getSize() {
        return queue.size();
    }

    public boolean contains(E e) {
        return queue.contains(e);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public String toString() {
        return queue.toString();
    }
}
