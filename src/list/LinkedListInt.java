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

        if (head.data == data) {
            Node iter = head;
            head = iter.next;
            size--;
            return true;
        } else if (head.next != null) {
            Node iter = head;
            while (iter.next != null && iter.next.data != data)
                iter = iter.next;
            Node temp = iter;
            temp.next = iter.next;
            iter.next = temp.next.next;
            temp.next.next = null;
            size--;
            return true;
        } else {
            Node iter = head;
            while (iter.next.data != data)
                iter = iter.next;
            iter.next = null;
            size--;
            return true;
        }
    }

    @Override
    public int removeIndex(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Girdiğiniiz index eleman sayısından fazladır.");
        Node iter = head;
        for (int i = 0; i < index; i++)
            iter = iter.next;
        Node temp = iter;
        temp.next = iter.next;
        iter.next = temp.next.next;
        temp.next.next = null;
        size--;
        return temp.next.data;
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