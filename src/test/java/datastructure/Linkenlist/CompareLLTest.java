package datastructure.Linkenlist;

import junit.framework.TestCase;

public class CompareLLTest extends TestCase {

    public void testCompareLists() {
        CompareLL.SinglyLinkedListNode head1 = new CompareLL.SinglyLinkedListNode(1);
        CompareLL.SinglyLinkedListNode head2 = new CompareLL.SinglyLinkedListNode(2);
        head1.next = head2 ;
        CompareLL.SinglyLinkedListNode head11 = new CompareLL.SinglyLinkedListNode(1);
        CompareLL.SinglyLinkedListNode head12 = new CompareLL.SinglyLinkedListNode(2);
        head11.next = head12 ;
        assertEquals( true , CompareLL.compareLists(head1, head11 ));
        assertEquals(false , CompareLL.compareLists(head1,head2));

    }
}