/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w2Generics;

/**
 3.a)  Modify the following program to become a generic class called
        StorePairGeneric. public class StorePair {
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
* 
 * @author jad
 * @param <T>
 */
public class StorePairGeneric <T> {
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
}
