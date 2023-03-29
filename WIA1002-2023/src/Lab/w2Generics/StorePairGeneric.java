/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w2Generics;

import java.util.Objects;

/**
 3.a)  Modify the following program to become a generic class called
        StorePairGeneric. 
        * 
public class StorePair {
    private int first, second;
    
    public StorePair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    public int getFirst() {
        return first;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void setPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    public String toString() {
        return "first = " + first + " second = " + second;
    }
}

* 
    * b) Override the Object equals() method in the StorePair class to
    compare the first values of two objects for equality.

    c) Have the StorePair class implement the Comparable interface.
    Override the compareTo()method to compare the first values of two
    objects.

    d) Create a test program that creates three objects of the StorePair
    generic class called a, b and c. Set the first and second values of a,
    b, c as (6,4), (2,2), (6,3).

    e) Invoke the compareTo()and equals() methods that compares the
    three objects created in (d) in the test program.
    * 
 * @author jad
// * @param <T>
 */

public class StorePairGeneric <T extends Comparable<T>> implements Comparable<StorePairGeneric<T>> {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);
        
        System.out.println(a.compareTo(c));
        System.out.println(a.equals(c));
    }
    
    private T first, second;
    
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

//    @Override // default
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final StorePairGeneric<?> other = (StorePairGeneric<?>) obj;
//        return Objects.equals(this.first, other.first);
//    }
    
    @Override
    public boolean equals(Object other) { 
        StorePairGeneric<T> o = (StorePairGeneric<T>) other;
        return this.first.equals(o.getFirst());
    }

   
    @Override
    public int compareTo(StorePairGeneric<T> other) {
        return this.first.compareTo(other.getFirst());
    }
    
    
}
