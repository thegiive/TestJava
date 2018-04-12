package algorithm.tree; 
import java.util.*;

public class LevelOrderView{
    static String levelOrder(TreeNode root) {
        HashMap<Integer,ArrayList> result_hm = getLevelOrder(root, 0); 
        String result = ""; 
        for(int i = 0 ; i<500 ; i++){
            if(result_hm.containsKey(i)){
                ArrayList<Integer> al = (ArrayList<Integer>)result_hm.get(i) ; 
                for(Integer x : al){
                    result += x+" ";
                }
            }else{
                break ;
            }
        }
        // System.out.println(result);
        return result ; 
    }

    static HashMap<Integer,ArrayList> getLevelOrder(TreeNode root, int level){
        HashMap<Integer,ArrayList> result = new HashMap<Integer,ArrayList>(); 
        if(root.left != null) result.putAll( getLevelOrder(root.left, level+1) ) ; 
        if(root.right != null) {
            HashMap<Integer,ArrayList> tmp_hm = getLevelOrder(root.right, level+1); 
            for(Integer key:tmp_hm.keySet()){
                if(result.containsKey(key)){
                    ArrayList<Integer> tmp_arr = result.get(key) ; 
                    tmp_arr.addAll(tmp_hm.get(key)); 
                    result.put(key,tmp_arr); 
                }else{
                    result.put(key, tmp_hm.get(key)); 
                }
            }
        }
        ArrayList<Integer> tmp_arr = new ArrayList<Integer>(); 
        tmp_arr.add(root.data); 
        result.put(level , tmp_arr ); 
        return result ; 
    }


}