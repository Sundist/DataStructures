package sorting;

import sorting.generic.SelectionGSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 9, 5, 1, -1};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));

        Double[] arrayDouble = {3.0, 9.0, 5.0, 1.0, -1.0};
        SelectionGSort.sort(arrayDouble);
        System.out.println(Arrays.toString(arrayDouble));

        String[] arrayStr = {"Istanbul", "Ankara", "Adana", "Canakkale"};
        SelectionGSort.sort(arrayStr);
        System.out.println(Arrays.toString(arrayStr));

        Student[] arrayStudent = {new Student("Mehmet"), new Student("Ayse")};
        SelectionGSort.sort(arrayStudent);
        System.out.println(Arrays.toString(arrayStudent));


    }


}
class Student implements Comparable<Student>{
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