/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.w2Generics;

/**
Create a generic class called Container that accepts one parameter, T. Create a no-arg constructor.
Declare a private variable, t of type T. Create a method, add that returns nothing, accepting a
parameter of generic type. Initialize this parameter to the initially declared variable. Create a generic
method called retrieve() that returns the initially declared variable.
Create a main method within the Container class. 
* 
Create two containers of type Integer and String.
Append two objects to the containers, one of type Integer having value 50, another of type String
having value Java. Display the Integer and String objects from the respective containers.

 * @author jad
 */
public class Container <T> {
    private T t;
    
    public Container() {}
    
    public void add(T t) {
        this.t = t;
    }
    
    public T retrieve() {
        return t;
    }
    
    public static void main(String[] args) {
        Container<Integer> number = new Container<>();
        number.add(50);
        System.out.println(number.retrieve());
        
        Container<String> word = new Container<>();
        word.add("Java");
        System.out.println(word.retrieve());
    }
}
