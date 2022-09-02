package tree;

public class BSTreeInt implements TreeIntInterface {
    private Node root;
    private int size;

    @Override
    public void add(int data) {
        if (root == null)
            root = new Node(data);
        else root.add(data);
    }

    @Override
    public boolean remove(int data) {
        return false;
    }

    @Override
    public boolean contains(int data) {
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

    Node(int data) {
        this.data = data;
    }

    public void add(int data) {
        if (data < this.data) {
            if (left != null)
                this.left.add(data);
            else
                left = new Node(data);
        } else if (data > this.data) {
            if (right != null)
                this.right.add(data);
            else
                right = new Node(data);
        }
    }
}