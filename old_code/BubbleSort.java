package codes ; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {

    static int swap_value = 0 ;

    public static int[] sort(int[] input_arr){
        for (int i = 0; i < input_arr.length ; i++) {
            for (int j = 0; j < input_arr.length - 1 - i ; j++) {
                if (input_arr[j] > input_arr[j + 1]) {
                    int tmp = input_arr[j+1]; 
                    input_arr[j+1] = input_arr[j]; 
                    input_arr[j] = tmp ; 
                    swap_value ++; 
                }
            }
            
        }
        return  input_arr ; 
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int a[] = new int[n];
        // for(int a_i=0; a_i < n; a_i++){
        //     a[a_i] = in.nextInt();
        // }
        int[] a = { 2,3,1,5,4}; 
        System.out.println(Arrays.toString(sort(a)));
        System.out.println(swap_value); 
        
    }
}
