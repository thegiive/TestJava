package datastructure ; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleTextEditor{

    private  Stack<String> st ;
    private StringBuffer current_text ; 
    private static final Scanner scanner = new Scanner(System.in); 

    SimpleTextEditor(){
        st = new Stack<String>(); 
        current_text = new StringBuffer();
    }

    public void append(String input){
        st.add(current_text.toString()); 
        current_text.append(input); 
    }

    public void delete(int index){
        st.add(current_text.toString());
        current_text.delete( current_text.length()-index , current_text.length()); 
    }

    public char charAt(int index){
        return current_text.charAt(index-1); 
    }

    public void print(int index){
        System.out.println(charAt(index)); 
    }

    public void undo(){
        current_text = new StringBuffer( st.pop() ) ; 
    }

    public String show(){
        return current_text.toString() ; 
    }

    public static void main(String[] args){
        SimpleTextEditor editor = new SimpleTextEditor();

        int number_of_operations = scanner.nextInt(); 
        for(int i = 0 ; i < number_of_operations ; i++){
            int op_code = scanner.nextInt() ; 
            if(op_code == 1){
                editor.append(  scanner.next() ) ; 
            }else if(op_code == 2){
                editor.delete( scanner.nextInt() ) ; 
            }else if(op_code == 3){
                editor.print( scanner.nextInt() ) ; 
            }else if(op_code == 4){
                //undo 
                editor.undo();
            }
        }

    }
}