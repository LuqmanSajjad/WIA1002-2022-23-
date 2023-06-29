/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalS12020;

import java.util.Scanner;

/**
 *
 * @author jad
 */

/*
find the unsafe type operations
*/
public class GenericQueue <T> {
    int size;
    T[] queue;
     
    public GenericQueue (int size) {
        this.size = 0;
        queue = (T[]) new Object[size];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==queue.length;
    }
    
    public T peak() {
        return queue[0];
    }
    
    public boolean enqueue (T element) {
        if(isFull()) {
            System.out.println("stack is full!");
            return false;
        }
        System.out.println("Enqueue :"+element);
        System.arraycopy(queue, 0, queue, 1, size);
        queue[0] = element;
        size++;
        return true;
    }
    
    public boolean enqueueMany (String input) {
        Scanner scan = new Scanner(input);
        scan.useDelimiter(",");
        while (scan.hasNext()) {
            String toEnqueue = scan.next();
            enqueue((T)toEnqueue);
        }
        return true;
    }
    
    public T dequeue() {
        if(isEmpty()) return null;
        T toDequeue = queue[0];
        System.out.println("Dequeue :"+toDequeue);
        System.arraycopy(queue, 1, queue, 0, size);
        size--;
        return toDequeue;
    }
    
    public boolean changeOrder (int k) {
        if(isEmpty()) return false;
        if(size==1 || k==0) return true;
        
        T toChange = queue[k];
        System.arraycopy(queue, 0, queue, 1, k);
        queue[0] = toChange;
        return true;
    }
    
    public void display() {
        System.out.printf("\nThere are %d items in the queue, displaying...\n",size);
        for (int i=0; i<size; i++) {
            System.out.print(queue[i] + " | ");
        }
    }
    
    public static void main(String[] args) {
//        GenericQueue<String> q = new GenericQueue<String>(10);
//        q.enqueue("Dom T");
//        q.enqueue("RAfa N");
//        q.enqueueMany("Roger F,Daniil M,Novak D,Alex Z,Stef T,Karen K");
//        q.display();
    }
        
    /// System.arraycopy(queue, 1, queue, 0, size);
}
