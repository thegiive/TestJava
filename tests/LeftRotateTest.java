package tests ; 
import junit.framework.*;
import java.util.*;
import codes.LeftRotate; 

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

}
