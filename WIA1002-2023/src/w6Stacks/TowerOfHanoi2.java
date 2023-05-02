/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w6Stacks;

/**
 *
 * @author jad
 */
public class TowerOfHanoi2 {
    static MyStack<Integer> peg1 = new MyStack<>();
    static MyStack<Integer> peg2 = new MyStack<>();
    static MyStack<Integer> peg3 = new MyStack<>();
    
    public static void main(String[] args) {
        int totalDisk = 10;
        for (int i=totalDisk; i>0; i--) 
            peg1.push(i);
        
        solve(totalDisk, peg1, peg2, peg3);
    }
    
    public static void solve(int disk, MyStack<Integer> source, MyStack<Integer> dest, MyStack<Integer> helper) {
        if (disk==1) {
            dest.push(source.pop());
            display(peg1, peg2, peg3);
            return;
        }
        solve(disk-1, source, helper, dest);
        dest.push(source.pop());
        display(peg1, peg2, peg3);
        solve(disk-1, helper, dest, source);
    }
    
    public static void display(MyStack<Integer> peg1, MyStack<Integer> peg2, MyStack<Integer> peg3) {
        System.out.println("peg1 : "+peg1);
        System.out.println("peg2 : "+peg2);
        System.out.println("peg3 : "+peg3);
        System.out.println();
    }
}
