package algorithm.sorting ; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BucketSort {

    static int[] countingSort(int[] arr) {
        // Complete this function
        int[] result_arr = new int[100]; 
        for(int i : arr){
            result_arr[i] ++ ; 
        }
        return result_arr ; 
    }

    static int[] bucketSortResult(int[] arr) {
        // Complete this function
        int[] counting_arr = new int[100]; 
        for(int i : arr){
            counting_arr[i] ++ ; 
        }
        int[] result_arr = new int[arr.length]; 
        int index = 0 ; 
        for(int i = 0 ; i < counting_arr.length ; i++){
            for(int j = 0 ; j < counting_arr[i] ; j++){
                result_arr[index++] = i ; 
            }
        }
        return result_arr ; 
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
