public class LinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public LinkedList() {

    }

    public T getFirst() {
        if (size == 0)
            return null;

        return head.getValue();
    }

    public T getLast() {
        if (size == 0)
            return null;

        return tail.getValue();
    }

    public T removeFirst() {
        if (size == 0)
            return null;

        Node<T> nextHead = head.getNext();
        if (nextHead != null) {
            nextHead.setPrev(null);
            Node<T> prevHead = head;
            head = nextHead;
            size--;
            return prevHead.getValue();
        }
        return null;
    }

    public T removeLast() {
        if (size == 0)
            return null;

        Node<T> nextTail = tail.getPrev();
        if (nextTail != null) {
            nextTail.setNext(null);
            Node<T> prevTail = tail;
            tail = nextTail;
            size--;
            return prevTail.getValue();
        }
        return null;
    }

    public void addFirst(T e) {
        if (size == 0) {
            head = new Node<T>(e);
            tail = head;
        } else {
            head.setPrev(new Node<T>(e));
            head.getPrev().setNext(head);
            head = head.getPrev();
        }
        size++;
    }

    public void addLast(T e) {
        if (size == 0) {
            tail = new Node<T>(e);
            head = tail;
        } else {
            tail.setNext(new Node<T>(e));
            tail.getNext().setPrev(tail);
            tail = tail.getNext();
        }
        size++;
    }

    public T set(int idx, T element) {
        Node<T> current = head;
        int i = 0;
        while (current != null) {
            if (i == idx) {
                T prevValue = current.getValue();
                current.setValue(element);
                return prevValue;
            }
            current = current.getNext();
            i ++;
        }
        return null;
    }

    public boolean contains(T e) {
        Node<T> current = head;
        while (current != null) {
            if (current.getValue() == e) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void clear() {
        this.head = new Node<T>(null);
        this.tail = this.head;
        size = 0;
    }
}