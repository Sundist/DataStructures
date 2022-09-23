package tree;

public class BSTreeInt implements TreeIntInterface {
    private Node root;
    private int size;

    @Override
    public void add(int data) {
        if (root == null) root = new Node(data);
        else root.add(data);
        size++;
    }

    @Override
    public boolean remove(int data) {
        return false;
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
        if (root != null) {
            root = root.left;
            root = root.right;
            System.out.print(root.data + " ");
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

    public void add(int data) {
        if (data < this.data) {
            if (left != null) this.left.add(data);
            else left = new Node(data);
        } else if (data > this.data) {
            if (right != null) this.right.add(data);
            else right = new Node(data);
        }
    }

}