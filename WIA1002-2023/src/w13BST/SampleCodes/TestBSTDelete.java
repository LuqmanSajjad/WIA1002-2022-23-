package w13BST.SampleCodes;

public class TestBSTDelete {
  public static void main(String[] args) {
    BST<Integer> tree = new BST<>();
    tree.insert(90);
    tree.insert(50);
    tree.insert(40);
    tree.insert(30);
    tree.insert(100);
    tree.insert(200);
    tree.insert(130);
    printTree(tree);

    System.out.println("\nAfter delete 90 (root):");
    tree.delete(90);
    printTree(tree);

    System.out.println("\nAfter delete 50:");
    tree.delete(50);
    printTree(tree);

    System.out.println("\nAfter delete 130:");
    tree.delete(130);
    printTree(tree);
  }

  public static void printTree(BST tree) {
    // Traverse tree
    System.out.print("Inorder (sorted): ");
    tree.inorder();
    System.out.print("\nPostorder: ");
    tree.postorder();
    System.out.print("\nPreorder: ");
    tree.preorder();
    System.out.print("\nThe number of nodes is " + tree.getSize());
    System.out.println();
  }
}
