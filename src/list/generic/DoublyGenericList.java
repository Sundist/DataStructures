package list.generic;

public class DoublyGenericList extends AbstractGenericList {

    private DoublyNode head;
    private DoublyNode tail;

    public DoublyGenericList() {
        init();
    }

    @Override
    protected void init() {
        head = null;
        tail = null;
    }

    @Override
    public void add(Comparable data) {
        DoublyNode node = new DoublyNode(data);
        if (head == null) {
            head = node;
            node.next = null;
            node.prev = tail;
        } else {
            DoublyNode iter = head;
            while (iter.next != null) iter = iter.next;
            iter.next = node;
            node.prev = iter;
            node.next = null;
        }
        size++;
    }

    @Override
    public boolean remove(Comparable data) {
        if (head.data == data) {
            DoublyNode iter = head;
            head = iter.next;
            size--;
            return true;
        } else if (head.next != null) {
            DoublyNode iter = head;
            while (iter.data != data && iter.next != null) iter = iter.next;
            DoublyNode temp = iter.next;
            iter.next = temp.next;
            temp.next.prev = iter;
            size--;
            return true;
        } else {
            DoublyNode iter = head;
            while (iter.next.data != data)
                iter = iter.next;
            DoublyNode temp = iter.next;
            temp.prev = null;
            iter.next = temp.next;
            size--;
            return true;
        }

    }

    @Override
    public Comparable removeIndex(Comparable index) {
        return super.removeIndex(index);
    }

    @Override
    public Comparable get(Comparable index) {
        return super.get(index);
    }

    @Override
    public boolean contains(Comparable data) {
        if (head != null) {
            DoublyNode iter = head;
            while (iter.next != null && iter.data != data) iter = iter.next;
            if (iter.data == data)
                return true;
        }
        return false;
    }

    @Override
    public int indexOf(Comparable data) {
        return super.indexOf(data);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {
        head = null;
    }
}
