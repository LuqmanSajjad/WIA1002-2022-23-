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
public class DIOStack<V> {
    
    public static void main(String[] args) {
//        DIOStack<String> = new DIOStack<>();
    }
    
    
    private V[] array = (V[]) new Object[1];
    private int size = 0;

    public void push(V o) {
        if (array.length == size) {
            V[] newArray = (V[]) new Object[array.length*2];
            
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        } 
        array[size] = o;
        size++;
    }

    public V pop() {
        if (size==0) return null;
        
        V removed = array[size-1];
        array[size-1] = null;
        size--;
        if (size == array.length/4) {
            V[] newArray = (V[]) new Object[array.length/2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        return removed;
    }

    public V peek() {
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
        for (V element: array) {
            if (element == null) break;
            output += ("\n" + element.toString());
        }
        return output;
    }

    private void resize(int size) {
        if (size < array.length) System.out.println("to small to fit all");
        else {
            V[] newArray = (V[]) new Object[size];
            System.arraycopy(array, 0, newArray, 0, this.size);
            array = newArray;
        }
    }
}
