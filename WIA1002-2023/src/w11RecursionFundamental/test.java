/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w11RecursionFundamental;

import java.util.ArrayList;

/**
 *
 * @author jad
 */
//
//1. Create a recursive function that accepts a String parameter, and substitute any of the
//lowercase “a” (no applicable for uppercase "A") found with “i” char. Example:
//substituteAI ("flabbergasted ") → "flibbergisted "
//substituteAI ("Astronaut ") → " Astroniut" 

public class test {
    public static void main(String[] args) {
        System.out.println(permutateString("ABC"));
    }
    
    /*
    returns the first letter tranverse through the string.
    */
    public static ArrayList<String> permutateString(String string) {
        ArrayList<String> permutations = new ArrayList<>();
        if (string.length() == 1) {
            permutations.add(string);
            return permutations;
        }
        
        char letter = string.charAt(0);
        ArrayList<String> words = permutateString(string.substring(1));
        
        for(String newStr: words) {
            for(int i=0; i<newStr.length(); i++) {
                String permutation = newStr.substring(0,i) + letter + newStr.substring(i);
                System.out.println(permutation);
                permutations.add(permutation);
            }
        }
        return permutations;
    }
}

