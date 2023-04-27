/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w6Stacks;

import Main.java;
import java.util.Scanner;

/**
Question 2
Write a new test program for Q1(a) called TestIntMyStack class.
    a) Prompt user to enter an integer value.
    b) Push the values 1 through the user entered value onto the stack.
    c) Print the size of the stack.
    d) Display the contents of the stack by repeatedly calling pop() until the
    stack is empty.

What is the output of the elements? What is the order, why?

 * @author jad
 */
public class TestMyIntStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 10 values to be push into the stack: \n");
        for (int i = 0; i < 10; i++)
            stack.push(scan.nextInt());
        
        System.out.println("\nStack size: "+stack.getSize());
        
        // display
        System.out.println("\nPrinting the stack using pop()");
        for (int i = 0; !stack.isEmpty() ; i++) {
            System.out.println(stack.pop());
        }
    }
}
