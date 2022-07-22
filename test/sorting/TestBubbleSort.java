package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestBubbleSort {

    @Test
    public void testBubbleSortSimple() {
        int[] arr = {5, 6, 2, -1, 2};

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Sort bs = new BubbleSort();
        bs.sort(arr);

        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testInsertionSortSimple() {
        int[] arr = {5, 6, 2, -1, 2};

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Sort bs = new InsertionSort();
        bs.sort(arr);

        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testSelectionSortSimple() {
        int[] arr = {5, 6, 2, -1, 2};

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Sort bs = new SelectionSort();
        bs.sort(arr);

        assertArrayEquals(sorted, arr);
    }
}
