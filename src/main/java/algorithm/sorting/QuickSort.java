package algorithm.sorting; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class QuickSort {

    // public static int[] qsort(int[] input_arr){
    // }

    public static int[] qsort(int[] input_arr , int start_index , int end_index){

        if(start_index == end_index ) return input_arr; 
        int pivot = input_arr[end_index]; 
        int small_arr_index = start_index ; 
        int small_arr_length = 0 ; 
        int larger_arr_index = start_index ; 
        int larger_arr_length = 0 ; 

        for(int i = start_index ; i < end_index  ; i++){
            if(input_arr[i] <= pivot ){
                if(larger_arr_length <= 0 ){
                    larger_arr_index ++ ; 
                    small_arr_length ++ ; 
                }else{
                    swap(input_arr, i, larger_arr_index);
                    larger_arr_index ++ ; 
                    small_arr_length ++ ; 
                }
            }else{
                larger_arr_length ++ ; 
            }
        }

        if(larger_arr_length > 0)swap(input_arr, end_index, larger_arr_index);
        larger_arr_index++ ; 


        if(small_arr_length > 1 )qsort(input_arr, small_arr_index, small_arr_index+small_arr_length-1);
        if(larger_arr_length > 1 )qsort(input_arr, larger_arr_index, larger_arr_index+larger_arr_length-1);

        return input_arr ; 
    }

    public static void swap(int[] input_arr , int index_a , int index_b){
        int tmp = input_arr[index_a] ; 
        input_arr[index_a] = input_arr[index_b] ; 
        input_arr[index_b] = tmp ; 
    }

 

    public static int[] sort(int[] input_arr){
        if(input_arr.length <= 1)return input_arr;
        if(input_arr[0] == 0) return input_arr ; 

        int[] larger_arr = new int[input_arr.length]; 
        int[] smaller_arr = new int[input_arr.length]; 
        
        int larger_arr_index = 0 ; 
        int smaller_arr_index = 0 ; 

        int pivot = input_arr[0]; 
        for(int i = 1 ; i<input_arr.length ; i++){
            if(input_arr[i] > pivot){
                larger_arr[larger_arr_index++] = input_arr[i];
            }else{
                smaller_arr[smaller_arr_index++] = input_arr[i];
            }
        }
        larger_arr = sort(larger_arr); 
        smaller_arr = sort(smaller_arr); 
        int result_index = 0 ; 
        for(int v: smaller_arr){
            if(v > 0)   input_arr[result_index++] = v ; 
        }
        input_arr[result_index++] = pivot ; 
        for(int v: larger_arr){
            if(v > 0)   input_arr[result_index++] = v ; 
        }
        
        return input_arr ; 
    }
  
    public static void main(String[] args) {
        int[] a = {3,2,5,1,4}; 
        System.out.println(Arrays.toString(sort(a)));
        // org.junit.runner.JUnitCore.main("tests.JavaTest");
    }
}


