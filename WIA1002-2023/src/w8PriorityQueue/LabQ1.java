/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w8PriorityQueue;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 1. Given an integer array which consists of {4, 8, 1, 2, 9, 6, 3, 7}. Insert these integers into a
priority queue using its ADT. Then, perform the following operations to the priority
queue:
 toString() - Display all the elements inside this priority queue.
 poll() – retrieve and remove the first element in this priority queue.
 add() – add new element 5 into the priority queue
 toArray() – convert the priority queue into an array and display.
 peek() – retrieve the first element in the priority queue.
 contains() – check if the priority queue consists of element “1”.
 size() – get the current size of the priority queue.
 isEmpty() – display while removing the elements in the queue until it is empty.
 Sort the priority queue in reversing order.
 *
 * @author jad
 */
public class LabQ1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        int[] integers = {4, 8, 1, 2, 9, 6, 3, 7};
        
        for(Integer integer: integers) 
            queue.add(integer);
        
        System.out.println(queue.toString()); // why in decreasing
        
        System.out.println("poll out: " + queue.poll());           // why the smallest is pulled out first?
        
        queue.add(5);
        
        Integer[] toArray = queue.toArray(new Integer[queue.size()]);

        System.out.println("peeked: " + queue.peek());
        
        System.out.println("contains \"1\"? :" + queue.contains(1));
        
        System.out.println("queue size: " + queue.size());
        
        System.out.println("clearing the list"); 
        while(!queue.isEmpty()) 
            System.out.println("removed " + queue.poll() + ", " + queue.toString());
        
        
        // reversing priority queue
        PriorityQueue<Integer> reversedQueue = new PriorityQueue<>(Collections.reverseOrder());         // how to reverse the existing queue?
        for(Integer integer: integers) 
            reversedQueue.add(integer);
        
        System.out.println("reversed Queue: "+reversedQueue);
            
    }
}

// by default it is lowest priority out
// in String, Z has higher priority, that's why A always comeout first


