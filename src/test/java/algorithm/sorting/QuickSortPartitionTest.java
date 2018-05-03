package algorithm.sorting ; 
import junit.framework.*;
import java.util.*;
// import codes.QuickSort; 

public class QuickSortPartitionTest extends TestCase {
    protected int value1 , value2 ; 
   protected void setUp(){
      value1=3;
      value2=3;
   }

   // test method to add two values
   public void testAdd(){
      double result= value1 + value2;
      assertTrue(result == 6);
      int[] a = {4, 5, 3, 7, 2      }; 
      assertEquals ( "[3, 2, 4, 5, 7]" , Arrays.toString(QuickSortPartition.quickSort(a)));
   }
}
