/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.w1OOP;

/**
 *
 * @author jad
 */
public class Telephone {
    private String areaCode, number;
    private static int numberOfTelephoneObject=0;
    
    public static void main(String[] args) {
        
        Telephone[] tellList = {
            new Telephone("03", "79676300"),
            new Telephone("03", "79676301"),
            new Telephone("03", "79676302"),
            new Telephone("03", "79676303"),
            new Telephone("03", "79676304")
        };
        
        for(Telephone number: tellList) {
            System.out.println(number.makeFullNumber());
        }
    }
    
    public Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        this.numberOfTelephoneObject++;
    }
    
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public void setNumber (String number) {
        this.number = number;
    }
    
    public String getAreaCode() {
        return areaCode;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String makeFullNumber() {
        return (areaCode + "-" + number);
    }
}
