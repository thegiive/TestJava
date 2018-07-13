package algorithm.heap ; 
import junit.framework.*;
import java.util.*;

public class MinHeap1Test extends TestCase {
    MinHeap1 mh ; 
   protected void setUp(){
        mh = new MinHeap1(100); 
   }

   public void test1(){
        mh.insert(3);
        assertEquals(mh.toString(), "3 ");

        mh.insert(2);
        assertEquals(mh.toString(), "2 3 ");

        mh.insert(1);

        assertEquals(mh.toString(), "1 2 3 ");
    }

    public void testGetMin(){
        mh.insert(1);
        mh.insert(2);
        mh.insert(3);
        mh.insert(4);
        mh.insert(5);
        assertEquals(mh.toString(), "1 2 3 4 5 ");


        assertEquals(mh.popMin(), 1);
        assertEquals(mh.toString(), "2 4 3 5 ");

    }

}
