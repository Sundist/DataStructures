package list;

import java.util.Arrays;

public class ArrayListInt extends AbstractListInt {
    private final static int DEFAULT_CAPACITY = 16;
    private int[] array;

    public ArrayListInt() {
        init();
    }

    public ArrayListInt(int capacity) {   //O(1)
        array = new int[capacity];
    }

    @Override
    protected void init() { //O(1)
        array = new int[DEFAULT_CAPACITY];

    }

    @Override
    public void add(int data) { //O(1)
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = data;
    }

    @Override
    public boolean remove(int data) {  //O(N)
        int index = indexOf(data);
        if (index == -1)
            return false;

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return true;
    }

    @Override
    public int removeIndex(int index) { //O(N)
        if (index >= size)
            throw new IndexOutOfBoundsException("Girdiğiniiz index eleman sayısından fazladır.");
        int deleted = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return deleted;
    }

    @Override
    public int get(int index) { //O(1)
        if (index >= size)
            throw new IndexOutOfBoundsException("Girdiğiniiz index eleman sayısından fazladır.");

        return array[index];

    }

    @Override
    public int indexOf(int data) { //O(n)
        for (int i = 0; i < size; i++) {
            if (array[i] == data)
                return i;
        }
        return -1;
    }
}
