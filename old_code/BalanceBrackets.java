import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalanceBrackets {
    
    public static boolean isBalanced(String expression) {
        Stack s = new Stack<Character>(); 
        for(char c : expression.toCharArray()){
            if((c == '(') || (c == '{') || (c == '[')){
                s.add(c);
            }else{
                if(s.isEmpty()) return false ; 
                if(c == ')'){
                    if(!s.lastElement().equals(new Character('('))){
                        return false  ; 
                    }else{
                        s.pop(); 
                    }
                }
                if(c == '}'){
                    if(!s.lastElement().equals(new Character('{'))){
                        return false  ; 
                    }else{
                        s.pop(); 
                    }
                }
                if(c == ']'){
                    if(!s.lastElement().equals(new Character('['))){
                        return false  ; 
                    }else{
                        s.pop(); 
                    }
                }
            }
        }
        if(s.isEmpty()){
            return true  ; 
        }else{
            return false ; 
        }
    }
  
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{{[[(())]]}}"));
        System.out.println(isBalanced("]"));
        System.out.println(isBalanced("["));

        // Stack s = new Stack<Character>();   
        // s.add('a'); 
        // System.out.println(s.lastElement());    
        // System.out.println(s.empty());
        // System.out.println(s.pop()); 
        // System.out.println(s.empty());
        // Scanner in = new Scanner(System.in);
        // int t = in.nextInt();
        // for (int a0 = 0; a0 < t; a0++) {
        //     String expression = in.next();
        //     System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        // }
    }
}
