/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w2Generics;

import Tutorial.w2Generics.*;

/**
    5.  Create a generic class named Duo that has two parameters, A and B. Declare a variable named first of
        type A, and the second variable named second of type B. Create a constructor that accepts these two
        parameters. In the constructor, assign these parameters respectively to the declared variables. 
        * 
    6.  Use the Duo class in Question 4 to declare and create two objects as follows :
            a. First object called sideShape consist of respectively String type and Integer type.
            b. Second object called points consists of two Double types. 
    * 
    * 
 * @author jad
 */
public class Duo <A, B>  {
    private A a;
    private B b;
    
    public Duo(A a, B b) {
        this.a = a;
        this.b = b;
    }
    
    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("Kotak",223);
        Duo<Double, Double> points = new Duo<>(3214.321, 12345.2342);  
    }        
}
