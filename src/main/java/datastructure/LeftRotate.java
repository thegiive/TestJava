package datastructure;  
import java.util.*;

public class LeftRotate  {

    public static int[] leftRotate(int[] input_arr , int n){
        int offset = n % input_arr.length ; 
        int[] tmp_arr = new int[input_arr.length]; 
        for(int i = 0 ; i< input_arr.length ; i++){
            int j = i - offset; 
            if(i - offset<0) j = j+input_arr.length ; 
            tmp_arr[j] = input_arr[i]; 
        }
        return tmp_arr ; 
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // String[] nd = scan.nextLine().split(" ");

        // int n = Integer.parseInt(nd[0].trim());

        // int d = Integer.parseInt(nd[1].trim());

        // int[] a = new int[n];

        // String[] aItems = scan.nextLine().split(" ");

        // for (int aItr = 0; aItr < n; aItr++) {
        //     int aItem = Integer.parseInt(aItems[aItr].trim());
        //     a[aItr] = aItem;
        // }

        int[] input_arr = {1,2,3,4,5}; 
        int d = 4; 
        // int[] result_arr = leftRotate(input_arr, 4); 
        // System.out.println(Arrays.toString(result_arr));
        for(int i =0 ; i < input_arr.length ; i++){
            System.out.print(input_arr[(d+i)%input_arr.length] + " "); 
        }

    }

}
