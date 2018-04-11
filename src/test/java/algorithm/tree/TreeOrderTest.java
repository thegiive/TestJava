package algorithm.tree; 
import junit.framework.*;
import java.util.*;

public class TreeOrderTest extends TestCase {
    protected TreeNode n1,n2,n3,n5,n8; 
    protected void setUp(){
        n5 = new TreeNode(5); 
        n3 = new TreeNode(3); 
        n8 = new TreeNode(8); 
        n1 = new TreeNode(1);
        n2 = new TreeNode(2);
        n5.left = n2 ; 
        n5.right = n8 ; 
        n2.left = n1; 
        n2.right = n3; 
    }


    public void testInorder1(){
        assertEquals( OrderTraceTree.inOrderPrint(n5) , "1 2 3 5 8");
    }

    public void testPostOrder1(){
        assertEquals( OrderTraceTree.postOrderPrint(n5) , "1 3 2 8 5");
    }
    public void testPreOrder1(){
        assertEquals( OrderTraceTree.preOrderPrint(n5) , "5 2 1 3 8");
    }


}
