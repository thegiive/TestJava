import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ReverseArray {

    /*
     * Complete the reverseArray function below.
     */
    static int[] reverseArray(int[] a) {
        /*
         * Write your code here.
         */
        for(int i = 0 ; i < (a.length / 2)  ; i++){
            int tmp = a[i]; 
            a[i] = a[a.length - i -1 ]; 
            a[a.length - i - 1] = tmp ;             
        }
        return a ; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] a  = {1,2,3,4,5}; 
        System.out.println(Arrays.toString(reverseArray(a)));
        int[] b  = {1,2,4,5}; 
        System.out.println(Arrays.toString(reverseArray(b)));

        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int arrCount = Integer.parseInt(scanner.nextLine().trim());

        // int[] arr = new int[arrCount];

        // String[] arrItems = scanner.nextLine().split(" ");

        // for (int arrItr = 0; arrItr < arrCount; arrItr++) {
        //     int arrItem = Integer.parseInt(arrItems[arrItr].trim());
        //     arr[arrItr] = arrItem;
        // }

        // int[] res = reverseArray(arr);

        // for (int resItr = 0; resItr < res.length; resItr++) {
        //     bufferedWriter.write(String.valueOf(res[resItr]));

        //     if (resItr != res.length - 1) {
        //         bufferedWriter.write(" ");
        //     }
        // }

        // bufferedWriter.newLine();

        // bufferedWriter.close();
    }
}
