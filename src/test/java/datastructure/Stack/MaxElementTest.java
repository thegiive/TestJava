package datastructure.Stack ; 
import junit.framework.*;
import java.util.*;

public class MaxElementTest extends TestCase {
   MaxElement mx ; 
   protected void setUp(){
       mx = new MaxElement(10); 
   }

   // test method to add two values
   public void test1(){
       mx.push(20);
       mx.push(97); 
       assertEquals(97,  mx.findMax());
       mx.delete();
       assertEquals(20,  mx.findMax());
   }


}
