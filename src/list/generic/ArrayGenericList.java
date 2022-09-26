package list.generic;

import java.util.Arrays;

public class ArrayGenericList<T> extends AbstractGenericList<T> {

    private final static int DEFAULT_CAPACITY = 16;
    private T[] array;

    public ArrayGenericList() {
        init();
    }

    public ArrayGenericList(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    protected void init() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(T data) {
        if (size >= array.length)
            array = Arrays.copyOf(array, array.length * 2);

        array[size++] = data;
    }

    @Override
    public boolean remove(T data) {
        if (!isEmpty() && contains(data)) {
            int i = 0;
            while (array[i] != data) i++;
            for (int j = i; j < size - 1; j++)
                array[j] = array[j + 1];

            size--;
            return true;
        }
        return false;
    }

    @Override
    public T removeIndex(int index) {
        T removed = array[index];
        for (int i = index; i < size - 1; i++)
            array[i] = array[i + 1];
        size--;
        return removed;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public boolean contains(T data) {
        if (array[0] != null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == data) return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T data) {
        int counter = 0;
        for (T element : array) {
            counter++;
            if (data == element)
                return counter;
        }
        return -1;
    }


    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++)
            array[i] = null;
    }
}
