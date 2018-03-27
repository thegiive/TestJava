class Node {
    int data;
    Node left;
    Node right;
 }
public class CheckBST{
    public boolean checkBST(Node root) {
        if(root == null ) return true ; 
        if((root.left == null) && (root.right == null)) return true ; 
        
        boolean result = false ; 
        if((checkBST(root.right) && (checkBST(root.left)))){
            if(root.right != null){
                if(root.left != null){
                    if((root.data < findMinValue(root.right)) && (root.data > findMaxValue(root.left))){                    
                        result = true; 
                    }
                }else{
                    if(root.data < findMinValue(root.right)){
                        result = true ; 
                    }            
                }
            }else{
                if(root.left != null){
                    if(root.data > findMaxValue(root.left)){                    
                        result = true; 
                    }
                }
            }
        }
        return result ; 
    }

    public int findMinValue(Node root){
        if(root.left !=null){
            return findMaxValue(root.left); 
        }else{
            return root.data ; 
        }
        
    }

    public int findMaxValue(Node root){
        if(root.right !=null){
            return findMaxValue(root.right); 
        }else{
            return root.data ; 
        }
    }

    public static void main(String[] args){

    }    
}
