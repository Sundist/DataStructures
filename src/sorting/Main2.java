package sorting;

import sorting.generic.BubbleGSort;
import sorting.generic.InsertionGSort;
import sorting.generic.SelectionGSort;
import sorting.generic.SortG;

import java.util.Arrays;
import java.util.Random;


public class Main2 {
    public static void main(String[] args) {
        for (int N = 1000; N <= 10_000_000; N *= 10) {
            long start, end;
            start = System.currentTimeMillis();
            int[] array = new Random().ints(N, 0, Integer.MAX_VALUE).toArray();
            end = System.currentTimeMillis();
            System.out.println("\n" + N + " array generation time: " + (end - start));

            start = System.currentTimeMillis();
            Arrays.sort(array);
            end = System.currentTimeMillis();
            System.out.println("Execution Time Java Sort: " + (end - start));

            start = System.currentTimeMillis();
            Integer[] intArray = new Integer[N];
            for (int i = 0; i < N; i++) {
                intArray[i] = (int) (Math.random() * Integer.MAX_VALUE);
            }
            end = System.currentTimeMillis();
            System.out.println("\n" + N + " Integer array generation time: " + (end - start));

            start = System.currentTimeMillis();
            Arrays.sort(intArray);
            end = System.currentTimeMillis();
            System.out.println("Execution Time Java Sort: " + (end - start));
        }

    }


}

