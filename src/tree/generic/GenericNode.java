package tree.generic;

public class GenericNode<T extends Comparable<T>> {
    T data;
    GenericNode<T> left;
    GenericNode<T> right;

    GenericNode() {
        data = null;
    }

    GenericNode(T data) {
        this.data = data;
    }

    public void add(T data) {
        if (data.compareTo(this.data) < 0) {
            if (left != null) this.left.add(data);
            else left = new GenericNode<>(data);
        } else if (data.compareTo(this.data) > 0) {
            if (right != null) this.right.add(data);
            else right = new GenericNode<>(data);
        }
    }

}
