package algorithm.sorting ; 
import junit.framework.*;
import java.util.*;
// import codes.QuickSort; 

public class CorrectInsertionSortTest extends TestCase {
   protected void setUp(){
   }

   public void test1(){
       int[] arr = {1,3}; 
       assertEquals("[1, 3]", Arrays.toString( CorrectInsertionSort.insertionSort(arr)) ) ; 
   }

   public void test2(){
    int[] arr = {1,3,2}; 
    assertEquals("[1, 2, 3]", Arrays.toString( CorrectInsertionSort.insertionSort(arr)) ) ; 

   }

   public void test3(){
    int[] arr = {3,2,5,4,1}; 
    
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString( CorrectInsertionSort.insertionSort(arr)) ) ; 
   }

}
