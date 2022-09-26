package list.generic;

public class CircularGenericList<T> extends ArrayGenericList<T> {

    private GenericNode head;

    CircularGenericList() {
        init();
    }

    @Override
    protected void init() {
        head = null;
    }

    @Override
    public void add(T data) {
        GenericNode<T> node = new GenericNode(data);
        if (head != null) {
            GenericNode<T> iter = head;
            while (iter.next != head)
                iter = iter.next;
            node.next = head;
            iter.next = node;
        } else {
            head = node;
            head.next = node;
        }
        size++;
    }

    @Override
    public boolean remove(T data) {
        if (head != null) {
            GenericNode<T> iter = head;
            while (iter.next.data != data) iter = iter.next;
            iter.next = iter.next.next;
            size--;
            return true;
        } else
            return false;
    }

    @Override
    public T removeIndex(int index) {
        if (head != null) {
            GenericNode<T> iter = head;
            for (int i = 0; i < (int) index; i++)
                iter = iter.next;
            GenericNode<T> temp = iter.next;
            iter.next = temp.next;
            temp.next = null;
            size--;
            return temp.data;
        } else return null;
    }


}
