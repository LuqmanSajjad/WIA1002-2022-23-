/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.w3ADT.T3Q1_CandyMachine;

/**
 *
 * @author jad
 */
public class CashRegister {
    private double pettyCash;
    
    public CashRegister(double pettyCash) {
        this.pettyCash = pettyCash;
    }
    
    // returns the total price
    public double generateBill(Dispenser[] myDispensers) {
        double totalDue = 0;
        
        System.out.print("\nItem  \t Quantity \t Price/unit");
        for (Dispenser product: myDispensers) {
            System.out.printf("\n%-10s \t %d \t %.2f", product.getProductName(), product.getOrder(), product.getPrice());
            totalDue += product.getOrder() * product.getPrice();
        }
        System.out.printf("\nTotal due: RM %.2f", totalDue);
        return totalDue;
    }
    
    public double pay(double price, double cash) {
        if (cash < price) 
            return -1;
        else
            pettyCash += price;
        return cash - price;        // balance
    }
}
