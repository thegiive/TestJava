package datastructure; 
import junit.framework.*;
import java.util.*;

public class LeftRotateTest extends TestCase {
   protected void setUp(){
   }

   // test method to add two values
   public void test1(){
       int[] arr = {1,2,3,4,5}; 
       assertEquals( Arrays.toString( LeftRotate.leftRotate(arr, 4) ) , "[5, 1, 2, 3, 4]"); 
   }

   public void test2(){
    int[] arr = {1,2,3,4,5}; 
    assertEquals( Arrays.toString( LeftRotate.leftRotate(arr, 8) ) , "[4, 5, 1, 2, 3]"); 
}

    public void test3(){
        int[] arr = {1,2,3,4,5}; 
        System.out.println(Arrays.toString( LeftRotate1.rotate(arr, 2)));
        assertEquals(Arrays.toString(LeftRotate1.rotate(arr, 2)), "[3, 4, 5, 1, 2]");
    }

}
