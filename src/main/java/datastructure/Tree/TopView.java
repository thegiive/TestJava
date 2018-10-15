package datastructure.Tree;

import java.util.Scanner;

public class TopView {

    /*

 class Node
    int data;
    Node left;
    Node right;
*/
    static String topView(Node root) {
        if(root == null) return "";
        String result = "";
        if(root.left != null) result += getLeftTopTreeView(root.left);
        result += root.data + " " ;
        if(root.right != null ) result += getRightTopTreeView(root.right);
        return result ;
    }


    static String getLeftTopTreeView(Node root){
        String result = "" ;
        if(root.left != null) result += getLeftTopTreeView(root.left);
        result += root.data + " ";
        return result ;
    }
    static String getRightTopTreeView(Node root){
        String result = "" ;
        result += root.data + " ";
        if(root.right != null) result += getRightTopTreeView(root.right);
        return result ;
    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}





