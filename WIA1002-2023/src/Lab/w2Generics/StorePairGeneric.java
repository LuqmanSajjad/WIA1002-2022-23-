/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w2Generics;

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
 * @param <T>
 */

public class StorePairGeneric <T> implements Comparable<T> {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);
        // equals and compareTo method invocation
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
    
    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    
    public boolean equals(StorePairGeneric<T> obj) { // doesn't override tho, must use object data type insted of StorePair.. to override
        if (!(obj instanceof StorePairGeneric)) 
            return (obj.getFirst() == this.first);
        else return false;
    }

    @Override
    public int compareTo(T o) { // why the class is not StoreGen..
        return 0;               // gave up.
                                // thinking about using compareTo() but the type is missmatching. 
    }
    
    // @Override // Razin's answer, seen on stack
    public int compareTo(StorePairGeneric<T> o) {

        if (this.equals(o)) {
            return 0;
        }

        int cmp = ((Comparable<T>) this.getFirst()).compareTo(o.getFirst());

        if (cmp != 0) {
            return cmp;
        } else {
            return ((Comparable<T>) this.getSecond()).compareTo(o.getSecond());
        }
    }
    
    
    
}
