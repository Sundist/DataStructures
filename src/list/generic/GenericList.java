package list.generic;

public interface GenericList<T extends Comparable<T>> {
    void add(T data);

    boolean remove(T data);

    T removeIndex(T index);

    T get(T index);

    boolean contains(T data);

    int indexOf(T data);

    int size();

    boolean isEmpty();

    void clear();
}
