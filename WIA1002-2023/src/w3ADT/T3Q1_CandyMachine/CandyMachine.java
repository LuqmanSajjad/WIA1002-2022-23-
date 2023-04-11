/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3ADT.T3Q1_CandyMachine;

import java.util.Scanner;

/**
 *
 * @author jad
 */
public class CandyMachine {
    public static void main(String[] args) {
        Dispenser[] myDispensers = {
            new Dispenser("candy", 1.00, 25),
            new Dispenser("chips", 3.00, 25),
            new Dispenser("gums", 2.00, 25),
            new Dispenser("cookies", 1.50, 25)
        };
        
        CashRegister cashRegister = new CashRegister(25.00);
       
        System.out.println("Welcome to the candy Machine.");
        Scanner scan = new Scanner(System.in);

        displayMenu(myDispensers);
        System.out.println("\nEnter order (AABBCD..)");
        String choice = scan.next();

        // process order
        for(int i=0; i<choice.length(); i++) {
            switch(choice.charAt(i)) {
                case 'A': 
                    myDispensers[0].addOrder();
                    break;
                case 'B': 
                    myDispensers[1].addOrder();
                    break;
                case 'C':
                    myDispensers[2].addOrder();
                    break;
                case 'D':
                    myDispensers[3].addOrder();
                    break;
                default:
                    System.out.println("'" + choice.charAt(i) + "' not registered");
            }
        }
        
        // payment
        double cost = cashRegister.generateBill(myDispensers);
        System.out.print("\nPlease Insert Money (RM XX.XX) : RM ");
        double payment = scan.nextDouble();
        
        double balance = cashRegister.pay(cost, payment);
        if (balance < 0)
            System.out.println("Cash inssufficient, payment failed");
        else
            System.out.printf("Balance: RM %.2f\n", balance);
        
        // release items
        for (Dispenser dispenser: myDispensers)
            dispenser.release();
        
        // end
    }
    
    public static void displayMenu(Dispenser[] myDispensers) {
        char choice = 'A'; 
        for (Dispenser product: myDispensers)
            System.out.printf("\n(%c) %s \t\tRM %.2f", choice++, product.getProductName(), product.getPrice());
    }
}
