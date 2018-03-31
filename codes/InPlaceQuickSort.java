package codes; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class InPlaceQuickSort {

    public static int[] sort(int[] input_arr , int start_index , int end_index){
        if(start_index == end_index) return input_arr; 
        int small_arr_start = start_index ; 
        int small_arr_length   = 0 ; 
        int large_arr_start = start_index ; 
        int large_arr_length   = 0 ; 
        int pivot = input_arr[end_index] ; 
        for(int i = start_index ; i < end_index ; i++){
            if(input_arr[i] > pivot){
                large_arr_length ++ ; 
            }else{
                if(large_arr_length != 0 ){
                    int tmp = input_arr[large_arr_start] ; 
                    input_arr[large_arr_start] = input_arr[i]; 
                    input_arr[i] = tmp ;     
                }
                large_arr_start ++ ; 
                small_arr_length ++ ; 
            }
            // System.out.println(Arrays.toString(input_arr));

        }
        int tmp = input_arr[end_index] ;
        input_arr[end_index]  = input_arr[large_arr_start]; 
        input_arr[large_arr_start] = tmp ;
        large_arr_start ++;  
        // System.out.println(Arrays.toString(input_arr));

        // System.out.println("s "+small_arr_start + " "+(small_arr_start+small_arr_length-1));
        // System.out.println("s "+large_arr_start + " "+(large_arr_start+large_arr_length-1));


        if(small_arr_length >0 ) sort(input_arr , small_arr_start , (small_arr_start+small_arr_length-1)); 
        if(large_arr_length >0 ) sort(input_arr , large_arr_start , (large_arr_start+large_arr_length-1)); 
        return input_arr ; 
    }
  
    public static void main(String[] args) {
        int[] a = {3,2,6,1,4,7,5}; 
        System.out.println(Arrays.toString(sort(a , 0 , a.length -1 )));
        // org.junit.runner.JUnitCore.main("tests.JavaTest");
    }
}


