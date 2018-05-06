package algorithm.sorting ; 
import junit.framework.*;
import java.util.*;
// import codes.QuickSort; 

public class QuickSortTest extends TestCase {
    protected int value1 , value2 ; 
   protected void setUp(){
      value1=3;
      value2=3;
   }

   // test method to add two values
   public void testAdd(){
      double result= value1 + value2;
      assertTrue(result == 6);
      int[] a = {1,3,2}; 
    //   System.out.println(Arrays.toString(QuickSort.sort(a)));
   }
}
