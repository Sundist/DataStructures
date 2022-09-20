package list.generic;


public class LinkedGenericList extends AbstractGenericList {

    private GenericNode head;

    public LinkedGenericList() {
        init();
    }

    @Override
    protected void init() {
        head = null;
    }

    @Override
    public void add(Comparable data) {
        GenericNode node = new GenericNode(data);
        if (head != null) {
            GenericNode iter = head;
            while (iter.next != null)
                iter = iter.next;
            iter.next = node;
        } else {
            head = node;
        }
        size++;
    }

    @Override
    public boolean remove(Comparable data) {
        if (head.data == data) {
            GenericNode iter = head;
            head = iter.next;
            size--;
            return true;
        } else if (head.next != null) {
            GenericNode iter = head;
            while (iter.next != null && iter.next.data != data) iter = iter.next;
            GenericNode temp = iter;
            temp.next = iter.next;
            iter.next = temp.next.next;
            temp.next.next = null;
            size--;
            return true;
        } else {
            GenericNode iter = head;
            while (iter.next.data != data)
                iter = iter.next;
            iter.next = null;
            size--;
            return true;
        }
    }

    @Override
    public Comparable removeIndex(Comparable index) {
        return null;
    }

    @Override
    public Comparable get(Comparable index) {
        if (index.compareTo(size) == 1)
            throw new IndexOutOfBoundsException("Girdiğiniiz index eleman sayısından fazladır.");
        GenericNode iter = head;
        int i = 0;
        while (index.compareTo(i) == -1) {
            iter = iter.next;
            i++;
        }
        return (Integer) iter.data;
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

