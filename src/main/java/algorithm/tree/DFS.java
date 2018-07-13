package algorithm.tree; 

public class DFS{
    public static String search(TreeNode root){
        if(root == null) return ""; 
        String result = "";
        result += root.data+" ";
        // System.out.println(root.data);
        if(root.left != null) result += search(root.left); 
        if(root.right != null) result += search(root.right); 
        return result ; 
    } 
}