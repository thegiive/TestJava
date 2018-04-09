package codes ; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertSort {

    static void insertionSort1(int n, int[] arr) {
        // Complete this function
        // for(int index = arr.length -1 ; index > 0 ; index--){
        // }
    }

    static void printArr(int[] arr){
        String r = ""; 
        for(int i = 0 ; i < arr.length ; i++){
            r += arr[i]+" ";
        }
        System.out.println(r);
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int[] arr = new int[n];
        // for(int arr_i = 0; arr_i < n; arr_i++){
        //     arr[arr_i] = in.nextInt();
        // }
        // insertionSort1(n, arr);
        // in.close();

        int[] arr = {2 ,3 ,4 ,5 ,6, 7 ,8 ,9 ,10, 1        };
        insertionSort1(arr.length, arr);
        // int[] arr = new int[5] ; 
        // arr[0] = 9 ; 
        // insertionSort1(1, arr);
        System.out.println(Arrays.toString(arr));
        // arr[1] = 2 ; 
        // insertionSort1(2, arr);
        // System.out.println(Arrays.toString(arr));
        // arr[2] = 6 ; 
        // insertionSort1(3, arr);
        // System.out.println(Arrays.toString(arr));
        // arr[3] = 4 ; 
        // insertionSort1(4, arr);
        // System.out.println(Arrays.toString(arr));
        // arr[4] = 3 ; 
        // insertionSort1(5, arr);
        // System.out.println(Arrays.toString(arr));

    }
}
