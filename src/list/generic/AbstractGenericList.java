package list.generic;

public abstract class AbstractGenericList<T> implements GenericList<T> {

    protected int size;

    protected abstract void init();

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
