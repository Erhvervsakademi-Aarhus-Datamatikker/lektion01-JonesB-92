package opgave01.model;

import examples.model.BinarySearchTree;
import examples.model.TreeNode;

public class BinarySearchTreeImpl<E extends Comparable<E>> extends BinarySearchTree<E> {
    public BinarySearchTreeImpl(TreeNode<E> root) {
        super(root);
    }

    public BinarySearchTreeImpl() {
        super();
    }

    public void inorder() {
        inorder(super.root);
    }

    private void inorder(TreeNode<E> current) {
        //Opgave01
    }

}
