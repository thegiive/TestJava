package algorithm.sorting ; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergeSort {

    public static void sort(int[] arr, int start_index , int end_index){
        if(start_index < end_index){
            int middle_index = start_index + ( end_index - start_index ) /2 ; 
            System.out.println(start_index+" "+end_index+" "+middle_index);
            sort(arr, start_index, middle_index);
            sort(arr, middle_index+1, end_index);
            merge(arr,start_index , middle_index ,end_index); 
        }
    }

    public static void merge(int[] arr, int start_index , int middle_index , int end_index){
        System.out.println("Merge "+Arrays.toString(arr)+" "+start_index+" "+middle_index+" "+end_index);
        int[] helper_arr = new int[arr.length]; 
        for(int i = 0 ; i < arr.length ; i++){
            helper_arr[i] = arr[i]; 
        }

        int left_arr_index = start_index , right_array_index = middle_index + 1 ; 
        int current_merged_arr_index = start_index ; 
        while((left_arr_index <= middle_index) && (right_array_index <= end_index) ){
            if(helper_arr[left_arr_index] < helper_arr[right_array_index]){
                arr[current_merged_arr_index] = helper_arr[left_arr_index] ; 
                left_arr_index ++ ; 
            }else{
                arr[current_merged_arr_index] = helper_arr[right_array_index] ;                 
                right_array_index ++ ; 
            }
            current_merged_arr_index++ ; 
        }
        if(left_arr_index <= middle_index){
            for(int i = left_arr_index ; i< middle_index+1 ; i++){
                arr[current_merged_arr_index] = helper_arr[i] ; 
                current_merged_arr_index ++ ;  
            }
        }
        System.out.println("END "+ Arrays.toString(arr)+" "+start_index+" "+middle_index+" "+end_index);

    }

    public static void main(String[] args) {
    }
}