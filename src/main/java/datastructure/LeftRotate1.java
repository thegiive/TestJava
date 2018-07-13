package datastructure; 

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class LeftRotate1 {

    // public static int[] LeftRotate1(int[] input_arr , int n){
    //     int offset = n % input_arr.length ; 
    //     int[] tmp_arr = new int[input_arr.length]; 
    //     for(int i = 0 ; i< input_arr.length ; i++){
    //         int j = i - offset; 
    //         if(i - offset<0) j = j+input_arr.length ; 
    //         tmp_arr[j] = input_arr[i]; 
    //     }
    //     return tmp_arr ; 
    // }

    public static int[] rotate(int[] input_arr , int offset){
        int[] tmp_arr = new int[input_arr.length] ; 
        for(int i = 0 ; i < input_arr.length ; i++){
            if(i <= offset){
                tmp_arr[i] = input_arr[i+input_arr.length -1 - offset]; 
            }else{
                tmp_arr[i] = input_arr[i - offset -1 ]; 
            }
        }
        return tmp_arr ; 
    }

    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }
        
        // int[] b = leftRotate(a,d); 
        // String result = ""; 
        for(int i =0 ; i < n ; i++){
            // result += b[i]+" "; 
            System.out.print(a[(d+i)%n] + " "); 


        }
        // System.out.println(result);
    }
}