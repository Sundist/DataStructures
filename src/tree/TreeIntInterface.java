package tree;

import java.util.function.Consumer;

public interface TreeIntInterface {
    void add(int data);

    boolean remove(int data);

    void printInOrder();

    void printPreOrder();

    void printPostOrder();

    /*
    void visitInOrder(Consumer consumer);
    void visitPreOrder(Consumer consumer);
    void visitPostOrder(Consumer consumer);
*/
    boolean contains(int data);

    int size();

    boolean isEmpty();

    void clear();
}
