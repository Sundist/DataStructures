package sorting.generic;

public class BubbleGSort<T extends Comparable<T>> implements SortG<T> {
    @Override
    public void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    public String name() {
        return "Bubble Generic";
    }

}
