package algorithm.sorting; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertSort {

    static int[] insertionSort2(int n, int[] arr) {
        for(int sorted_array_index = 0 ; sorted_array_index < arr.length - 1 ; sorted_array_index ++){
            int pivot_index = sorted_array_index + 1 ; 
            int pointer_index = sorted_array_index ; 
            while(pointer_index >= 0 ){
                if(arr[pivot_index] > arr[pointer_index]) break ; 
                pointer_index -- ; 
            }
            // System.out.println(pivot_index); 
            // System.out.println(pointer_index);
            if(pivot_index > pointer_index +1 ){
                int tmp = arr[pivot_index]; 
                for(int i = pivot_index ; i > pointer_index + 1 ; i--){
                    arr[i] = arr[i-1] ;         
                }
                arr[pointer_index+1] = tmp ;     
            }
            // System.out.println(Arrays.toString(arr)); 
        }
        return arr; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
