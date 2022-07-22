package sorting.generic;

public class SelectionGSort<T extends Comparable<T>> implements SortG<T> {
    /** The method for sorting the numbers */
    @Override
    public void sort(T[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            T currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    @Override
    public String name() {
        return "Selction Generic";
    }
}
