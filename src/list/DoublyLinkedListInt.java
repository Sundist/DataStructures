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

        if (head != null) {
            DoublyLinkedListNode iter = head;
            while (iter.next != null)
                iter = iter.next;
            iter.next = node;
            iter.next.prev = iter;
        } else {
            head = node;
            tail = node;
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
        return 0;
    }

    @Override
    public int indexOf(int data) {
        return 0;
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