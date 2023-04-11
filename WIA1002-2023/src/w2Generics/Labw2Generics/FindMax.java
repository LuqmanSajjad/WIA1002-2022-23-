/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w2Generics.Labw2Generics;

/**
5.      Create a class called FindMax that contains the following:
        Create a Circle class that uses the Comparable interface. Declare the
        radius variable and a single parameterized constructor that accepts
        this variable.
        In your main program, create 3 different objects of type array 
        (a) for integers that stores the following values, 1,2,3; 
        (b) a list of string that stores red, green, blue and 
        (c) a circle object of radius 3, 2.9 and 5.9.
        Invoke the max method as below:
        public static <E extends Comparable<E>> E max(E[] list)
        The max method above returns the maximum value in an array. 
        * 
       
 * @author jad
 */
public class FindMax {
    public static void main(String[] args) {
        Integer[] numbers = {1,72,3};
        String[] colors = {"red", "green",  "blue"};
        Circle[] circles = {
            new Circle(3),
            new Circle(2.9),
            new Circle(5.9)
        };
        
        System.out.println(max(numbers)); // 
        System.out.println(max(circles).toString());
    }
    
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for(E element: list) {
            if (max.compareTo(element) < 0)
                max = element;
        }
        return max;
    }
}


class Circle implements Comparable<Circle>{
    private Double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Double getRadius() {
        return radius;
    }
    
    @Override
    public int compareTo(Circle other) {
        return this.radius.compareTo(other.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}

//if(this.radius > compare.getRadius())
//            return 1;
//        else if (this.radius == compare.getRadius())
//            return 0;
//        else 
//            return -1;