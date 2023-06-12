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
public class RecurseApplication {
    public static void main(String[] args) {
        System.out.println(F(4,3));
    }
    
    public static ArrayList<int[][]> basket() {
        return null;
    }
    
    public static int F(int s, int t) {
        if (t==1) {
            return 1;
        }
        if (s==1) {
            return t ;
        }
        return F(s-1, t) + F(s, t-1);
    }
    
    public static int F(int s) {
        if (s<=0) 
            return 1;
        return s * F(s-1);
    }
}

