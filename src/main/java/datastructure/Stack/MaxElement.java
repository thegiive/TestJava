package datastructure.Stack; 
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MaxElement{

    class Node{
        int value ; 
        int max ; 
        Node(int v){
            value = v ; 
        }
    }

    private Stack<Node> st ; 
    // private int max ; 
    
    MaxElement(int number){
        st = new Stack<Node>(); 
        // max = Integer.MIN_VALUE ; 
    }

    public void push(int input){
        Node n = new Node(input); 
        int curr_max = Math.max(input , findMax()) ; 
        n.max = curr_max ; 
        st.push(n); 
    } 

    public void delete(){
        st.pop(); 
    }

    public int findMax(){
        if(st.isEmpty()){
            return Integer.MIN_VALUE; 
        }else{
            return st.peek().max ; 
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int numberOfQuery = scanner.nextInt(); 
        MaxElement mx = new MaxElement(numberOfQuery); 
        for(int i = 0 ; i< numberOfQuery ; i++){
            int queryType = scanner.nextInt(); 
            if(queryType == 1){
                int input = scanner.nextInt(); 
                mx.push(input);
            }else if(queryType == 2){
                mx.delete(); 
            }else if(queryType == 3){
                System.out.println("Max is"+mx.findMax()); 
            }else{
                System.out.println("#"+queryType); 
            }
        }
    }
}