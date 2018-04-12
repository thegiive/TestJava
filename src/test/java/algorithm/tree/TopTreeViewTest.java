package algorithm.tree; 
import junit.framework.*;
import java.util.*;

public class TopTreeViewTest extends TestCase {
    protected TreeNode n1,n2,n3,n4,n5,n6,n8; 
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


    public void test1(){
        assertEquals( TopTreeView.topView(n5) , "1 2 5 8 ");
    }

    public void test2(){
        n1 = new TreeNode(1);
        n2 = new TreeNode(2);
        n3 = new TreeNode(3); 
        n4 = new TreeNode(4);
        n5 = new TreeNode(5); 
        n6 = new TreeNode(6); 
        n1.right = n2 ; 
        n2.right = n5 ; 
        n5.right = n6 ; 
        n5.left = n3 ; 
        n3.right = n4 ; 
        
        assertEquals( TopTreeView.topView(n1) , "1 2 5 6 ");
    }


}
