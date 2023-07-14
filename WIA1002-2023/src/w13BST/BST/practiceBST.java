/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w13BST.BST;

/**
 *
 * @author jad
 */
public class practiceBST <T extends Comparable<T>> {
    
    TreeNode<T> root;
    int size=0;
    
    public boolean insert(T e) {
        TreeNode<T> newNode = new TreeNode<>(e);
        
        if (root==null) {
            root = newNode;
        } else {
            // leaving a trail behind
            TreeNode<T> current = root;
            TreeNode<T> parent = null;
            
            // finding the correct spot to add leaf
            while (current != null) {
                if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else if (e.compareTo(current.element) <0) {
                    parent = current;
                    current = current.left;
                } else {
                    return false;
                }
            }
            
            // add leaf
            if (e.compareTo(parent.element) < 0)
                parent.left = newNode;
            else
                parent.right = newNode;
        }
        size++;
        return true;
    }
    
    public boolean delete(T e) {
        
        return false;
    }
    
    public static void main(String[] args) {
        practiceBST<Integer> tree = new practiceBST<>();
    tree.insert(90);
    tree.insert(50);
    tree.insert(40);
    tree.insert(30);
    tree.insert(100);
    tree.insert(200);
    tree.insert(130);
    printTree(tree);

    System.out.println("\nAfter delete 90 (root):");
//    tree.delete(90);
    printTree(tree);

    System.out.println("\nAfter delete 50:");
//    tree.delete(50);
    printTree(tree);

    System.out.println("\nAfter delete 130:");
//    tree.delete(130);
    printTree(tree);
  }

  public static void printTree(practiceBST tree) {
    // Traverse tree
    System.out.print("Inorder (sorted): ");
//    tree.inorder();
    System.out.print("\nPostorder: ");
//    tree.postorder();
    System.out.print("\nPreorder: ");
//    tree.preorder();
//    System.out.print("\nThe number of nodes is " + tree.getSize());
    System.out.println();
  }
}
