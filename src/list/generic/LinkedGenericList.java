package list.generic;


public class LinkedGenericList<T> extends AbstractGenericList<T> {

    private GenericNode<T> head;

    public LinkedGenericList() {
        init();
    }

    @Override
    protected void init() {
        head = null;
    }

    @Override
    public void add(T data) {
        GenericNode<T> node = new GenericNode<T>(data);
        if (head != null) {
            GenericNode<T> iter = head;
            while (iter.next != null)
                iter = iter.next;
            iter.next = node;
        } else {
            head = node;
        }
        size++;
    }

    @Override
    public boolean remove(T data) {
        if (head.data == data) {
            GenericNode<T> iter = head;
            head = iter.next;
            size--;
            return true;
        } else if (head.next != null) {
            GenericNode<T> iter = head;
            while (iter.next != null && iter.next.data != data) iter = iter.next;
            GenericNode<T> temp = iter;
            temp.next = iter.next;
            iter.next = temp.next.next;
            temp.next.next = null;
            size--;
            return true;
        } else {
            GenericNode<T> iter = head;
            while (iter.next.data != data)
                iter = iter.next;
            iter.next = null;
            size--;
            return true;
        }
    }

    @Override
    public T removeIndex(int index) {
        return null;
    }

    @Override
    public T get(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException("Girdiğiniiz index eleman sayısından fazladır.");
        GenericNode<T> iter = head;
        for (int i = 0; i < index && iter.next != null; i++)
            iter = iter.next;

        return iter.data;
    }

    @Override
    public boolean contains(T data) {
        return false;
    }

    @Override
    public int indexOf(T data) {
        int counter = 0;
        GenericNode<T> iter = head;
        if (head != null) {
            while (iter.data != data && iter.next != null) {
                iter = iter.next;
                counter++;
            }
            return counter;
        } else
            return -1;
    }

    @Override
    public void clear() {
        head = null;
    }
}

