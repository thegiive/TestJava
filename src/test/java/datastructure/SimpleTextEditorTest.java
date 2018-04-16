package datastructure ; 
import junit.framework.*;
import java.util.*;

public class SimpleTextEditorTest extends TestCase {
    SimpleTextEditor editor = new SimpleTextEditor(); 
   protected void setUp(){
   }

   public void test1(){
       editor.append("abc");
        assertEquals("abc" , editor.show());
        assertEquals('c',  editor.charAt(3) ) ;
        editor.delete(3);
        assertEquals("" , editor.show());
        editor.append("xy");
        assertEquals("xy" , editor.show());
        assertEquals('y',  editor.charAt(2) ) ;
        editor.undo();
        assertEquals("" , editor.show());
        editor.undo();
        assertEquals("abc" , editor.show());
        assertEquals('a',  editor.charAt(1) ) ;


   }



}
