package algorithm.sorting ; 
import junit.framework.*;
import java.util.*;
// import codes.QuickSort; 

public class InsetionSortRunningTimeTest extends TestCase {
   protected void setUp(){
   }

   public void test1(){
       int[] arr = {1,3}; 
       assertEquals( 0 , InsetionSortRunningTime.runningTime(arr));
   }

   public void test2(){
    int[] arr = {1,3,2}; 
    assertEquals( 1 , InsetionSortRunningTime.runningTime(arr));
   }

   public void test3(){
    int[] arr = {3,2,5,4,1}; 
    assertEquals( 6 , InsetionSortRunningTime.runningTime(arr));

   }

   public void test4(){
    int[] arr = {2, 1, 3, 1, 2 }; 
    assertEquals( 4 , InsetionSortRunningTime.runningTime(arr));

   }


}
