package list;

public abstract class AbstractListInt implements ListInt {

    protected int size;

    @Override
    public boolean contains(int data) {  //O(n)
        return indexOf(data) != -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        init();
    }

    protected abstract void init();
}
