package sorting.generic;

public class BubbleGSort<T extends Comparable<T>> implements SortG<T> {
    @Override
    public void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[i].compareTo(array[j + 1]) > 0) {
                    T temp = array[j + 1];
                    array[j + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    @Override
    public String name() {
        return "Bubble Generic";
    }

}
