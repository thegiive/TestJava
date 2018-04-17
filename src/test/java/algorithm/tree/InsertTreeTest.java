package algorithm.tree; 
import junit.framework.*;
import java.util.*;

public class InsertTreeTest extends TestCase {
    protected TreeNode n1,n2,n3,n4,n5,n6,n8; 
    protected void setUp(){
        n1 = new TreeNode(1);
        n2 = new TreeNode(2);
        n3 = new TreeNode(3); 
        n4 = new TreeNode(4);
        n5 = new TreeNode(5); 
        n6 = new TreeNode(6); 
        n5.left = n2; 
        n2.left = n1 ; 
        n2.right = n3 ; 
        n5.right = n6 ; 
    }


    public void test1(){
        assertEquals("1 2 3 5 6 ", n5.toString());
        InsertTree.Insert(n5, 4); 
        assertEquals("1 2 3 4 5 6 ", n5.toString());
    }


}
