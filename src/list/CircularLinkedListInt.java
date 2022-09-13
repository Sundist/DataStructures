package list;

public class CircularLinkedListInt extends AbstractListInt {
    private Node head;

    public CircularLinkedListInt() {
        init();
    }

    protected void init() {
        head = null;
    }

    @Override
    public void add(int data) {
        Node node = new Node(data);
        if (head != null) {
            Node iter = head;
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
    public boolean remove(int data) {
        if (head != null) {
            Node iter = head;
            while (iter.next.data != data) iter = iter.next;
            iter.next = iter.next.next;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public int removeIndex(int index) {
        if (head != null) {
            Node iter = head;
            for (int i = 0; i < index - 1; i++) iter = iter.next;
            iter.next = iter.next.next;
            size--;
            return 1;
        }
        return 0;
    }

    @Override
    public int get(int index) {
        if (head != null) {
            Node iter = head;
            for (int i = 0; i < index; i++)
                iter = iter.next;
            return iter.data;
        }
        return 0;
    }

    @Override
    public int indexOf(int data) {
        int counter = 0;
        if (head != null) {
            Node iter = head;
            while (iter.data != data) {
                counter++;
                iter = iter.next;
            }
            return counter;
        }
        return -1;
    }
}

