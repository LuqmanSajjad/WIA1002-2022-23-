/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.w1;

/**
 *
 * @author jad
 */
public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setId(1122);
        acc1.setBalance(200000);
        acc1.setAnnualInterestRate(4.5);
        
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.println("Balance         : RM" + acc1.getBalance());
        System.out.println("Monthly Interest: RM" + acc1.getMonthlyInterest());
        System.out.println("Date Created    : " + acc1.getDateCreated());
        
        // Account1 class
        Account1 acc2 = new Account1("George", 1122, 1000);
        acc2.setAnnualInterestRate(1.5);
        acc2.deposit(30);
        acc2.deposit(40);
        acc2.deposit(50);
        acc2.withdraw(5);
        acc2.withdraw(4);
        acc2.withdraw(2);
        acc2.display();
        
        System.out.println();
    }
}
//    Write a test program that creates an Account object with an account ID
//    of 1122, a balance of $20,000, and an annual interest rate of 4.5%. 

//    Use the withdraw method to
//    withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly
//    interest, and the date when this account was created.


//    Write a test program that creates an Account1 object with annual interest rate 1.5%, balance
//    1000, id 1122, and name George. Deposit $30, $40, and $50 to the account and withdraw $5, $4,
//    and $2 from the account. Print an account summary that shows account holder name, interest
//    rate, balance, and all transactions.