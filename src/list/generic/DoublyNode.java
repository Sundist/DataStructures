package list.generic;

public class DoublyNode<T> {

    T data;

    DoublyNode<T> next;
    DoublyNode<T> prev;

    public DoublyNode(T data) {
        this.data = data;
    }
}
