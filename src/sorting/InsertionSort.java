package sorting;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentElement;
        }
    }

    @Override
    public String name() {
        return "Insertion";
    }
}
