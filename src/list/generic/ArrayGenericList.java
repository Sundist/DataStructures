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
            array = Arrays.copyOf(array,array.length*2);
        }
        array[size++] = (Integer) data;
    }

    @Override
    public boolean remove(Comparable data) {
        return super.remove(data);
    }

    @Override
    public Comparable removeIndex(Comparable index) {
        return super.removeIndex(index);
    }

    @Override
    public Comparable get(Comparable index) {
        return super.get(index);
    }

    @Override
    public boolean contains(Comparable data) {
        return super.contains(data);
    }

    @Override
    public int indexOf(Comparable data) {
        return super.indexOf(data);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public void clear() {
        super.clear();
    }
}
