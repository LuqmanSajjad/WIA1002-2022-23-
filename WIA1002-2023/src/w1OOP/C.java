/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1OOP;

/**
 *
 * @author jad
 */
public class C {
    public static void main(String[] args) {
        Object[] o = {new A(), new B()};     // polynomial
        System.out.print(o[0]);   
        System.out.print(o[1]);
    }
 }

class A extends B {            
    public String toString() { // overriding to the superclass B occurs
        return "A";
    }
 }

 class B {
    public String toString() { // overriding occurs
        return "B";
    } 
 }

// output : AB