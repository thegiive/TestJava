package datastructure.Linkenlist;

import junit.framework.TestCase;

public class ReverseLinkedListTest extends TestCase {
    public void test1(){
        ReverseLinkedList.SinglyLinkedListNode node1 = new ReverseLinkedList.SinglyLinkedListNode(1);
        ReverseLinkedList.SinglyLinkedListNode node2 = new ReverseLinkedList.SinglyLinkedListNode(2);
        ReverseLinkedList.SinglyLinkedListNode node3 = new ReverseLinkedList.SinglyLinkedListNode(3);
        ReverseLinkedList.SinglyLinkedListNode node4 = new ReverseLinkedList.SinglyLinkedListNode(4);
        ReverseLinkedList.SinglyLinkedListNode node5 = new ReverseLinkedList.SinglyLinkedListNode(5);
        node1.next = node2 ;
        node2.next = node3 ;
        node3.next = node4 ;
        node4.next = node5 ;
        assertEquals( "1 2 3 4 5 ", ReverseLinkedList.printLL(node1));

        ReverseLinkedList.SinglyLinkedListNode tmp = ReverseLinkedList.reverse(node1);
        assertEquals( "5 4 3 2 1 ", ReverseLinkedList.printLL(tmp));
    }

}