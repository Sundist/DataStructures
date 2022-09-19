package list.generic;

public class LinkedGenericList extends AbstractGenericList {

    private int size;
    private Node head;


    @Override
    public void add(Comparable data) {
        if (head == null) {
            Node root = new Node(data);
            root.next = null;
        } else {
            Node iter = head;
            while (iter.next != null)
                iter = iter.next;
            Node temp = new Node(data);
            iter.next = temp;
            temp.next = null;
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

    }
}

