package hash;

import list.LinkedListInt;

import java.util.ArrayList;
import java.util.Collections;

public class HashTableInt {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.7;

    private LinkedListInt[] table;

    private int size;


    public HashTableInt() {
        this(DEFAULT_CAPACITY);
    }

    public HashTableInt(int capacity) {
        table = new LinkedListInt[capacity];
        size = 0;
    }

    private void rehash() {
        LinkedListInt[] oldTable = table;
        table = new LinkedListInt[table.length * 2];

        for (LinkedListInt list : oldTable) {
            if (list != null) {
                while (!list.isEmpty()) {
                    int e = list.removeIndex(0);
                    insert(e);
                }
            }

        }
    }

    public boolean insert(int data) {
        double load = (double) size / table.length;
        if (load >= LOAD_FACTOR) {
            rehash();
        }

        int hashCode = hashCode(data);
        if (table[hashCode] == null)
            table[hashCode] = new LinkedListInt();

        if (table[hashCode].contains(data))
            return false;

        table[hashCode].add(data);
        size++;
        return true;
    }

    public boolean search(int data) {
        int hashCode = hashCode(data);

        return table[hashCode] != null && table[hashCode].contains(data);
    }

    public boolean remove(int data) {
        int hashCode = hashCode(data);
        if (!search(data))
            return false;

        table[hashCode].remove(data);
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clean() {
        table = new LinkedListInt[DEFAULT_CAPACITY];
        size = 0;
    }

    private int hashCode(int data) {
        return data % table.length;
    }

    public static void main(String[] args) {
        HashTableInt set = new HashTableInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            int random = (int) (100 * Math.random());
            if (!set.search(random)) {
                set.insert(random);
                list.add(random);
            }
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
