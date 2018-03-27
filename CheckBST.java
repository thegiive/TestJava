class Node {
    int data;
    Node left;
    Node right;
 }
public class CheckBST{
    boolean checkBST(Node root) {
        if(root == null ) return true ; 
        if((root.left == null) && (root.right == null)) return true ; 
        if((checkBST(root.right) && (checkBST(root.left)))){
            if((root.right != null) && ( root.data < root.right.data ) ){
                if((root.left != null) && ( root.data > root.left.data ) ){
                    return true ; 
                }                    
            }                    
        }
        return false ; 
        // if(root == null ) return true ; 
        // if((root.left == null) && (root.right == null)) return true ; 
        // if((checkBST(root.right) && (checkBST(root.left)))){
        //     if(root.right != null){

        //     }else{

        //     }
        //     && ( root.data < root.right.data ) ){
        //         if((root.left != null) && ( root.data > root.left.data ) ){
        //             return true ; 
        //         }                    
        //     }                    
        // }
        // return false ; 
    }    
}
