package datastructure;

import junit.framework.TestCase;

public class TreeTest extends TestCase {

    public void testPreOrder() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n3.left = n2 ;
        n2.left = n1 ;
        n3.right = n4 ;
        n4.right = n5 ;

        assertEquals("3 2 1 4 5 " , Tree.preOrder(n3));

    }

    public void testInOrder() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n3.left = n2 ;
        n2.left = n1 ;
        n3.right = n4 ;
        n4.right = n5 ;

        assertEquals("1 2 3 4 5 " , Tree.inOrder(n3));

    }

}