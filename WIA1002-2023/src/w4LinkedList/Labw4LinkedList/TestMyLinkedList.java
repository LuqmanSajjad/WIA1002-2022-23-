/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w4LinkedList.Labw4LinkedList;

/**
 *
 * @author jad
 */
public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");
        
        System.out.println("Elements in the list: ");
        list.print();
        
        System.out.println("Reversed elements in the list: ");
        list.reverse();
        
        System.out.println("Number of elements in the list: " + list.size());
        
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        
        System.out.println("Removing third element: " + list.remove(2));
        
        System.out.println("Index of second element: " + list.indexOf("b"));
        System.out.println("Index of third element: " + list.indexOf("c"));
        
        System.out.println("Does the list contain 'c'? " + list.contains("c"));
        
        System.out.println("Replacing elements in the list: ");
        list.set(0, "j");
        list.set(1, "a");
        list.set(2, "v");
        list.set(3, "a");
        list.print();
    }
}