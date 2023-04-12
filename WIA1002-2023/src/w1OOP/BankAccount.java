/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1OOP;

/**
 *
 * @author jad
 */
public class BankAccount implements Account {
    private int balance;
    
    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int deposit(int deposit) {
        balance += deposit;
        return balance;
    }

    @Override
    public boolean withdraw(int withdraw) {
        if (withdraw <= balance) {
            balance -= withdraw;
            return true;
        } else
            return false;
    }
}
