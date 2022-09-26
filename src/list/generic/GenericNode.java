package list.generic;

public class GenericNode<T> {

    T data;
    GenericNode<T> next;

    public GenericNode(T data) {
        this.data = data;
    }
}
