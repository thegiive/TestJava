package algorithm.tree; 

public class HuffmanDecoding{

    static String decode(String s , HoffmanTreeNode root){
        HoffmanTreeNode curr_node = root ; 
        String result = ""; 
        char[] input_arr = s.toCharArray(); 
        int i = 0 ;
        while(i<input_arr.length){
            if(input_arr[i] == '0'){
                if(curr_node.left != null){
                    curr_node = curr_node.left ; 
                    i ++ ; 
                }else{
                    result += curr_node.data ; 
                    curr_node = root ; 
                }
            }else{
                if(curr_node.right != null){
                    curr_node = curr_node.right ; 
                    i ++ ; 
                }else{
                    result += curr_node.data ; 
                    curr_node = root ; 
                }
            }
        }
        if(curr_node.data != '/') result += curr_node.data ; 
        return result ; 
    }
}

