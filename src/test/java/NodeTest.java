import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class NodeTest {

    @Before
    public void Init() {
        Node<Integer> node = new Node<Integer>(0);
    }

    @Test
    public void setNext() {
        Node<Integer> node = new Node<Integer>(0);
        node.setNext(new Node<Integer>(2));
        assertEquals(2, node.getNext().getValue().intValue());
    }

    @Test
    public void setPrev() {
        Node<Integer> node = new Node<Integer>(0);
        node.setPrev(new Node<Integer>(2));
        assertEquals(2, node.getPrev().getValue().intValue());
    }

    @Test
    public void getNext() {

    }

    @Test
    public void getPrev() {
    }


    @Test
    public void getValue() {
    }

    @Test
    public void setValue() {
    }
}