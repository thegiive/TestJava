package datastructure ; 
import junit.framework.*;
import java.util.*;

public class BalancedBracketsTest extends TestCase {
   protected void setUp(){
   }

   // test method to add two values
   public void test1(){
     assertEquals( BalancedBrackets.isBalanced("{[()]}") , "YES" );
     assertEquals( BalancedBrackets.isBalanced("{[(])}") , "NO" );
     assertEquals( BalancedBrackets.isBalanced("{{[[(())]]}}") , "YES" );
   }
   public void test2(){
    assertEquals( BalancedBrackets.isBalanced("}][}}(}][))]") , "NO" );
    assertEquals( BalancedBrackets.isBalanced("[](){()}") , "YES" );
    assertEquals( BalancedBrackets.isBalanced("()") , "YES" );
    assertEquals( BalancedBrackets.isBalanced("({}([][]))[]()") , "YES" );
    assertEquals( BalancedBrackets.isBalanced("{)[](}]}]}))}(())(") , "NO" );
    assertEquals( BalancedBrackets.isBalanced("([[)") , "NO" );
  }


}
