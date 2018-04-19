package datastructure ; 
import junit.framework.*;
import java.util.*;

public class SparseArrayTest extends TestCase {
   protected void setUp(){
   }

   public void test1(){
        String[] input = {"aba","baba","aba","xzxb"};
        assertEquals(2 ,  SparseArray.findSuffix(input, "aba") ) ; 
        assertEquals(1 ,  SparseArray.findSuffix(input, "xzxb") ) ; 
        assertEquals(0 ,  SparseArray.findSuffix(input, "ab") ) ; 
   }
}
