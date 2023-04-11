/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w2Generics.Labw2Generics;

/**
 6. In a class called MinMaxTwoDArray, write two generic methods:
    a. First method returns the minimum element in a two-dimensional
    array. Below is the method signature:
    public static <E extends Comparable<E>> E min(E[][] list)
    b. Second method returns the maximum element in a two-dimensional
    array. Below is the method signature:
    public static <E extends Comparable<E>> E max(E[][] list)
    c. Create a test program that creates one instance of generic class of
    type Integer called numbers with the elements: {4, 5, 6}, {1, 2, 3}.
    Display the minimum and maximum elements using the min and
    max methods.
    * 
    
 * @author jad
 */
public class MinMaxTwoDArray {
    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        System.out.println("min number: " + min(numbers));
        System.out.println("max number: " + max(numbers));
    }
    
    public static <E extends Comparable<E>> E min(E[][] list) {
        E min = list[0][0];
        for(E[] subArray: list) 
            for(E element: subArray) 
                if(min.compareTo(element) > 0) 
                    min = element;
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];
        for(E[] subArray: list) 
            for(E element: subArray) 
                if(max.compareTo(element) < 0) 
                    max = element;
        return max;
    }
}
