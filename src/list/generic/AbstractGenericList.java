package list.generic;

public abstract class AbstractGenericList implements GenericList {
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
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}