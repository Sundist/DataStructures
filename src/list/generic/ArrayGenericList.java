package list.generic;

import java.util.Arrays;

public class ArrayGenericList extends AbstractGenericList {

    private final static int DEFAULT_CAPACITY = 16;
    private Integer[] array;

    public ArrayGenericList() {
        init();
    }

    public ArrayGenericList(int capacity) {
        array = new Integer[capacity];
    }

    @Override
    protected void init() {
        array = new Integer[DEFAULT_CAPACITY];
    }

    @Override
    public void add(Comparable data) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = (Integer) data;
    }

    @Override
    public boolean remove(Comparable data) {
        if (!isEmpty() && contains(data)) {
            int i = 0;
            while (array[i] != data) i++;
            for (int j = i; j < size - 1; j++) {
                array[j] = array[j + 1];
            }
            size--;
            return true;
        }
        return false;
    }

    @Override
    public Comparable removeIndex(int index) {
        return array[index];
    }

    @Override
    public Comparable get(int index) {
        return array[index];
    }

    @Override
    public boolean contains(Comparable data) {
        if (array[0] != null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == data) return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Comparable data) {
        return super.indexOf(data);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return array[0] == null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++)
            array[i] = null;
    }
}
