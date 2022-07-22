package sorting;

public class QuickSort implements Sort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int first = array[low + 1];
        int last = array[high];

        while (last > first) {
            while (first <= last && array[first] <= pivot)
                first++;
            while (first <= last && array[last] > pivot)
                last--;
            if (last > first) {
                int temp = array[last];
                array[last] = array[first];
                array[first] = temp;
            }
        }
        while (last > low && array[last] >= pivot)
            last--;

        if (pivot > array[last]) {
            array[low] = array[last];
            array[last] = pivot;
            return last;
        } else {
            return low;
        }
    }

    public void quickSort(int[] array, int low, int high) {
        if (low > high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    @Override
    public String name() {
        return "Quick Sort";
    }
}
