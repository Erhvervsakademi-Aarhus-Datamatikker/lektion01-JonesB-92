package opgave01;

import examples.model.TreeNode;
import opgave01.model.BinarySearchTreeImpl;

public class Main {
    static void main() {
        TreeNode<Integer> root = new TreeNode<>(60);
        TreeNode<Integer> left = new TreeNode<>(55);
        root.setLeft(left);
        TreeNode<Integer> right = new TreeNode<>(100);
        root.setRight(right);
        left.setLeft(new TreeNode<>(45));
        left.setRight(new TreeNode<>(57));
        right.setLeft(new TreeNode<>(67));
        right.setRight(new TreeNode<>(107));
        BinarySearchTreeImpl<Integer> binarySearchTree = new BinarySearchTreeImpl<>(root);
        System.out.println("Indeholder det binære søgetræ 100? " + (binarySearchTree.search(100) ? "Ja" : "nej"));
    }
}

