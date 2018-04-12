package algorithm.tree; 
import java.util.*;

public class TopTreeView{
    static String topView(TreeNode root) {
        String result = ""; 
        if(root.left != null) result += getLeftTopTreeView(root.left); 
        result += root.data+" "; 
        if(root.right != null) result += getRightTopTreeView(root.right); 
        return result ; 
    }

    static String getLeftTopTreeView(TreeNode root){
        String result = "";
        if(root == null) return result; 
        if(root.left != null) result += getLeftTopTreeView(root.left);
        result += root.data+" "; 
        return result; 
    }
    static String getRightTopTreeView(TreeNode root){
        String result = "";
        if(root == null) return result; 
        if(root.right != null) result += getRightTopTreeView(root.right);
        result = root.data+" "+result; 
        return result; 
    }

}