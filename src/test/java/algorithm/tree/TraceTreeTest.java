package algorithm.tree;

import junit.framework.TestCase;

public class TraceTreeTest extends TestCase {

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
//        n3.right = n4 ;
        n5.right = n6 ;
    }


    public void test1(){
        assertEquals( "1 2 3 5 6 " , TraceTree.inOrder(n5) ) ;
                assertEquals( "6 " , TraceTree.inOrder(n6) ) ;
        assertEquals( "1 2 3 " , TraceTree.inOrder(n2) ) ;
    }

    public void test2(){
        assertEquals( "1 3 2 6 5 " , TraceTree.preOrder(n5) ) ;
    }

    public void test3(){
        assertEquals( "5 2 1 3 6 " , TraceTree.postOrder(n5) ) ;
    }

    public void test11(){
        assertEquals( "1 2 3 5 6 " , TreeTrace1.inOrder(n5) ) ;
        assertEquals( "6 " , TreeTrace1.inOrder(n6) ) ;
        assertEquals( "1 2 3 " , TreeTrace1.inOrder(n2) ) ;
    }

    public void test21(){
        assertEquals( "1 3 2 6 5 " , TreeTrace1.preOrder(n5) ) ;
    }

    public void test31(){
        assertEquals( "5 2 1 3 6 " , TreeTrace1.postOrder(n5) ) ;
    }


}