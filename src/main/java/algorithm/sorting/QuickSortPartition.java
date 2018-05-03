package algorithm.sorting; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSortPartition{

    static int[] quickSort1(int[] arr) {
        // Complete this function
        int pivot = arr[0] ; 
        int less_arr_index = 0 , less_arr_length = 0 ; 
        int large_arr_index = 0 , large_arr_length = 0 ; 
        // System.out.println(Arrays.toString(arr));

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < pivot){
                if(large_arr_length == 0 ){
                    arr[less_arr_index+less_arr_length] = arr[i]; 
                }else{
                    int t = arr[large_arr_index] ;
                    arr[large_arr_index] = arr[i]; 
                    arr[i] = t ; 
                    large_arr_index ++ ; 
                }
                less_arr_length ++ ; 
            }else{
                if(less_arr_length == 0){
                    arr[large_arr_index+large_arr_length] = arr[i]; 
                }
                large_arr_length++ ; 
            }
            // System.out.println(Arrays.toString(arr));

        }

        arr[arr.length-1] = arr[large_arr_index] ; 
        arr[large_arr_index] = pivot  ;
        return arr; 
        
    }

    static int[] quickSort(int[] arr) {
        // Complete this function
        int pivot = arr[0] ; 
        int[] less_arr = new int[arr.length]; 
        int[] large_arr = new int[arr.length]; 

        int less_arr_length = 0 ; 
        int large_arr_length = 0 ; 

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < pivot){
                less_arr[less_arr_length++] = arr[i];
            }else{
                large_arr[large_arr_length++] = arr[i];
            }
            // System.out.println(Arrays.toString(arr));

        }

        int index =0 ;
        for(int i = 0  ; i < less_arr_length ; i++, index++){
            arr[index] = less_arr[i] ; 
        }
        arr[index++] = pivot ; 
        for(int i = 0  ; i < large_arr_length ; i++, index++){
            arr[index] = large_arr[i] ; 
        }

        return arr ; 
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
