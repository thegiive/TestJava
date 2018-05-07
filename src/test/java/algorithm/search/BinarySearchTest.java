package algorithm.search ; 
import junit.framework.*;
import java.util.*;

public class BinarySearchTest extends TestCase {
   protected void setUp(){
   }

   public void test1(){
       int[] arr = {1,2,3,4,5}; 
       assertEquals(true,  BinarySearch.search(arr, 4) ) ; 
   }


    public void test2(){
        int[] arr = {1,2,3,4,5};
        assertEquals(false,  BinarySearch.search(arr, 6) ) ;
    }

}
