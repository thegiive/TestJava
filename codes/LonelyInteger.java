package codes ; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
    
    public static int lonelyInteger(int[] a) {
        int[] tmp = new int[101];
        for (int i : a) {
            tmp[i] += 1 ; 
        }
        // System.out.println(Arrays.toString(tmp));
        for(int i = 0 ; i < tmp.length ; i++){
            if(tmp[i] == 1 )return i ;  
        }
        return 0 ; 
    }
    
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int a[] = new int[n];
        // for(int a_i=0; a_i < n; a_i++){
        //     a[a_i] = in.nextInt();
        // }
        // System.out.println(lonelyInteger(a));

        int[] a = {0, 0 ,1 ,2 ,1};
        System.out.println(lonelyInteger(a));    
    }
}
