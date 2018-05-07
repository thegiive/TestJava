package algorithm.tree;

public class TraceTree {
    public static String inOrder(TreeNode root){
        if(root == null) return "";
        String result = "" ;
        if(root.left != null) result += inOrder(root.left);
        result+= root.data+" ";
        if(root.right != null) result += inOrder(root.right);
        return result ;
    }

    public static String preOrder(TreeNode root){
        if(root == null) return "";
        String result = "" ;
        if(root.left != null) result += preOrder(root.left);
        if(root.right != null) result += preOrder(root.right);
        result+= root.data+" ";
        return result ;
    }

    public static String postOrder(TreeNode root){
        if(root == null) return "";
        String result = "" ;
        result+= root.data+" ";
        if(root.left != null) result += postOrder(root.left);
        if(root.right != null) result += postOrder(root.right);
        return result ;
    }

    public static void main(String[] args) {
        TreeNode n1,n2,n3,n4,n5,n6,n8;
        n1 = new TreeNode(1);
        n2 = new TreeNode(2);
        n3 = new TreeNode(3);
        n4 = new TreeNode(4);
        n5 = new TreeNode(5);
        n6 = new TreeNode(6);
        n5.left = n2;
        n2.left = n1 ;
        n2.right = n3 ;
        n3.right = n4 ;
        n5.right = n6 ;
        String a =inOrder(n5);
    }
}
