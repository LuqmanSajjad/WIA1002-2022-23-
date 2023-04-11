/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3ADT.T3Q1_CandyMachine;

/**
 *
 * @author jad
 */
public class Dispenser {
    private String productName;
    private double price;
    private int stockCount, order=0;
    
    public Dispenser(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stockCount = stock;
    }
    
    public void release() {
        stockCount -= order;
        System.out.printf("\n %d %s released", order, productName);
        order=0; // order reset;
    }
    
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
    
    public int getOrder() {
        return order;
    }

    public void addOrder() {
        order++;
    }
}
