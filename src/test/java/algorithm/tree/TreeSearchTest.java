package algorithm.tree;

import junit.framework.TestCase;
import algorithm.tree.TreeSearch ;

public class TreeSearchTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testDFSSearch() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.left = n2 ;
        n2.left = n3 ;
        n2.right = n4 ;
        n3.left = n5 ;
        n5.left = n6 ;
        n1.right = new Node(9);

        assertEquals("1 2 3 5 6 4 9 ",  TreeSearch.DFSSearch(n1)) ;

    }

    public void testBFSSearch() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.left = n2 ;
        n2.left = n3 ;
        n2.right = n4 ;
        n3.left = n5 ;
        n5.left = n6 ;
        n1.right = new Node(9);

        assertEquals("1 2 9 3 4 5 6 ",  TreeSearch.BFSSearch(n1)) ;

    }

    public void testQueue1(){
        MyQueue queue = new MyQueue();
        assertEquals(true, queue.isEmpty());

        queue.enqueue( new Node(1) ) ;
        assertEquals(false , queue.isEmpty());
        assertEquals(1 , queue.dequeue().value);
        queue.enqueue( new Node(1) ) ;
        queue.enqueue( new Node(2) ) ;
        assertEquals(2, queue.dequeue().value);
        assertEquals(1, queue.dequeue().value);

    }

}