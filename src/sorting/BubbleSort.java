package sorting;

public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[i] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
