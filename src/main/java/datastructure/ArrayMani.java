package datastructure; 

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ArrayMani {

    /*
     * Complete the arrayManipulation function below.
     */
    static long arrayManipulation(int n, int[][] queries) {
        int[] result_arr = new int[n]; 
        long max = Integer.MIN_VALUE ; 
        for(int i = 0 ; i < queries.length; i++){
            result_arr[queries[i][0]-1] += queries[i][2]; 
            if( queries[i][1] < n ){
                result_arr[queries[i][1]-1] -= queries[i][2]; 
            }
        }

        int tmp = 0 ; 
        for(int i = 0 ; i < result_arr.length ; i++){
            tmp += result_arr[i] ; 
            if(max < tmp) max = tmp ; 
        }
        return max ; 
    }

}
