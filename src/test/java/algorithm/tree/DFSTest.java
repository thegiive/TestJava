package algorithm.tree;

import junit.framework.TestCase;

public class DFSTest extends TestCase {

    protected TreeNode n1,n2,n3,n4,n5,n6,n8;
    protected void setUp(){
    }



    public void test2(){
        n1 = new TreeNode(1);
        n2 = new TreeNode(2);
        n3 = new TreeNode(3);
        n4 = new TreeNode(4);
        n5 = new TreeNode(5);
        n6 = new TreeNode(6);
        n5.left = n2;
        n2.left = n1 ;
        n2.right = n3 ;
//        n3.right = n4 ;
        n5.right = n6 ;

        assertEquals( "5 2 1 3 6 ", DFS.search(n5) ) ;

    }



}