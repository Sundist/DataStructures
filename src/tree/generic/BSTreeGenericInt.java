package tree.generic;

import tree.generic.GenericNode;

public class BSTreeGenericInt<T extends Comparable<T>> implements GenericTreeInterface {

    private GenericNode root;
    private int size;

    @Override
    public void add(Comparable data) {
        if (root == null) root = new GenericNode(data);
        else root.add(data);
        size++;
    }

    @Override
    public boolean remove(Comparable data) {
        if (contains(data)) {
            GenericNode current = root;
            while (current != null && current.data != data) {
                if (data.compareTo(root.data) == -1)
                    current = current.left;
                else
                    current = current.right;
            }
            if (current.right != null) {
                current.data = current.right.data;
                current.right = null;
            } else {
                current.data = current.left.data;
                current.left = null;
            }
            return true;
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
        if (root != null) {
            root = root.left;
            root = root.right;
            System.out.print(root.data + " ");
        }
    }

    @Override
    public boolean contains(Comparable data) {
        if (root != null) {
            GenericNode current = root;
            while (current.data != null) {
                if (data.compareTo(root.data) == -1)
                    current = current.left;
                else
                    current = current.right;
            }
            return true;
        }
        return false;
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


