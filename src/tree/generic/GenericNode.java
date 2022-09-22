package tree.generic;

import java.math.BigInteger;

public class GenericNode<T> {
    T data;
    GenericNode left;
    GenericNode right;

    GenericNode() {
        data = null;
    }

    GenericNode(T data) {
        this.data = data;
    }

    public void add(Comparable data) {
        if (data.compareTo(this.data) == -1) {
            if (left != null) this.left.add(data);
            else left = new GenericNode(data);
        } else if (data.compareTo(this.data) == 1) {
            if (right != null) this.right.add(data);
            else right = new GenericNode(data);
        }
    }

}
