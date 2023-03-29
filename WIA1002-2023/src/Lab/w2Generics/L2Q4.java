/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w2Generics;

import java.lang.reflect.Array;

/**
    Provide a declaration and implementation of the generic method
    minmax() that takes in an array of generic type and returns a string
    with the following format: Min = <minValue> Max = <maxValue>. For
    instance, in your main method, create one object of type array for
    integers and one object of type string:
    
    Integer[] intArray = {5,3,7,1,4,9,8,2};
    String[] strArray = {"red", "blue", "orange", "tan"};
    
    minmax() method returns “Min = 1 Max = 9” For intArray
    minmax() method returns “Min = blue Max = tan” for strArray
    *Hint: use Comparable interface to compare the values
    *Hint: compareTo() method:
         if a > b, it returns positive number
         if a < b, it returns negative number
         if a == b, it returns 0 
 * @author jad
 */
public class L2Q4 {
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
    
    public static <T extends Comparable<T>> String minmax(T[] array) { 
        T max = array[0];
        T min = array[0];
        for(T element: array) {
            if (max.compareTo(element) < 0) 
                max = element;
            if (min.compareTo(element) > 0) 
                min = element;
        }
        return "Min = " + min.toString() + ", Max = " + max.toString();
    } 
}
