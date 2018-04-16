package datastructure ; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinHeap{
    int[] heap_arr ;
    int current_length ; 
    public MinHeap(int length){
        heap_arr = new int[length]; 
        current_length = 0 ; 
    }

    public void insert(int data){
        heap_arr[++current_length] = data ; 
        int curr_index = current_length ; 
        while(curr_index > 1){
            int root_index = curr_index / 2 ; 
            if(heap_arr[root_index] > heap_arr[curr_index]){
                swap(root_index, curr_index);
                curr_index = root_index ; 
            }else{
                break ; 
            }
        } 
    }

    public String toString(){
        String r = ""; 
        for(int i = 1 ; i<= current_length ; i++){
            r += heap_arr[i]+" "; 
        }
        return r;
    }

    public int getMin(){
        if(current_length == 0 ) return -1 ;         
        return heap_arr[1]; 
    }

    public int popMin(){
        // no time to implememt exception , return -1 for null heap
        if(current_length == 0 ) return -1 ; 

        int result = getMin();
        heap_arr[1] = heap_arr[current_length]; 
        heap_arr[current_length] = Integer.MAX_VALUE; 
        current_length -- ; 

        int curr_index = 1 ; 
        while(curr_index * 2  <= current_length){
            int min_leaf_index = curr_index * 2 ; 
            if( heap_arr[curr_index * 2] > heap_arr[curr_index * 2+1]){
                min_leaf_index = curr_index * 2 +1 ; 
            }
            if( heap_arr[min_leaf_index] < heap_arr[curr_index]){
                swap(min_leaf_index, curr_index);
            }
            curr_index = min_leaf_index ; 
        } 
        return result ; 
    }

    private void swap(int j,int k){
        int tmp = heap_arr[j]; 
        heap_arr[j] = heap_arr[k]; 
        heap_arr[k] = tmp ; 
    }
    
}