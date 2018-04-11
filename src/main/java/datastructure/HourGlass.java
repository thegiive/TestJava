package datastructure; 
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HourGlass {

    /*
     * Complete the array2D function below.
     */
    public static int array2D(int[][] arr) {
        /*
         * Write your code here.
         */
        int result = Integer.MIN_VALUE ; 
        for(int i = 0 ; i < arr.length -2 ; i++){
            for(int j = 0 ; j < arr[i].length -2 ; j++){
                int tmp = arr[i][j] + arr[i][j+1] + arr[i][j+2] +arr[i+1][j+1] + arr[i+2][j]+ arr[i+2][j+1]  + arr[i+2][j+2]; 
                if(tmp > result) result = tmp ; 
            }
        }
        return result ; 

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int[][] arr = new int[6][6];

        // for (int arrRowItr = 0; arrRowItr < 6; arrRowItr++) {
        //     String[] arrRowItems = scanner.nextLine().split(" ");

        //     for (int arrColumnItr = 0; arrColumnItr < 6; arrColumnItr++) {
        //         int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
        //         arr[arrRowItr][arrColumnItr] = arrItem;
        //     }
        // }

        int[][] arr = { {0,1,1,1},
                        {0,0,1,0},
                        {0,1,1,1}};
        System.out.println(array2D(arr));
        // int result = array2D(arr);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();
    }
}
