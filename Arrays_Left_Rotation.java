import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
            int[] tmp = new int[n]; 
            int new_offset = 0 ; 
            for(int i = 0 ; i < a.length ; i++){
                if( i - k < 0 ){
                    new_offset = i - k + n ; 
                }else{
                    new_offset = i - k ; 
                }
                tmp[new_offset] = a[i];
            }
            return tmp;
    }
    
    public static void main(String[] args) {
        // int[] a = {1,2,3,4,5}; 
        // System.out.println(Arrays.toString(arrayLeftRotation(a , 5 , 4)));  
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
