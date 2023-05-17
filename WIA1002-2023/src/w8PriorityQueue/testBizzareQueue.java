/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w8PriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author jad
 */
public class testBizzareQueue {
    public static void main(String[] args) {
        PriorityQueue<String> test = new PriorityQueue<>(new PriorityQueueComparator());
        test.add("zusy");
        test.add("mof");
        
        test.add("Jason");
        test.add("jason");
        test.add("Z");
        test.add("zuss");
        test.add("zusy");
        test.add("zuss");
        
        Iterator itr = test.iterator();
        
        System.out.println("Iterator");
        while(itr.hasNext())
            System.out.println(itr.next());
        
        System.out.println("\n\nnormal loops");
        for(String s: test) {
            System.out.println(s);
        }
        
        System.out.println("\n\npoll");
        while (!test.isEmpty()){
            System.out.println(test.poll());
        }
    }
}

class PriorityQueueComparator implements Comparator<String>{
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
            return 0;
        }
}