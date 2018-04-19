package individual ; 

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class AlgorithmicCrush {

    /*
     * Complete the arrayManipulation function below.
     */
    static long arrayManipulation(int n, int[][] queries) {
        long[] result = new long[n]; 
        long max =0 , tmp = 0 ; 
        int a, b , k ; 
        for(int i = 0 ; i < queries.length ; i++){
            a = queries[i][0] ; 
            b = queries[i][1] ; 
            k = queries[i][2] ; 
            result[a-1] += k ; 
            if(b < n) result[b] -= k ; 
        }
        for(int i = 0 ; i < result.length ; i++){
            tmp += result[i] ; 
            if(max < tmp) max = tmp ; 
        }
        return  max ; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] queries = new int[m][3];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}