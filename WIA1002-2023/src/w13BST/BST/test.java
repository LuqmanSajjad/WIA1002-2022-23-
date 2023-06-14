/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w13BST.BST;

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
//        
        
        tree.path(13);
//        
//        int[] yo = {10,5,12,11,13};
//        for (int i: yo) {
//            if (tree.path(i) == null) {
//                System.out.println(i + " no longer found");
//            }
//        }
//        System.out.println(tree.getSize());
        
    }
}
