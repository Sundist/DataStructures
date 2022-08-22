package list;


public class LinkedListInt extends AbstractListInt {
    private Node head;


    public LinkedListInt() {
        init();
    }

    @Override
    protected void init() {
        head = null;
    }

    @Override
    public void add(int data) {
        Node node = new Node(data);

        if (head != null) {
            Node iter = head;
            while (iter.next != null) iter = iter.next;
            iter.next = node;
        } else {
            head = node;
        }
        size++;

    }

    @Override
    public boolean remove(int data) {
        Node iter = head;
        return false;
    }

    @Override
    public int removeIndex(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Girdiğiniiz index eleman sayısından fazladır.");
        return 0;
    }

    @Override
    public int get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Girdiğiniiz index eleman sayısından fazladır.");
        Node iter = head;
        for (int i = 0; i < index; i++) {
            iter = iter.next;
        }

        return iter.data;
    }

    @Override
    public int indexOf(int data) {
        Node iter = head;
        int index = 0;
        while (iter != null) {
            if (iter.data == data)
                return index;
            iter = iter.next;
            index++;
        }
        return -1;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}