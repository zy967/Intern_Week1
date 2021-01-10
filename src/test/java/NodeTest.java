import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void getAndSetNext() {
        Node<Integer> node = new Node<Integer>(0);
        node.setNext(new Node<Integer>(2));
        assertEquals(Integer.valueOf(2), node.getNext().getValue());
    }

    @Test
    public void getAndSetPrev() {
        Node<Integer> node = new Node<Integer>(0);
        node.setPrev(new Node<Integer>(2));
        assertEquals(Integer.valueOf(2), node.getPrev().getValue());
    }

    @Test
    public void getValue() {
        Node<Integer> node = new Node<Integer>(0);
        assertEquals(Integer.valueOf(0), node.getValue());
    }

    @Test
    public void setValue() {
        Node<Integer> node = new Node<Integer>(0);
        assertEquals(Integer.valueOf(0), node.getValue());
        
        node.setValue(3);
        assertEquals(Integer.valueOf(3), node.getValue());
    }
}