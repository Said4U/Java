package com.company;

public class BinaryTree {

    int root;
    BinaryTree leftChild;
    BinaryTree rightChild;
    BinaryTree t;
    BinaryTree r;
    BinaryTree m;

    public BinaryTree(int root) {
        this.root = root;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void insertLeft(int newNode) {
        if (this.leftChild == null)
            this.leftChild = new BinaryTree(newNode);
        else {
            t = new BinaryTree(newNode);
            t.leftChild = this.leftChild;
            this.leftChild = t;
        }
    }

    public void insertRight(int newNode) {
        if (this.rightChild == null)
            this.rightChild = new BinaryTree(newNode);
        else {
            t = new BinaryTree(newNode);
            t.rightChild = this.rightChild;
            this.rightChild = t;
        }
    }

    public BinaryTree getLeftChild() {
        return leftChild;
    }

    public BinaryTree getRightChild() {
        return rightChild;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public boolean search(int n) {
        int count = 0;
        r = new BinaryTree(this.root);
        r.leftChild = this.leftChild;
        r.rightChild = this.rightChild;

        while (n != r.root) {
            count++;
            if (n < r.root) {
                if (r.getLeftChild() == null)
                    return false;
                m = new BinaryTree(r.leftChild.root);
                m.leftChild = r.leftChild.leftChild;
                m.rightChild = r.leftChild.rightChild;
            } else {
                if (r.getRightChild() == null)
                    return false;
                m = new BinaryTree(r.rightChild.root);
                m.leftChild = r.rightChild.leftChild;
                m.rightChild = r.rightChild.rightChild;
            }
            r = m;
        }
        System.out.println("count = " + count);
        return true;
    }

    public String print(BinaryTree newTree) {
        if (newTree.getLeftChild() == null && newTree.getRightChild() != null)
            return newTree.getRoot() + "(" + newTree.getLeftChild() + " , " + print(newTree.getRightChild()) + ")";
            if (newTree.getRightChild() == null && newTree.getLeftChild() != null)
                return newTree.getRoot() + "(" + print(newTree.getLeftChild()) + " , " + newTree.getRightChild() + ")";
            if (newTree.getRightChild() == null && newTree.getLeftChild() == null)
                return newTree.getRoot() + "(" + newTree.getLeftChild() + " , " + newTree.getRightChild() + ")";

            return (newTree.getRoot() + "(" + print(newTree.getLeftChild()) + " , " + print(newTree.getRightChild()) + ")");
    }
}





