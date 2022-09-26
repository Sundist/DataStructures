package list.generic;

public class DoublyGenericList<T> extends AbstractGenericList<T> {

    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    public DoublyGenericList() {
        init();
    }

    @Override
    protected void init() {
        head = null;
        tail = null;
    }

    @Override
    public void add(T data) {
        DoublyNode<T> node = new DoublyNode(data);
        if (head == null) {
            head = node;
            node.next = null;
            node.prev = tail;
        } else {
            DoublyNode<T> iter = head;
            while (iter.next != null) iter = iter.next;
            iter.next = node;
            node.prev = iter;
            node.next = null;
        }
        size++;
    }

    @Override
    public boolean remove(T data) {
        if (head.data == data) {
            DoublyNode<T> iter = head;
            head = iter.next;
            size--;
            return true;
        } else if (head.next != null) {
            DoublyNode<T> iter = head;
            while (iter.data != data && iter.next != null) iter = iter.next;
            DoublyNode<T> temp = iter.next;
            iter.next = temp.next;
            temp.next.prev = iter;
            size--;
            return true;
        } else {
            DoublyNode<T> iter = head;
            while (iter.next.data != data)
                iter = iter.next;
            DoublyNode<T> temp = iter.next;
            temp.prev = null;
            iter.next = temp.next;
            size--;
            return true;
        }

    }

    @Override
    public T removeIndex(int index) {
        if (head != null) {
            return null;
        }
        return null;
    }

    @Override
    public T get(int index) {
        if (head != null) {
            DoublyNode<T> iter = head;
            for (int i = 0; i < index && iter.next != null; i++)
                iter = iter.next;
            return iter.data;
        }
        return null;
    }

    @Override
    public boolean contains(T data) {
        if (head != null) {
            DoublyNode iter = head;
            while (iter.next != null && iter.data != data) iter = iter.next;
            if (iter.data == data)
                return true;
        }
        return false;
    }

    @Override
    public int indexOf(T data) {
        return 0;
    }

    @Override
    public void clear() {
        head = null;
    }
}
