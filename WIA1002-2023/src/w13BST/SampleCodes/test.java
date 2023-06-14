/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w13BST.SampleCodes;

/**
 *
 * @author jad
 */
public class test {
    public static void main(String[] args) {
        BST<Integer> tree= new BST<>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(12);
        tree.insert(11);
        tree.insert(13);
        
        tree.delete(10);
        if (tree.path(5) == null) {
            System.out.println("5 no longer found");
        }
    }
}
