/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w13BST.BST;

/**
 *
 * @author jad
 */
public class TreeNode<E extends Comparable<E>> implements Comparable<E> {
    E element;
    TreeNode<E> right;
    TreeNode<E> left;
    
    public TreeNode (E element) {
        this.element = element;
        right = null;
        left = null;
    }
    
    @Override
    public int compareTo(E o) {
        return this.element.compareTo(o);
    }
}
