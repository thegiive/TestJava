package algorithm.tree; 
import junit.framework.*;
import java.util.*;

public class HuffmanDecodingTest extends TestCase {
    protected HoffmanTreeNode n1,n2,n3,n4,n5,n6,n8; 
    protected void setUp(){
        n1 = new HoffmanTreeNode('/');
        n2 = new HoffmanTreeNode('/');
        n3 = new HoffmanTreeNode('B');
        n4 = new HoffmanTreeNode('C');
        n5 = new HoffmanTreeNode('A');
        n1.left = n2 ; 
        n2.left = n3 ; 
        n2.right = n4 ; 
        n1.right = n5 ; 
    }


    public void test1(){
        assertEquals("ABACA" , HuffmanDecoding.decode("1001011", n1));  
    }


}
