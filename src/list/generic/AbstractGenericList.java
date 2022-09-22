package list.generic;

public abstract class AbstractGenericList implements GenericList {

    protected int size;
    protected abstract void init();

    @Override
    public void add(Comparable data) {

    }

    @Override
    public boolean remove(Comparable data) {
        return false;
    }

    @Override
    public Comparable removeIndex(int index) {
        return null;
    }

    @Override
    public Comparable get(int index) {
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
