package hash.generic;

import java.util.LinkedList;
import java.util.Map;

public class HashMap<K, V> {


    private LinkedList<Entry>[] map;

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.7;

    private int size;

    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    public HashMap(int capacity) {
        map = new LinkedList[capacity];
        size = 0;
    }

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
