
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class StringMakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] first_char_array = new int[256];
        int[] second_char_array = new int[256];

        for(char c : first.toCharArray()){
            first_char_array[c] += 1 ;
        }
        for(char c : second.toCharArray()){
            second_char_array[c] += 1 ;
        }

        int result = 0 ;
        for(int i = 0 ; i < 256 ; i++){
            if(first_char_array[i] != 0){
                if(second_char_array[i] != 0){
                    //first/second both have value
                    result += Math.abs(first_char_array[i] - second_char_array[i]) ;
                }else{
                    //first has value but second don't have value
                    result += first_char_array[i];
                }
            }else{
                if(second_char_array[i] != 0 ){
                    //second has value but first don't have value
                    result += second_char_array[i];
                }
            }
        }

        return result ;
    }

    public static void main(String[] args) {
        System.out.println(numberNeeded("abc" , "cde"));
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
//        System.out.println(numberNeeded(a, b));
    }
}

