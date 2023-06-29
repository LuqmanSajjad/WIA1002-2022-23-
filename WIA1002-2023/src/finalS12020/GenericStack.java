/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalS12020;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author jad
 */
public class GenericStack <E> {
    E[] stack;
    int size;
    
    public GenericStack (int size) {
        this.size = 0;
        stack = (E[]) new Object[size];
    }
    
    public boolean isEmpty () {
        return size==0;
    }
    
    public boolean isFull () {
        return size==stack.length;
    }
    
    public E peek() {
        return stack[size-1];
    }
    
    public boolean push (E element) {
        if (isFull()) return false;
        stack[size] = element;
        System.out.println("push: "+element.toString());
        size++;
        return true;
    }
    
    /*
    How to cast string to the generic data type?
    */
    public boolean pushMany (String input) {
        
        // I want to know if any error Handling has to be done if the stack generic type is not string
        System.out.println("pushing Many....");
        Scanner scan = new Scanner(input);
        scan.useDelimiter(",");
        
        while(scan.hasNext()) {
            String element = scan.next();
            push((E)element);
        }
        return true;
    }
    
    
    public E pop () {
        if (isEmpty()) {
            System.out.println("Stack is Empty, nothing to display...");
            return null;   
        }
        E toPop = stack[size-1];
        stack[size-1] = null;
        size--;
        return toPop;
    }
    
    public E popMiddle() {
        if (size%2==0) 
            return null;
        E toPop = stack[size/2];
        try {
            System.arraycopy(stack, size/2+1, stack, size/2, size/2);
            stack[size-1] = null;
            size--;
        } catch (IllegalArgumentException e) {
            System.out.printf("failed trying to copy from index %d of size %d", size/2+1, size/2);
        }
        return toPop;
    }
    
    public void popAll () {
        while (!isEmpty()) {
            System.out.println("Removing "+pop()+"...");
        }
    }
    
    public void display () {
        System.out.printf("\nThere are %d items in stack. Displaying...\n", size);
        
        for (int i=size-1; i>=0; i--) {
            System.out.println("> " + stack[i].toString());
        } 
        System.out.println();
    }
    
    public static void main(String[] args) {
//        GenericStack<String> stack1 = new GenericStack<>(7);
//        stack1.push("apple");
//        stack1.display();
//        
////        
//        stack1.pushMany("broccoli,chicken sandwich,donut,french fires,juice,maruku");
//        stack1.display();
//        System.out.println("Pop the top :" + stack1.pop());
//        System.out.println("Pop the top :" + stack1.pop());
//        stack1.display();
//        System.out.println("pop middle  :" + stack1.popMiddle());
//        
//        stack1.display();
//        System.out.println("pop middle  :" + stack1.popMiddle());
//        System.out.println("--------------");
//        GenericStack<Integer> stack2 = new GenericStack<Integer>(10);
//        stack2.push(1);
//        stack2.push(2);
//        stack2.pushMany("3 4,5,6 7");
//        stack2.display();
//        stack2.popAll();
//        stack2.display();
    }
}

/*
I think I am having hard time figuring out where is the unsafe operation
*/
