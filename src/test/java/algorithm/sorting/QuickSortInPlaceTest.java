package algorithm.sorting ; 
import junit.framework.*;
import java.util.*;
// import codes.QuickSort; 

public class QuickSortInPlaceTest extends TestCase {
   protected void setUp(){
   }

   public void test1(){
       int[] arr = {1,3,2}; 
       assertEquals( "[1, 2, 3]" , Arrays.toString( QuickSortInPlace.quicksort(arr, 0, arr.length-1)));
   }

   public void test2(){
    int[] arr = {1,4,3,2}; 
    assertEquals( "[1, 2, 3, 4]" , Arrays.toString( QuickSortInPlace.quicksort(arr, 0, arr.length-1)));
}
public void test3(){
    int[] arr = {1, 3, 9, 8, 2, 7, 5 }; 
    assertEquals( "[1, 2, 3, 5, 7, 8, 9]" , Arrays.toString( QuickSortInPlace.quicksort(arr, 0, arr.length-1)));
}


}
