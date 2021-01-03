public class Node<T> {
    private Node<T> next = null;
    private Node<T> prev = null;
    private T value = null;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getNext(){
        return next;
    }

    public Node<T> getPrev(){
        return prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T e) {
        value = e;
    }
}

