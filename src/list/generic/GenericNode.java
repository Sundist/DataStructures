package list.generic;

public class GenericNode<T> {

    T data;
    GenericNode next;

    public GenericNode(T data) {
        this.data = data;
    }
}
