/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w6Stacks;

import java.util.Scanner;

/**
 * this program checks whether a string is palindrome or not using stacks
 * @author jad
 */
public class Palindrome {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter a string of maximum size 15 characters: ");
        String input = scan.nextLine();
        System.out.printf("Checking Palindrome status for word %s", input);
        System.out.printf("\nMy solution            : %b", input, isPalindrome(input));
        System.out.printf("\nOptimized from chatGPT : %b\n", input, checkPalindrome(input));
        
    }
    
    public static boolean isPalindrome(String input) {
        MyStack<Character> stack = new MyStack<>();
        
        for (int i=0; i<input.length(); i++) {
            stack.push(input.charAt(i));
        }
        
        for (int i=0; i<input.length(); i++) {
            if(stack.pop()!=input.charAt(i)) 
                return false;
        }
        return true;
    }
    
    public static boolean checkPalindrome(String input) {
        MyStack<Character> stack = new MyStack<>();
        int mid = input.length()/2;
        if (input.length() %2 != 0) mid++;
        
        for (int i=0; i<mid ; i++)              // store the first half
            stack.push(input.charAt(i));
        
        for (int i=mid; i<input.length() ; i++)      // compare with the next half
            if(stack.pop()!=input.charAt(i)) return false;

        return true;
    }
}
