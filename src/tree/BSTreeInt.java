package tree;

import tree.generic.GenericNode;

import java.util.Stack;

public class BSTreeInt implements TreeIntInterface {
    private Node root;
    private int size;

    @Override
    public void add(int data) {
        if (root == null) root = new Node(data);
        else add(root, data);
    }

    private void add(Node node, int data) {
        if (data < node.data) {
            if (node.left != null) add(node.left, data);
            else {
                node.left = new Node(data);
                size++;
            }
        } else if (data > node.data) {
            if (node.right != null) add(node.right, data);
            else {
                node.right = new Node(data);
                size++;
            }
        }
    }

    @Override
    public boolean remove(int data) {
        Node current = root;
        while (current != null && current.data != data) {
            if (data < root.data)
                current = current.left;
            else
                current = current.right;
        }
        if (current == null)
            return false;

        if (current.right != null) {
            current.data = current.right.data;
            current.right = null;
        } else {
            current.data = current.left.data;
            current.left = null;
        }
        size--;
        return true;
    }

    @Override
    public boolean contains(int data) {
        Node current = root;
        if (current == null) return false;
        while (current != null) {
            if (data < current.data) current = current.left;
            else if (data > current.data) current = current.right;
            else return true;
        }
        return false;
    }

    @Override
    public void printInOrder() {
        if (root != null) {
            root = root.left;
            System.out.print(root.data + " ");
            root = root.right;
        }
    }

    @Override
    public void printPreOrder() {
        if (root != null) {
            System.out.print(root.data + " ");
            root = root.left;
            root = root.right;
        }
    }

    @Override
    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.println(root.data);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node() {
        data = 0;
    }

    Node(int data) {
        this.data = data;
    }
}