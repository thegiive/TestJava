import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSort {
    
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
    }
}
