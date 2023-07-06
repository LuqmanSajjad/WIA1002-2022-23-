/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalJun2022;

import java.util.Stack;

/**
 *
 * @author jad
 */
public class q2ReverseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Switch");
        stack.push("MOtherboard");
        stack.push("ram");
        
        stack = reverseStack(stack);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
    static <T> Stack<T> reverseStack (Stack<T> stack) {
        Stack<T> reversed = new Stack<>();
        while (!stack.isEmpty()) {
            reversed.push(stack.pop());
        }
        return reversed;
    } 
}


/*
debug please i don't understand why it doesn't work
*/
//static <T> void reverseStack (Stack<T> stack) {
//        Stack<T> reversed = new Stack<>();
//        while (!stack.isEmpty()) {
//            reversed.push(stack.pop());
//        }
//        stack = reversed;
//    } 