package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {
    @Test
    public void testGrow() {
        Tree tree = new Tree();
        tree.grow(5);
        assertEquals(20, tree.getHeight());

        tree.grow(-5);
        assertEquals(20, tree.getHeight());

        tree.grow(0);
        assertEquals(20, tree.getHeight());

    }

    @Test
    public void testToString() {
        Tree tree = new Tree();
        // Test the toString() method
        assertEquals("height: 15", tree.toString());

        // Test setting a new height and calling toString()
        tree.setHeight(25);
        assertEquals("height: 25", tree.toString());
    }

}
