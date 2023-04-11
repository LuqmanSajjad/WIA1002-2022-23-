/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1OOP.Labw1OOP;

/**
 *
 * @author jad
 */
public class Account1 extends Account{
    private String name;
    
    public Account1 (String name, int id, double balance) {
        this.name = name;
        super.setId(id);
        super.setBalance(balance);
    }
} 
