package algorithm.heap ; 
import junit.framework.*;
import java.util.*;

public class MinHeapTest extends TestCase {
    MinHeap mh ; 
   protected void setUp(){
        mh = new MinHeap(100); 
   }

   public void test1(){
       mh.insert(10);
       assertEquals(10, mh.getMin());
       mh.insert(3);
       assertEquals(3, mh.getMin());
       mh.insert(1);
       assertEquals(1, mh.getMin());
       mh.insert(5);
       assertEquals(1, mh.getMin());

   }

    public void testDeleteMin() {
        mh.insert(10);
        assertEquals(10, mh.getMin());
        mh.insert(3);
        assertEquals(3, mh.getMin());
        mh.insert(1);
        assertEquals(1, mh.getMin());
        mh.insert(5);
        assertEquals(1, mh.getMin());
        mh.deleteMin();
        assertEquals(3, mh.getMin());
        mh.deleteMin();
        assertEquals(5, mh.getMin());
        mh.deleteMin();
        assertEquals(10, mh.getMin());
    }

    public void testDelete() {
        mh.insert(4);
        mh.insert(9);
        mh.insert(10);
        mh.delete(9);
        assertEquals(4, mh.getMin());
        mh.delete(4);
        assertEquals(10, mh.getMin());
    }

    public void testExample() {
        mh.insert(4);
        mh.insert(9);
        mh.insert(10);
        mh.delete(9);
        assertEquals(4, mh.getMin());
        mh.delete(4);
        assertEquals(10, mh.getMin());
    }

}
