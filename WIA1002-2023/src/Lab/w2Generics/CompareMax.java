/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w2Generics;

import java.util.ArrayList;

/**
2.  In a class called CompareMax, create a generic static method called
    maximum where the generic type extends the Comparable interface,
    which receives three parameters. Find the maximum of three values
    invoked by the main method.
    
 * @author jad
 */
public class CompareMax {
    public static void main(String[] args) {
        System.out.println(maximum(1,12,3));
        System.out.println(maximum(1232.32, 325.22, 234.23));
        
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(5);
        
        System.out.println(test);
    }
    
    static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        if(a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if (b.compareTo(c) > 0)
            return b;
        else 
            return c;
    }
    
}

/*
alt : more optimized in theoratically:

public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
*/