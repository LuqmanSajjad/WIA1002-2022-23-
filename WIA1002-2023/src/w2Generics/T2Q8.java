/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w2Generics;

import Tutorial.w2Generics.*;
import java.util.ArrayList;

/**
    Assuming that two new object are created as follows
    ArrayList<Integer> numOfCars = new ArrayList<>();
    ArrayList<Double> milesPerHour = new ArrayList<>();
    Using the <?> wildcard, implement a generic method that displays the list.
    * 
 * @author jad
 */
public class T2Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        numOfCars.add(2);
        numOfCars.add(4);
        numOfCars.add(6);
        printAll(numOfCars);
        
        ArrayList<Double> milesPerHour = new ArrayList<>();
        milesPerHour.add(45.2);
        milesPerHour.add(67.8);
        milesPerHour.add(89.1);
        printAll(milesPerHour);
    }
    
    static void printAll(ArrayList<?> array) {
        for(Object element: array) {
            System.out.println(element);
        }
    }
}