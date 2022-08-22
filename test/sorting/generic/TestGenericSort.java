package sorting.generic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class TestGenericSort {

    @Test
    public void testBubbleGSort() {
        Integer[] arr = new Integer[]{5, 2, -1, 2, 3};

        Integer[] sorted = arr.clone();
        Arrays.sort(sorted);

        SortG bgs = new BubbleGSort();
        bgs.sort(arr);

        assertArrayEquals(arr, sorted);
    }

    @Test
    public void testInsertionGSort() {
        Integer[] arr = new Integer[]{5, 2, -1, 2, 3};

        Integer[] sorted = arr.clone();
        Arrays.sort(sorted);

        SortG igs = new InsertionGSort();
        igs.sort(arr);

        assertArrayEquals(arr, sorted);
    }

    @Test
    public void testSelectionGSort() {
        Integer[] arr = new Integer[]{5, 2, -1, 2, 3};

        Integer[] sorted = arr.clone();
        Arrays.sort(sorted);

        SortG<Integer> sgs = new SelectionGSort<>();
        sgs.sort(arr);


        assertArrayEquals(arr, sorted);
    }

    @Test
    public void testQuickGSort() {
        Integer[] arr = new Integer[]{5, 2, -1, 2, 3};

        Integer[] sorted = arr.clone();
        Arrays.sort(sorted);

        SortG qgs = new QuickGSort();
        qgs.sort(arr);

        assertArrayEquals(arr, sorted);
    }

    @Test
    public void testMergeGSort() {
        Integer[] arr = new Integer[]{5, 2, -1, 2, 3};

        Integer[] sorted = arr.clone();
        Arrays.sort(sorted);

        SortG mgs = new MergeGSort();
        mgs.sort(arr);

        assertArrayEquals(arr, sorted);
    }
}
