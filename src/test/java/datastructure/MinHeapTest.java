package datastructure ; 
import junit.framework.*;
import java.util.*;

public class MinHeapTest extends TestCase {
    MinHeap mh ; 
   protected void setUp(){
       mh = new MinHeap(100);
   }

   // test method to add two values
   public void test1(){
        mh.insert(1);
        assertEquals(mh.toString(), "1 ");
   }

   public void test2(){
        mh.insert(1);
        mh.insert(2);
        assertEquals(mh.toString(), "1 2 ");
    }

    public void test3(){
        mh.insert(3);
        mh.insert(1);
        mh.insert(2);
        assertEquals(mh.getMin(), 1);
        assertEquals(mh.toString(), "1 3 2 ");
    }
    public void test4(){
        mh.insert(3);
        mh.insert(5);
        mh.insert(2);
        mh.insert(1);
        assertEquals(mh.getMin(), 1);
        assertEquals(mh.toString(), "1 2 3 5 ");
    }

    public void test5(){
        mh.insert(3);
        mh.insert(5);
        mh.insert(2);
        mh.insert(1);
        assertEquals(mh.getMin(), 1);
        assertEquals(mh.toString(), "1 2 3 5 ");
        assertEquals(mh.popMin(), 1);
        assertEquals(mh.toString(), "2 5 3 ");
        assertEquals(mh.popMin(), 2);
        assertEquals(mh.toString(), "3 5 ");
        assertEquals(3 , mh.popMin());
        assertEquals(mh.toString(), "5 ");
        assertEquals(mh.popMin(), 5);
        assertEquals(mh.toString(), "");

    }

    public void test6(){
        assertEquals(mh.popMin(), -1);
        mh.insert(1); 
        mh.popMin(); 
        assertEquals(mh.popMin(), -1);
    }

}
