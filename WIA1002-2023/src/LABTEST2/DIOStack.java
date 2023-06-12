/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABTEST2;

/**
 *
 * @author jad
 * 
 * 
 */
public class DIOStack<DIO> {
    
    public static void main(String[] args) {
//        DIOStack<String> = new DIOStack<>();
    }
    
    
    private DIO[] array = (DIO[]) new Object[1];
    private int size = 0;

    public void push(DIO o) {
        if (array.length == size) {
            DIO[] newArray = (DIO[]) new Object[array.length*2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        } 
        array[size] = o;
        size++;
    }

    public DIO pop() {
        if (size==0) return null;
        
        DIO removed = array[size-1];
        array[size-1] = null;
        size--;
        if (size == array.length/4) {
            DIO[] newArray = (DIO[]) new Object[array.length/2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        return removed;
    }

    public DIO peek() {
        return (size==0)? null : array[size-1];
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        String output = "";
        for (DIO element: array) {
            if (element == null) break;
            output += ("\n" + element.toString());
        }
        return output;
    }

    private void resize(int size) {
        if (size < array.length) System.out.println("to small to fit all");
        else {
            DIO[] newArray = (DIO[]) new Object[size];
            System.arraycopy(array, 0, newArray, 0, this.size);
            array = newArray;
        }
    }
}
