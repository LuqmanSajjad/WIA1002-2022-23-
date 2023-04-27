/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w6Stacks;

/**
 * b) Write a test program for Q1(a) called TestMyStack class. Create a stack of
 * type Character from MyStack.
 *
 * 1) Following the given order, add elements, a b and c in the stack. 2) Print
 * the stack. 3) Check if element ‘b’ is in the stack. 4) Check if element ‘k’
 * is in the stack
 *
 * @author jad
 */
public class TestMyStack {

    public static void main(String[] args) {
        MyStack<Character> chars = new MyStack<>();
        chars.push('a');
        chars.push('b');
        chars.push('c');

        System.out.println("characters Stack: " + chars.toString());

        System.out.println("Element 'b' presence in stack: " + chars.search('b'));

        System.out.println("Element 'k' presence in stack: " + chars.search('k'));

        /*
            c) In the same test program as Q1(b), create a second stack of type integer.
                1) Following the given order, add elements, 1 2 and 3 in the stack.
                2) Print the stack.
                3) Check if element ‘6’ is in the stack.
         */
        
        MyStack<Integer> ints = new MyStack<>();
        ints.push(1);
        ints.push(2);
        ints.push(3);
        
        System.out.println("\n\nintegers stack: "+ints.toString());
        
        System.out.println("Element '6' present in stack: "+ ints.search(6));
    }
}
