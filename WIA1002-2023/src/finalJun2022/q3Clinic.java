/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalJun2022;

import java.util.ArrayList;

/**
 *
 * @author jad
 * 
 * 
 * a) 9
 * b) 
 * c) 
 */
public class q3Clinic <E> {
    private int size=10;
    private int front=0;
    private int end = 9;
    
    private ArrayList<E> list = new ArrayList<E>(size);
    
    public boolean enqueue(E o) {
        boolean success = false;
        if (end<size) {
            success = list.add(o);
            end = list.indexOf(o);
        }
        return success;
    }
    
    public E dequeue() {
        if (front==end) 
            return null;
        E patient = list.get(front);
        front++;
        return patient;
    }
    
    public String queueToString() {
        String output = "";
        for (int i=front; i<=end; i++) 
            output += list.get(i).toString() + ", ";
        return output;
    }
    
    public String allToString() {
        return "ALL : " + list.toString();
    }
    
    public static void main(String[] args) {
        q3Clinic<String> q = new q3Clinic<>();
        q.enqueue("Shiela");
        q.enqueue("Alif");
        q.enqueue("Ubay");
        q.enqueue("razin");
        q.enqueue("nel");
        q.enqueue("diqa");
        
        q.dequeue();
        q.dequeue();
        System.out.println(q.queueToString());
        
    }
}
