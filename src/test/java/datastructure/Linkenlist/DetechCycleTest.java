package datastructure.Linkenlist;

import junit.framework.TestCase;

public class DetechCycleTest extends TestCase {


    public void testHasCycle() {

        DetechCycle.SinglyLinkedListNode node1 = new DetechCycle.SinglyLinkedListNode(1);
        DetechCycle.SinglyLinkedListNode node2 = new DetechCycle.SinglyLinkedListNode(2);
        DetechCycle.SinglyLinkedListNode node3 = new DetechCycle.SinglyLinkedListNode(3);
        node1.next = node2;
        node2.next = node3 ;

        assertEquals(  false , DetechCycle.hasCycle(node1) );

        node3.next = node2 ;
        assertEquals(  true , DetechCycle.hasCycle(node1) );



    }
}