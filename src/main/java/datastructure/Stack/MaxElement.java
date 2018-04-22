package datastructure.Stack; 
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MaxElement{
    public int[] arr ; 
    public int curr_offset ; 
    public int max ; 
    
    MaxElement(int number){
        arr = new int[number];
        curr_offset = -1 ; 
        max = Integer.MIN_VALUE ; 
    }

    public void push(int input){
        if(curr_offset+1 >= arr.length) return ; 
        arr[++curr_offset] = input ; 
        if(input >= max){
            max = input; 
        }
    } 

    public void delete(){
        if(arr[curr_offset] == max) max = findMax(curr_offset-1); 
        curr_offset -- ; 
    }

    public int findMax(){
        return max ; 
    }

    public int findMax(int offset){
        int tmp = Integer.MIN_VALUE; 
        for(int i = 0 ; i <= offset ; i++){
            if(tmp < arr[i]){
                tmp = arr[i]; 
            }
        }
        return tmp ; 
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