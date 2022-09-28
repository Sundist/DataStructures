package sorting;


import java.util.Arrays;

public class MergeSort implements Sort {
    @Override
    public void sort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] arrayLeft = Arrays.copyOfRange(array, 0, mid);
            sort(arrayLeft);
            int[] arrayRight = Arrays.copyOfRange(array, mid, array.length);
            sort(arrayRight);
            merge(array, arrayLeft, arrayRight);
        }
    }

    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, l = 0, r = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r])
                array[i++] = left[l++];
            else
                array[i++] = right[r++];
        }

        while (l < left.length) {
            array[i++] = left[l++];
        }

        while (r < right.length) {
            array[i++] = right[r++];
        }
    }


    @Override
    public String name() {
        return "Merge Sort";
    }
}
