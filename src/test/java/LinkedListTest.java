import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void getAndAddFirst() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        assertNull(linkedList.getFirst());

        linkedList.addFirst(0);
        assertEquals(0, linkedList.getFirst().intValue());

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        assertEquals(2, linkedList.getFirst().intValue());

        assertEquals(3, linkedList.size());
    }

    @Test
    public void getAndAddLast() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        assertNull(linkedList.getLast());

        linkedList.addLast(2);
        assertEquals(2, linkedList.getLast().intValue());

        linkedList.addLast(1);
        linkedList.addLast(0);
        assertEquals(0, linkedList.getLast().intValue());

        assertEquals(3, linkedList.size());
    }

    @Test
    public void removeFirst() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);

        int value1 = linkedList.removeFirst();
        assertEquals(0, value1);
        assertEquals(1, linkedList.getFirst().intValue());

        assertEquals(2, linkedList.size());
    }

    @Test
    public void removeLast() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);

        int value1 = linkedList.removeLast();
        assertEquals(2, value1);
        assertEquals(1, linkedList.getLast().intValue());

        assertEquals(2, linkedList.size());
    }

    @Test
    public void set() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);

        linkedList.set(0, 5);
        assertEquals(5, linkedList.getFirst().intValue());

        linkedList.set(2, 9);
        assertEquals(9, linkedList.getLast().intValue());

        assertEquals(3, linkedList.size());
    }

    @Test
    public void contains() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);

        assertTrue(linkedList.contains(2));
        assertFalse(linkedList.contains(3));
    }

    @Test
    public void size() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        assertEquals(0, linkedList.size());

        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);

        assertEquals(3, linkedList.size());
    }

    @Test
    public void clear() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);

        assertEquals(3, linkedList.size());
        assertNotNull(linkedList.getFirst());

        linkedList.clear();

        assertEquals(0, linkedList.size());
        assertNull(linkedList.getFirst());
    }
}