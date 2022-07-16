package sorting;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int currentElement = array[i];
            int j = i - 1;
            while (j >= 0 && (currentElement < array[j])) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentElement;
        }
    }
}
