package tree.generic;

public interface GenericTreeInterface <T> {
    void add(T data);

    boolean remove(T data);

    void printInOrder();

    void printPreOrder();

    void printPostOrder();

    boolean contains(T data);

    int size();

    boolean isEmpty();

    void clear();
}
