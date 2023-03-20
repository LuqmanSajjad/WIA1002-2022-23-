/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w2Generics;

/**
 Create a generic class called MyGeneric that accepts one parameter.
Declare a variable called e for the type parameter. Create a no-arg
constructor. Create a constructor that accepts one generic parameter.
Create a setter and getter method for the generic type.
* 
Create a test program that creates two instances of generic class of
type String called strObj and of type Integer called intObj. Set a
value for each of these objects. Display these values using the getter
method.
* 
* 
 * @author jad
 */
public class MyGeneric <e> {
    private e stuff;
    
    public MyGeneric() {}
    
    public void set(e stuff) {
        this.stuff = stuff;
    }
        
    public e get() {
        return stuff;
    }
    
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric();
        strObj.set("hello");
        
        MyGeneric<Integer> intObj = new MyGeneric();
        intObj.set(2342);
        
        System.out.println("String object value     : " + strObj.get());
        System.out.println("Integer object value    : " + intObj.get());
    }
}
