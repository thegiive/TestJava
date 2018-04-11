package algorithm.tree; 
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
// import codes.TreeNode ; 


public class OrderTraceTree {

    public static void preOrder(TreeNode root) {
        System.out.print(root.data+" ");
        if(root.left != null) preOrder(root.left);
        if(root.right!= null) preOrder(root.right);
    }
    
    public static void postOrder(TreeNode root){
        if(root.left != null) postOrder(root.left);
        if(root.right!= null) postOrder(root.right);
        System.out.print(root.data+" ");        
    }
    public static void inOrder(TreeNode root){
        if(root.left != null) inOrder(root.left);
        System.out.print(root.data+" ");        
        if(root.right!= null) inOrder(root.right);
    }

    public static String inOrderPrint(TreeNode node) {
        if(node == null) return ""; 
        String result = "";
        if(node.left != null) result += inOrderPrint(node.left)+" ";
        result += node.data+" " ; 
        if(node.right != null) result += inOrderPrint(node.right)+ " " ;
        return result.trim(); 
    }

    public static String postOrderPrint(TreeNode node) {
        if(node == null) return ""; 
        String result = "";
        if(node.left != null) result += postOrderPrint(node.left)+" ";
        if(node.right != null) result += postOrderPrint(node.right)+ " " ;
        result += node.data+" " ; 
        return result.trim(); 
    }

    public static String preOrderPrint(TreeNode node) {
        if(node == null) return ""; 
        String result = "";
        result += node.data+" " ; 
        if(node.left != null) result += preOrderPrint(node.left)+" ";
        if(node.right != null) result += preOrderPrint(node.right)+ " " ;
        return result.trim(); 
    }

    public static void main(String[] args) throws IOException {
        TreeNode n5 = new TreeNode(5); 
        TreeNode n3 = new TreeNode(3); 
        TreeNode n8 = new TreeNode(8); 
        TreeNode n1 = new TreeNode(1);
        n5.left = n3 ; 
        n5.right = n8 ; 
        n3.left = n1; 
        inOrderPrint(n5);
    }
}
