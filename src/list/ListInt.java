package list;

public interface ListInt {
    void add(int data);
    boolean remove(int data);
    int removeIndex(int index);
    int get(int index);
    boolean contains(int data);
    int indexOf(int data);
    int size();
    boolean isEmpty();
    void clear();

}
