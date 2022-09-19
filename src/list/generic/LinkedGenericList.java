package list.generic;

public class LinkedGenericList extends AbstractGenericList {

    private Node head;

    public LinkedGenericList() {
        init();
    }

    @Override
    protected void init() {
        head = null;
    }

    @Override
    public void add(Comparable data) {
        Node temp = new Node<>(data);
        if (head != null) {
            Node iter = head;
            while (iter.next != null)
                iter = iter.next;
            iter.next = temp;
        } else {
            head = temp;
        }
        size++;
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
        head = null;
    }
}

