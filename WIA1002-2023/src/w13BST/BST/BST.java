/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w13BST.BST;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jad
 */
public class BST<E extends Comparable<E>> implements Comparable<E> {

    protected TreeNode<E> root;
    protected int size=0;
    
    public BST() {}
    
    public int compareTo(E o) {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /*
    returns true if the element is in the tree
     */
    public boolean search(E e) {
        TreeNode<E> currentNode = root;

        while (currentNode != null) {
            if (currentNode.element.compareTo(e) < 0) {
                currentNode = currentNode.right;
            } else if (currentNode.element.compareTo(e) > 0) {
                currentNode = currentNode.left;
            } else {
                return true;
            }
        }
        return false;
    }
    
    /*
    Insert element o into the binary tree and 
    return true if the element is inserted
    successfully
    
    debug : I suspect that the addition doesn't work properly resulting in failure to use path(). please fix.
    */
    public boolean insert(E e) {
        
        if (root == null) {
            root = new TreeNode<E>(e);
        }
        
        else {
            TreeNode<E> currentNode = root;
            TreeNode<E> parent = null;      // keeping track the parent, 

            while (currentNode != null) {
            //  as we tranverse and find the perfect spot, we must leave a trail behind
                if (e.compareTo(currentNode.element) > 0) {
                    parent = currentNode;
                    currentNode = currentNode.right;
                } 
                else if (e.compareTo(currentNode.element) < 0) {
                    parent = currentNode;
                    currentNode = currentNode.left;
                } 
                else
                    return false; // duplicates
            }

            // just add to the parent
            if (e.compareTo(parent.element) < 0)
                parent.left = currentNode;
            else 
                parent.right = currentNode;
        }
        size++;
        return true;
    }
    
    public int getSize() {
        return size;
    }
    
    public int height() {
        // keeping height through insert method. But removing a node cannot guarantee decrement of height
        return 0;
    }
    
    public E getRoot() {
        return root.element;
    }
    
    public E minValue() {
        TreeNode<E> curNode = root;
        while (curNode.left != null) {
            curNode = curNode.left;
        }
        return curNode.element;
    }
    
    public E maxValue() {
        TreeNode<E> curNode = root;
        while (curNode.left != null) {
            curNode = curNode.right;
        }
        return curNode.element;
    }
    
    /* 
    return a path leading the element
    it's not working correctly, can detect only root atm
    */
    public ArrayList<TreeNode<E>> path(E e) {
        ArrayList<TreeNode<E>> path = new ArrayList<>();
        TreeNode<E> current = root;
        
        while (current!=null) {
            path.add(current);
            System.out.println(current.element);
            if (current.element.equals(e)) {
                return path;
            }
            else if (current.element.compareTo(e) > 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
    
    public boolean delete(E e) {
        ArrayList<TreeNode<E>> path = path(e);
        if (path == null)
            return false;
        else {
            TreeNode<E> parent = root;      // the second last element is the parent to the child to remove
            TreeNode<E> toRemove = root;
            
            while(toRemove != null) {
                parent = toRemove;
                if (toRemove.compareTo(e) > 0) {
                    parent = toRemove;
                    toRemove = toRemove.left;
                } 
                else if (toRemove.compareTo(e) < 0) {
                    parent = toRemove;
                    toRemove = toRemove.right;
                }
                else
                    break;
            }
              
            // The idea is to just attach the right subtree of the to be removed
            // case 1: doesn't have a left child. no problemo, just attach its parent with the right subtree of the to be removed
            if (toRemove.left == null) {
                if(toRemove == root) {
                    root = toRemove.right;
                } 
                else if (toRemove.compareTo(parent.element) > 0)
                    parent.right = toRemove.right;
                else 
                    parent.left = toRemove.right;
            }
            
            // case 2: has a left child, we replace with the rightmost of the left subtree
            else {
                TreeNode<E> rightMostParent = toRemove;       // the second last element is the parent to the child to remove
                TreeNode<E> rightMost = toRemove.left;
                
                while (rightMost.right != null) {
                    rightMostParent = rightMost;
                    rightMost = rightMost.right;
                }
                
                // replace to remove with 
                toRemove.element = rightMost.element;
                
                // eleminate the duplicaate of rightmost
                if (rightMostParent == rightMost) { // the left subtree itself is the right most
                    rightMostParent.left = rightMost.left;  // remember .left, because he doesn't has any rights no more.
                } else {
                    rightMostParent.right = rightMost.left;
                }
            }
        }
        
        size--;
        return true;
    }
    
    public boolean clear () {
        root = null;
        size = 0;
        return true;
    }
    
    protected void inorder(TreeNode<E> root) {
        
    }
        
}
