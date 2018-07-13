package algorithm.sorting ; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergeSort1 {

    public static void sort(int[] arr, int start_index , int end_index){
        if(start_index >= end_index) return ; 
        int middle_index = start_index + ( end_index - start_index ) / 2 ; 
        // System.out.println(start_index +" "+middle_index+ " "+end_index);

        sort(arr , start_index , middle_index ); 
        sort(arr, middle_index+1, end_index);
        merge(arr , start_index , middle_index , end_index); 
    }

    public static void merge(int[] arr, int start_index , int middle_index , int end_index){
        // System.out.println("Before Merge "+Arrays.toString(arr));
        // System.out.println("Merge "+start_index +" "+middle_index+ " "+end_index);

        int[] helper_arr = new int[middle_index - start_index+1]; 
        for(int i = 0; i <= middle_index -start_index ; i++){
            helper_arr[i] = arr[i+start_index]; 
        }

        int first_arr_index = 0 ; 
        int second_arr_index = middle_index + 1 ; 
        int index = start_index ; 

        while(first_arr_index <= (middle_index - start_index) && second_arr_index <= end_index){
            if(helper_arr[first_arr_index] < arr[second_arr_index]){
                arr[index++] = helper_arr[first_arr_index++] ; 
            }else{
                arr[index++] = arr[second_arr_index++]; 
            }
        }

        if(second_arr_index > end_index){
            while(first_arr_index <= (middle_index-start_index)){
                arr[index++] = helper_arr[first_arr_index++];
            }
    
        }

        // System.out.println("After merge "+Arrays.toString(arr));

    }

    public static void main(String[] args) {
    }
}