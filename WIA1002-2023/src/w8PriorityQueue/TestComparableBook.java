/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w8PriorityQueue;

/**
 *
 * @author jad
 */
import java.util.Queue;

public class TestComparableBook {

    public static void main(String[] args) {
        Queue<ComparableBook> BookQueue = new java.util.PriorityQueue<>();
        BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
        BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
        BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
        BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java(Dummies)"));
        BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));
        
        System.out.println(BookQueue);

        while (BookQueue.peek() != null) {
            System.out.print("\nHead Element: " + BookQueue.peek());
            BookQueue.remove();
            System.out.print("\nPriority queue: " + BookQueue);
            
            System.out.println("\n");
        }
    }
}

class ComparableBook implements Comparable<ComparableBook> {

    String title;
    int id;

    public ComparableBook(int id, String title) {
        this.id = id;
        this.title = title;
    }
    
    public String toString() {
        return "\n" + id + ": " + title;
    }

    public int compareTo(ComparableBook o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id == o.id) {
            return 0;
        } else {
            return -1;
        }
    }
}
