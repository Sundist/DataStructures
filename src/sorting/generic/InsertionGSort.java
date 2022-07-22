package sorting.generic;

public class InsertionGSort<T extends Comparable<T>> implements SortG<T> {
    @Override
    public void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T current = array[i];
            int k;
            for (k = i - 1; k >= 0 && (array[k].compareTo(current) > 0); k--)
                array[k + 1] = array[k];
            array[k + 1] = current;
        }
    }

    @Override
    public String name() {
        return "Insertion Generic";
    }
}
