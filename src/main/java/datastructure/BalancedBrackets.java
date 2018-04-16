package datastructure; 
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BalancedBrackets{
    static String isBalanced(String s) {
        Stack st = new Stack<Character>();
        for(Character c : s.toCharArray()){
            if(c == '{' || c =='[' || c=='('){
                st.push(c); 
            }else{
                if( st.isEmpty() ) return "NO"; 
                Character charInStack =  (Character) st.pop(); 
                if(c == '}' && charInStack != '{') return "NO"; 
                if(c == ']' && charInStack != '[') return "NO"; 
                if(c == ')' && charInStack != '(') return "NO"; 
            }
        }
        if(st.isEmpty()){
            return "YES"; 
        }else{
            return "NO"; 
        }

    }

    public static void main(String[] args){
        System.out.println(isBalanced("[{()}]"));
    }
}