package list;

public class DoublyLinkedListInt extends AbstractListInt {

    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;

    DoublyLinkedListInt() {
        init();
    }

    @Override
    protected void init() {
        head = null;
        tail = null;
    }

    @Override
    public void add(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if (head == null) {
            head = node;
            node.prev = tail;
            node.next = null;
        } else {
            DoublyLinkedListNode iter = head;
            while (iter.next != null)
                iter = iter.next;
            iter.next = node;
            node.prev = iter;
            node.next = null;
        }
        size++;
    }

    @Override
    public boolean remove(int data) {

        //ilk eleman
        if (head.data == data) {
            DoublyLinkedListNode iter = head;
            head = iter.next;
            size--;
            return true;
        }

        // ortadaki eleman
        else if (head.next != null) {
            DoublyLinkedListNode iter = head;
            while (iter.data != data && iter != null)
                iter = iter.next;
            DoublyLinkedListNode temp = iter.next;
            iter.next = temp.next;
            temp.next.prev = iter;
            size--;
            return true;
        }

        // son eleman
        else {
            DoublyLinkedListNode iter = head;
            while (iter.next.data != data)
                iter = iter.next;
            DoublyLinkedListNode temp = iter.next;
            temp.prev = null;
            iter.next = temp.next;
            size--;
            return true;
        }
    }

    @Override
    public int removeIndex(int index) {
        if (head == null)
            return 0;
        DoublyLinkedListNode iter = head;
        for (int i = 0; i < index && iter != null; i++)
            iter = iter.next;
        DoublyLinkedListNode temp = iter.next;
        iter.next = temp.next;
        temp.next.prev = iter;
        temp.next = null;
        temp.prev = null;
        size--;
        return 1;
    }

    @Override
    public int get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Girdiğiniiz index eleman sayısından fazladır.");
        DoublyLinkedListNode iter = head;
        for (int i = 0; i < index; i++)
            iter = iter.next;
        return iter.data;
    }

    @Override
    public int indexOf(int data) {
        DoublyLinkedListNode iter = head;
        int counter = 0;
        while (iter.data != data) {
            counter++;
            iter = iter.next;
        }
        return counter;
    }
}

class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    public DoublyLinkedListNode(int data) {
        this.data = data;
    }

}