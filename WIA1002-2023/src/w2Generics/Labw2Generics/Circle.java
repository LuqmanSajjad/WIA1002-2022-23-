/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w2Generics.Labw2Generics;

/**
 *Create a Circle class that uses the Comparable interface. Declare the
    radius variable and a single parameterized constructor that accepts
    this variable.
    In your main program, create 3 different objects of type array (a) for
    integers that stores the following values, 1,2,3; (b) a list of string that
    stores red, green, blue and (c) a circle object of radius 3, 2.9 and 5.9.
    Invoke the max method as below:
    public static <E extends Comparable<E>> E max(E[] list)
 The max method above returns the maximum value in an array. 
 * @author jad
 */
public class Circle implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 1;
    }
    
}
