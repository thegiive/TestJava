package algorithm.tree; 
public class TreeNode{
    public int data ; 
    public TreeNode left ; 
    public TreeNode right; 
    public TreeNode(int i){
        data = i; 
    }

    public String toString(){
        String result = ""; 
        if(this.left !=null) result += this.left.toString(); 
        result += this.data+" ";
        if(this.right != null ) result += this.right.toString();
        return result ; 
    }
}