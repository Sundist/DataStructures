package list.generic;

public class LinkedGenericList implements GenericList {

    private int size;
    private Node head;


    @Override
    public void add(Comparable data) {

    }

    @Override
    public boolean remove(Comparable data) {
        return false;
    }

    @Override
    public Comparable removeIndex(Comparable index) {
        return null;
    }

    @Override
    public Comparable get(Comparable index) {
        return null;
    }

    @Override
    public boolean contains(Comparable data) {
        return false;
    }

    @Override
    public int indexOf(Comparable data) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (head != null)
            return false;
        else
            return true;
    }

    @Override
    public void clear() {

    }
}

