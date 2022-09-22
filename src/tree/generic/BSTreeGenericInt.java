package tree.generic;

import tree.generic.GenericNode;

public class BSTreeGenericInt<T extends Comparable<T>> implements GenericTreeInterface {

    private GenericNode root;
    private int size;

    @Override
    public void add(Comparable data) {
        if (root == null) root = new GenericNode(data);
        else root.add(data);
    }

    @Override
    public boolean remove(Comparable data) {
        return false;
    }

    @Override
    public void printInOrder() {

    }

    @Override
    public void printPreOrder() {

    }

    @Override
    public void printPostOrder() {

    }

    @Override
    public boolean contains(Comparable data) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}


