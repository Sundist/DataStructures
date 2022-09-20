package list.generic;

public class DoublyNode<T> {

    T data;

    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(T data) {
        this.data = data;
    }
}
