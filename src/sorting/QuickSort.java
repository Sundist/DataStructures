package sorting;

public class QuickSort implements Sort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private int partition(int[] array, int first, int last) {
        int pivot = array[first];
        int low = first + 1;
        int high = last;
        while (true) {
            while (low < high && array[low] < pivot) low++;
            while (low < high && array[high] > pivot) high--;
            if (low >= high)
                break;

            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
        }

        int temp = array[first];
        array[first] = array[high];
        array[high] = temp;

        return high;
    }

    private void quickSort(int[] array, int first, int last) {
        if (first < last) {
            int mid = partition(array, first, last);
            quickSort(array, first, mid - 1);
            quickSort(array, mid + 1, last);
        }
    }

    @Override
    public String name() {
        return "Quick Sort";
    }
}
