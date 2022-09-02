package sorting.generic;

public class QuickGSort<T extends Comparable<T>> implements SortG<T> {

    @Override
    public void sort(T[] array) {

    }

    public T partition(T[] array, T first, T last) {
        return first;
    }

    public void quickSort(T[] array, int first, int last) {

    }

    @Override
    public String name() {
        return "Quick Generic Sort";
    }
}
