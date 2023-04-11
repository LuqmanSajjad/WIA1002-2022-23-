/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1OOP.Labw1OOP;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jad
 */
public class Account {
    private int id=0;
    private double balance=0;
    private static double annualInterestRate=0;
    private Date dateCreated = new Date();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account() {}

    public double getMonthlyInterestRate() {
        return annualInterestRate/100 / 12;
    }
    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    
    public double deposit(double deposit) {
        balance += deposit;
        transactions.add(new Transaction('D', deposit, balance, "Success", new Date()));
        return balance;
    }

    public void withdraw(double withdraw) {
        if (withdraw <= balance) {
            balance -= withdraw;
            transactions.add(new Transaction('W', withdraw, balance, "Success", new Date()));
        } else
            transactions.add(new Transaction('W', withdraw, balance, "Failure", new Date()));
    }
    
    public void display() {
        System.out.print("\nDATE                         TYPE  AMOUNT    BALANCE DESCRIPTION");
        for(Transaction transaction: transactions) {
            transaction.display();
        }
    }
    
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}

//    Implement a class named Account that contains:
//    ■ A private int data field named id for the account (default 0).
//    ■ A private double data field named balance for the account (default 0).
//    ■ A private double data field named annualInterestRate that stores the current interest rate
//    (default 0). Assume all accounts have the same interest rate.
//    ■ A private Date data field named dateCreated that stores the date when the account was
//    created.
//    ■ A no-arg constructor that creates a default account.
//    ■ A constructor that creates an account with the specified id and initial balance.
//    ■ The accessor and mutator methods for id, balance, and annualInterestRate.
//    ■ The accessor method for dateCreated.
//    ■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
//    ■ A method named getMonthlyInterest() that returns the monthly interest.
//    ■ A method named withdraw that withdraws a specified amount from the account.
//    ■ A method named deposit that deposits a specified amount to the account.
//    (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
//    Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is
//    annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g., like 4.5%. You
//    need to divide it by 100.) Write a test program that creates an Account object with an account ID
//    of 1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method to
//    withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly
//    interest, and the date when this account was created.