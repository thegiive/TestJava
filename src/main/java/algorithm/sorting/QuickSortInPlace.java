package algorithm.sorting ; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSortInPlace {

    public static int[] quicksort(int[] arr , int start_index , int end_index){
        if(start_index >= end_index) return arr ; 
        // System.out.println(Arrays.toString(arr)+" "+start_index+" "+end_index);
        int less_arr_index = start_index , less_arr_length = 0 ; 
        int large_arr_index = start_index , large_arr_length = 0 ; 
        int pivot = arr[end_index]; 

        for(int i = start_index ; i < end_index  ; i++){
            if(arr[i] < pivot){
                if(large_arr_length > 0 ){
                    int t = arr[large_arr_index] ; 
                    arr[large_arr_index] = arr[i];
                    arr[i] = t ; 
                    large_arr_index ++ ; 
                }
                less_arr_length ++ ; 
            }else{
                if(large_arr_length == 0 ){
                    large_arr_index = i ; 
                }
                large_arr_length ++ ;     
            }
        }
        if(large_arr_length > 0 ){
            arr[end_index] = arr[large_arr_index] ; 
            arr[large_arr_index] = pivot ; 
            large_arr_index ++ ;     
        }
        // System.out.println(Arrays.toString(arr)+" "+less_arr_index+" "+less_arr_length+" "+large_arr_index+" "+large_arr_length);
        String result = ""; 
        for(int i = 0 ; i< arr.length ; i++){
            result += arr[i]+" ";             
        }
        System.out.println(result);

        if(less_arr_length > 1 )  arr = quicksort(arr, less_arr_index, less_arr_index+less_arr_length -1 ); 
        if(large_arr_length > 1 )  arr = quicksort(arr, large_arr_index , large_arr_index+large_arr_length -1); 

        return arr ; 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        arr = quicksort(arr, 0, arr.length-1); 
        in.close();


    }
}