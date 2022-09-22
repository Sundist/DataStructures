package list.generic;

import com.sun.jdi.IntegerValue;

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
            node.next = head;
            iter.next = node;
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
        } else
            return false;
    }

    @Override
    public Comparable removeIndex(int index) {
        if (head != null) {
            GenericNode iter = head;
            for (int i = 0; i < (int) index; i++)
                iter = iter.next;
            GenericNode temp = iter.next;
            iter.next = temp.next;
            temp.next = null;
            size--;
            return (Integer) temp.data;
        } else return Integer.MIN_VALUE;
    }

    @Override
    public Comparable get(int index) {
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
