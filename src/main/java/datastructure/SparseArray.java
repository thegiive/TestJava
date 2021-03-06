package datastructure ;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

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

    static int findSuffix1(String[] collections, String queryString) {
        HashMap<String, Integer> hm = new HashMap<String,Integer>(); 
        for(int i = 0 ; i < collections.length ; i++){
            String key = collections[i]; 
            if(hm.containsKey(key)){
                hm.put(key , hm.get(key) + 1 ); 
            }else{
                hm.put(key, 1);
            }
        }
        if(hm.containsKey(queryString)){
            return hm.get(queryString); 
        }else{
            return 0 ; 
        }
    }


}