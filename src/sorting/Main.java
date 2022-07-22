package sorting;

import sorting.generic.*;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Sort[] sortAlgorithms = {new InsertionSort(), new SelectionSort(), new BubbleSort(),
                new QuickSort(), new MergeSort()};
        @SuppressWarnings("unchecked")
        SortG<Integer>[] sortGAlgorithms = new SortG[]{new InsertionGSort<Integer>(), new SelectionGSort<Integer>(),
                new BubbleGSort<Integer>(), new QuickGSort<Integer>(), new MergeGSort<Integer>()};

        for (int N = 1000; N <= 100_000; N *= 10) {
            long start, end;
            start = System.currentTimeMillis();
            int[] array = new Random().ints(N, 0, Integer.MAX_VALUE).toArray();
            end = System.currentTimeMillis();
            System.out.println("\n" + N + " array generation time: " + (end - start));

            int[] a = array.clone();
            start = System.currentTimeMillis();
            Arrays.sort(a);
            end = System.currentTimeMillis();
            System.out.println("Execution Time Java Sort: " + (end - start));

            for (Sort sortAlgo : sortAlgorithms) {
                a = array.clone();
                start = System.currentTimeMillis();
                sortAlgo.sort(a);
                end = System.currentTimeMillis();
                System.out.println("Execution Time " + sortAlgo.name() + ": " + (end - start));
            }

            start = System.currentTimeMillis();
            Integer[] intArray = new Integer[N];
            for (int i = 0; i < N; i++) {
                intArray[i] = (int) (Math.random() * Integer.MAX_VALUE);
            }
            end = System.currentTimeMillis();
            System.out.println("\n" + N + " Integer array generation time: " + (end - start));

            Integer[] ia = intArray.clone();
            start = System.currentTimeMillis();
            Arrays.sort(a);
            end = System.currentTimeMillis();
            System.out.println("Execution Time Java Sort: " + (end - start));
            for (SortG<Integer> sortGAlgo : sortGAlgorithms) {
                ia = intArray.clone();
                start = System.currentTimeMillis();
                sortGAlgo.sort(ia);
                end = System.currentTimeMillis();
                System.out.println("Execution Time " + sortGAlgo.name() + ": " + (end - start));
            }
        }

    }


}

class Student implements Comparable<Student> {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + '}';
    }
}