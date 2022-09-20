package list.generic;

public class CircularGenericList extends ArrayGenericList {

    private GenericNode head;

    CircularGenericList() {
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
            while (iter.next != head) iter = iter.next;
            iter.next = node;
            node.next = head;
        } else {
            head = node;
            node.next = head;
        }
        size++;
    }

    @Override
    public boolean remove(Comparable data) {
        if (head != null) {
            GenericNode iter = head;
            while (iter.next.data != data) iter = iter.next;
            iter.next = iter.next.next;
            size--;
            return true;
        }
        return false;
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
        return super.contains(data);
    }

    @Override
    public int indexOf(Comparable data) {
        return super.indexOf(data);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public void clear() {
        super.clear();
    }
}
