package sorting;

import sorting.generic.BubbleGsort;
import sorting.generic.InsertionGSort;
import sorting.generic.SelectionGSort;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array_100 = new int[100];
        int[] array_1000 = new int[1000];

        Random random = new Random();

        System.out.println("For 100 Integer elements");
        for (int i = 0; i < array_100.length; i++) {
            array_100[i] = random.nextInt(Integer.MAX_VALUE);
            //System.out.print(" " + array_100[i]);
        }
        int[] arr = array_100.clone();

        long start = System.nanoTime();
        SelectionSort.sort(arr);
        long elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arr));
        System.out.println("Execution Time SelectionSort: " + elapsed);

        arr = array_100.clone();
        start = System.nanoTime();
        InsertionSort.sort(arr);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arr));
        System.out.println("Execution Time InsertionSort: " + elapsed);

        arr = array_100.clone();
        start = System.nanoTime();
        BubbleSort.sort(arr);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arr));
        System.out.println("Execution Time BubbleSort: " + elapsed);

        System.out.println("For 1000 Integer elements");
        for (int i = 0; i < array_1000.length; i++) {
            array_1000[i] = random.nextInt(Integer.MAX_VALUE);
            //System.out.print(" " + array_1000[i]);
        }
        int[] array = array_1000.clone();
        start = System.nanoTime();
        SelectionSort.sort(array);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(array));
        System.out.println("Execution Time SelectionSort: " + elapsed);

        array = array_1000.clone();
        start = System.nanoTime();
        InsertionSort.sort(array);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(array));
        System.out.println("Execution Time InsertionSort: " + elapsed);

        array = array_1000.clone();
        start = System.nanoTime();
        BubbleSort.sort(array);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(array));
        System.out.println("Execution Time BubbleSort: " + elapsed);

        System.out.println("For 100 G Double elements");
        Double[] arrayDouble_100 = new Double[100];
        for (int i = 0; i < arrayDouble_100.length; i++) {
            arrayDouble_100[i] = random.nextDouble(Double.MAX_VALUE);
            //System.out.print(arrayDouble_100[i] + " ");
        }

        Double[] arrayDouble = arrayDouble_100.clone();
        start = System.nanoTime();
        SelectionGSort.sort(arrayDouble);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println("Execution Time SelectionGSort: " + elapsed);

        arrayDouble = arrayDouble_100.clone();
        start = System.nanoTime();
        InsertionGSort.sort(arrayDouble);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println("Execution Time InsertionGSort: " + elapsed);

        arrayDouble = arrayDouble_100.clone();
        start = System.nanoTime();
        BubbleGsort.sort(arrayDouble);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println("Execution Time BubbleGGort: " + elapsed);

        System.out.println("For 1000 G Double elements");
        Double[] arrayDouble_1000 = new Double[1000];
        for (int i = 0; i < arrayDouble_1000.length; i++) {
            arrayDouble_1000[i] = random.nextDouble(Double.MAX_VALUE);
            //System.out.print(arrayDouble_100[i] + " ");
        }


        Double[] arrDouble = arrayDouble_1000.clone();

        start = System.nanoTime();
        SelectionGSort.sort(arrDouble);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arrDouble));
        System.out.println("Execution Time SelectionGSort: " + elapsed);

        arrDouble = arrayDouble_1000.clone();
        start = System.nanoTime();
        InsertionGSort.sort(arrDouble);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arrDouble));
        System.out.println("Execution Time InsertionGSort: " + elapsed);

        arrDouble = arrayDouble_1000.clone();
        start = System.nanoTime();
        BubbleGsort.sort(arrDouble);
        elapsed = System.nanoTime() - start;
        System.out.println(Arrays.toString(arrDouble));
        System.out.println("Execution Time BubbleGSort: " + elapsed);

       /* String[] arrayStr = {"Istanbul", "Ankara", "Adana", "Canakkale"};
        SelectionGSort.sort(arrayStr);
        System.out.println(Arrays.toString(arrayStr));

        Student[] arrayStudent = {new Student("Mehmet"), new Student("Ayse")};
        SelectionGSort.sort(arrayStudent);
        System.out.println(Arrays.toString(arrayStudent));
*/

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
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}