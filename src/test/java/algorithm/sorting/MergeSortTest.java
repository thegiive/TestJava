package algorithm.sorting ; 
import junit.framework.*;
import java.util.*;
// import codes.QuickSort; 

public class MergeSortTest extends TestCase {
   protected void setUp(){
   }

   public void test1(){
       int[] arr = {1,3,2,4}; 
       MergeSort.sort(arr, 0, arr.length-1);
    //    System.out.println(Arrays.toString(arr));
       assertEquals( "[1, 2, 3, 4]" , Arrays.toString( arr ) );
   }

   public void test2(){
    int[] arr = {3,1,2}; 
    MergeSort.sort(arr, 0, arr.length-1);
    // System.out.println(Arrays.toString(arr));
    assertEquals( "[1, 2, 3]" , Arrays.toString( arr ) );
}

public void test3(){
    int[] arr = {7,3,5,1,2}; 
    MergeSort.sort(arr, 0, arr.length-1);
    // System.out.println(Arrays.toString(arr));
    assertEquals( "[1, 2, 3, 5, 7]" , Arrays.toString( arr ) );
}

public void test4(){
    int[] arr = {7,3,5,1,2}; 
    MergeSort1.sort(arr, 0, arr.length-1);
    // System.out.println(Arrays.toString(arr));
    assertEquals( "[1, 2, 3, 5, 7]" , Arrays.toString( arr ) );
}

public void test5(){
    int[] arr = {7,3,5,1,2,8}; 
    MergeSort1.sort(arr, 0, arr.length-1);
    // System.out.println(Arrays.toString(arr));
    assertEquals( "[1, 2, 3, 5, 7, 8]" , Arrays.toString( arr ) );
}


}
