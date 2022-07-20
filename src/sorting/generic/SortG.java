package sorting.generic;

public interface SortG<T extends Comparable<T>>{

    void sort(T[] array);
    String name();
}
