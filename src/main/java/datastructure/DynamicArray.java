package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DynamicArray {
    static ArrayList<Integer>[] seq_arr ;

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0 ;
        seq_arr = new ArrayList[n];
        List<Integer> result = new LinkedList<Integer>();

        for(int i = 0 ; i< n ; i++){
            seq_arr[i] = new ArrayList<Integer>();
        }

        for(List<Integer> query : queries){
            int query_type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            int index = ( x ^ lastAnswer ) % n ;

            if(query_type == 1){
//                Queue<Integer> q = seq_arr[index];
                seq_arr[index].add(y);
            }else if(query_type == 2){
                ArrayList<Integer> tmp = seq_arr[index];
                lastAnswer = tmp.get( y % tmp.size() );
                result.add(lastAnswer);
            }

        }
        return result ;
    }

}
