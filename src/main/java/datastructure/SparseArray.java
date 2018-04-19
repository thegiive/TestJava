package datastructure ;

import java.util.HashMap;

public class SparseArray{
    static int findSuffix(String[] collections, String queryString) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(String s : collections){
            if(hm.containsKey(s)){
                hm.put(s , hm.get(s)+1) ; 
            }else{
                hm.put(s,1); 
            }
        }
        if(hm.containsKey(queryString)){
            return hm.get(queryString); 
        }else{
            return 0 ; 
        }
    }

}