package algorithm.tree; 
import junit.framework.*;
import java.util.*;

public class TreeHeightTest extends TestCase {
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


    public void test1(){
        assertEquals( TreeHeight.height(n5) , 2);
    }

    public void test2(){
        n5 = new TreeNode(5); 
        n3 = new TreeNode(3); 
        n8 = new TreeNode(8); 
        n1 = new TreeNode(1);
        n2 = new TreeNode(2);

        n5.left = n3 ; 
        n3.left = n1 ; 
        n1.left = n2 ; 
        n2.left = n8 ; 
        assertEquals( TreeHeight.height(n5) , 4);
    }


}
