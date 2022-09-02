package sorting;

public class QuickSort implements Sort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public int partition(int[] array, int first, int last) {
        return 0;
    }

    public void quickSort(int[] array, int first, int last) {

    }

    @Override
    public String name() {
        return "Quick Sort";
    }
}
