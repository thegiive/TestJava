package tests ; 
import junit.framework.*;
import java.util.*;
import codes.HourGlass;; 

public class HourGlassTest extends TestCase {
   protected void setUp(){
   }

   // test method to add two values
   public void test1(){
    int[][] arr = { {0,1,1,1},
                    {0,0,1,0},
                    {0,1,1,1} };
    assertEquals(HourGlass.array2D(arr) , 7); 
   }
   public void test2(){
    int[][] arr = { {0,1,1,1,0},
                    {0,0,1,0,0},
                    {0,1,1,1,0},
                    {0,0,0,2,4} };
    assertEquals(HourGlass.array2D(arr) , 8); 
   }

   public void test3(){
    int[][] arr = { {0,1,1,1,0,0,0},
                    {0,0,1,0,0,0,0},
                    {0,1,1,1,0,0,0},
                    {0,0,0,2,4,4,0},
                    {0,0,0,0,2,0,0},
                    {0,0,0,1,2,4,0} };
    assertEquals(HourGlass.array2D(arr) , 19); 
   }

   public void testNegative(){
    int[][] arr = { {-1,-1,0},
                    {-2,-1,-6},
                    {-1,-1,-1}};  
    assertEquals(HourGlass.array2D(arr) , -6); 
   }


}
