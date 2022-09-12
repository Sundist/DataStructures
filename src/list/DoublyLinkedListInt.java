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
        return false;
    }

    @Override
    public int removeIndex(int index) {
        return 0;
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