/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalS11718;

/**
 *
 * @author jad
 */
public class Queue <E> {
    
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(5);
        queue.enqueue("Au");
        queue.enqueue("K");
        queue.enqueue("Na");
        queue.enqueue("Ga");
        queue.enqueue("O");
        queue.display();
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("Zn");
        queue.enqueue("Pt");
        queue.display();
        
        queue.enqueue("Mg");
        queue.display();
        
    }
    
    E[] queue; 
    int size=0;
    int front=0;
    int rear=-1;         // rear holds the last element in the queue
    
    public Queue(int capacity) {
        queue = (E[]) new Object[capacity];
    }
    
    public boolean enqueue(E element) {
        if (isFull()) return false;
        rear = (rear+1) % queue.length;
        queue[rear] = element;
        size++;
        return true;
    }
    
    public E dequeue() {
        if (isEmpty()) return null;
        E toDequeue = queue[front];
        queue[front] = null;
        front = (front+1) % queue.length;
        size--;
        return toDequeue;
    }
        
    public boolean isFull() {
        return size == queue.length;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public void display () {
        if (isEmpty()) { 
            System.out.println("empty");
            return;
        }
        
        int front = this.front;
        int rear = this.rear;
        
        while (front!=rear) {
            System.out.print(queue[front] + " | ");
            front = (front+1)%queue.length;
        }
        System.out.println(queue[front] + "\n");
    }
        
    
    
}
