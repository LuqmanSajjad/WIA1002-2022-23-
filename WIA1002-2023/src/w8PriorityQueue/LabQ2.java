/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w8PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 2. Create two priority queues with the following elements: {"George", "Jim",
 * "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin",
 * "Michelle", "Ryan"}. Find their union, difference, and intersection.
 *
 * @author jad
 */
public class LabQ2 {

    public static void main(String[] args) {

        PriorityQueue<String> q1 = new PriorityQueue<>();
        String[] list1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        for (String name : list1) {
            q1.add(name);
        }

        PriorityQueue<String> q2 = new PriorityQueue<>();
        String[] list2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        for (String name : list2) {
            q2.add(name);
        }

        System.out.println("queue1 : " + q1);
        System.out.println("queue2 : " + q2);

        //union
        System.out.println("union: " + union(q1, q2));
        
        // difference q1 - q2
        System.out.println("difference q1 - q2: " + difference(q1, q2));
        
        // intersection
        System.out.println("intersection: " + intersect(q1, q2));

    }
    
    private static PriorityQueue<String> union(PriorityQueue<String> q1, PriorityQueue<String> q2) {
        // what does spliterator dooo????
        PriorityQueue<String> union = new PriorityQueue<>();
        Iterator<String> iterator1 = q1.iterator();
        Iterator<String> iterator2 = q2.iterator();
        
        while (iterator1.hasNext())
            union.add(iterator1.next());
        while (iterator2.hasNext())
            union.add(iterator2.next());
        
        return union;
    }
    
    private static PriorityQueue<String> difference(PriorityQueue<String> q1, PriorityQueue<String> q2) {
        PriorityQueue<String> diff = new PriorityQueue<>();
        
        Iterator<String> iterator = q1.iterator();

        while (iterator.hasNext()) {
            String name1 = iterator.next();
            Iterator<String> iterator2 = q2.iterator();
            while (iterator2.hasNext()) {
                String name2 = iterator2.next();
                if (name1.compareTo(name2) > 0) {       // the similar elements can't be found after this loop
                    diff.add(name1);
                    break;
                }
                if (name1.compareTo(name2) == 0) {
                    break;
                }
            }
        }
        
        return diff;
    }
    
    private static PriorityQueue<String> intersect(PriorityQueue<String> q1, PriorityQueue<String> q2) {
        PriorityQueue<String> intersect = new PriorityQueue<>();
        Iterator<String> iterator = q1.iterator();

        while (iterator.hasNext()) {
            String name1 = iterator.next();
            Iterator<String> iterator2 = q2.iterator();
            while (iterator2.hasNext()) {
                String name2 = iterator2.next();
                if (name1.compareTo(name2) > 0) {
                    break;
                }
                if (name1.compareTo(name2) == 0) {
                    intersect.add(name2);
                }
            }
        }
        return intersect;
    }
    
}

/*
question 

this is my output. 
why does on queue1, John comes before Jim??

queue1 : [Blake, George, John, Jim, Kevin, Michael]
queue2 : [George, Katie, Kevin, Michelle, Ryan]
union: [Blake, George, George, Jim, Kevin, Michael, John, Katie, Kevin, Michelle, Ryan]
difference q1 - q2: [Jim, John, Kevin, Michael]
intersection: [George]
*/
