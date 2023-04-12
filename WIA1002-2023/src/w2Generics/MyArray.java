/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w2Generics;


/**
 Create a class called MyArray that has two methods, a <main method that creates 3 arrays> of
    a) integer containing the numbers 1,2,3,4 and 5
    b) string containing names, Jane, Tom and Bob
    c) character containing alphabet, a, b and c
    
 and a <generic method listAll> that displays the list of arrays
 
 * @author jad
 */
public class MyArray {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] characters = {'a', 'b', 'c'};
        
        listAll(numbers);
        listAll(names);
        listAll(characters);
    }
    
    public static <T> void listAll(T[] array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}
