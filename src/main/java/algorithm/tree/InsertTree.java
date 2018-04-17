package algorithm.tree; 
import java.util.*;

public class InsertTree{
    static TreeNode Insert(TreeNode root,int value) { 
        if( root == null) root = new TreeNode(value);  
        if(root.data < value){
            if(root.right == null){
                root.right = new TreeNode(value); 
            }else{
                root.right = Insert(root.right, value);
            }
        }else{
            if(root.left == null){
                root.left = new TreeNode(value); 
            }else{
                root.left = Insert(root.left, value);
            }            
        }
        return root ; 
    }
}