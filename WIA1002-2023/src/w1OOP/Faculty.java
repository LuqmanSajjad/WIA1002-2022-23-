/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1OOP;

/**
 *
 * @author jad
 */

class Person {
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
    
    public Employee(String s) {
        System.out.println(s);
    }
}

public class Faculty extends Employee {
    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }
    
    public static void main(String[] args) {
        new Faculty(); // Faculty is instantiated 
        System.out.println("\n\nNEW");
        
    }
}

// the constructor of the super class will always be invokd first.
// the constructo of a subclass will call the superclass constuctor first


// it does not work