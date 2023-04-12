/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1OOP;

/**
 *
 * @author jad
 */
public class Car extends Vehicles {

    public Car(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void accelerate() {
        currentSpeed += 42;
    }
    
    public static void main(String[] args) {
        double speed = 243;
        Car lamborghini = new Car(speed);
        
        while(lamborghini.getCurrentSpeed()<speed) {
            lamborghini.accelerate();
            System.out.println(lamborghini.getCurrentSpeed());
        }
        
        System.out.println("Max speed reached");
    }
}
