package sorting.generic;

public class InsertionGSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
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
}
