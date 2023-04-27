/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w6Stacks;

import java.util.ArrayList;

/**
 Question 1 : create a MyStack class using ArrayList.
 * implement the following methods
 * 1) public void push(E 0);
2) public E pop();
3) public E peek();
 * @author jad
 */
public class MyStack <E> {
    private ArrayList<E> stack = new ArrayList<>();
    
    public void push(E o) {
        stack.add(o);
    }
    
    public E pop() {
        return stack.remove(stack.size() -1);
    }
    
    public E peek() {
        return stack.get(stack.size() -1);
    }
    
    public int getSize() {
        return stack.size();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public String toString() {
        return stack.toString();
    }
    
    public boolean search(E o) {
        return stack.contains(o);
    }
}
