/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w1;

import java.util.Date;

/**
 *
 * @author jad
 */
public class Transaction {
    private char type;
    private double amount, balance;
    private String description;
    private Date date;

    public Transaction(char type, double amount, double balance, String description, Date date) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = date;
    }
    
    public void display() {
        System.out.printf("\n%25s %2c %10.2f %10.2f %10s ", date, type, amount, balance, description);
    } 
}
