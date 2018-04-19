package individual ; 
import junit.framework.*;
import java.util.*;

public class AlgorithmicCrushTest extends TestCase {
   protected void setUp(){
   }

   // test method to add two values
   public void test1(){
     int[][] input = {{1,2,100},
                      {2,5,100},
                      {3,4,100} }; 
     assertEquals( 200,  AlgorithmicCrush.arrayManipulation(5, input) ) ; 
   }

   public void test2(){
    int[][] input = {{2,3,603},
                     {1,1,286},
                     {4,4,882} }; 
    assertEquals( 882,  AlgorithmicCrush.arrayManipulation(4, input) ) ; 
  }

}
