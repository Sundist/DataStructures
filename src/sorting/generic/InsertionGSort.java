package sorting.generic;

public class InsertionGSort<T extends Comparable<T>> implements SortG<T> {
    @Override
    public void sort(T[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            T current = array[i];
            int j = i - 1;
            while ((j >= 0) && (current.compareTo(array[j]) < 0)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    @Override
    public String name() {
        return "Insertion Generic";
    }
}
