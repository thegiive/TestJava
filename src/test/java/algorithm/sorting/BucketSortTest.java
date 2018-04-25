package algorithm.sorting ; 
import junit.framework.*;
import java.util.*;
// import codes.QuickSort; 

public class BucketSortTest extends TestCase {
   protected void setUp(){
   }

   public void test1(){
       int[] arr = {1,1,2}; 
       int[] result = BucketSort.countingSort(arr); 
    //    System.out.println(Arrays.toString(arr));
       assertEquals(2, result[1]);
       assertEquals(1, result[2]);
       assertEquals(0, result[0]);
       assertEquals(0, result[3]);
   }

   public void test2(){
    int[] arr = {1,2,1}; 
    int[] result = BucketSort.bucketSortResult(arr);
    System.out.println(Arrays.toString(result)); 
    assertEquals("[1, 1, 2]", Arrays.toString(result) );
}

}
