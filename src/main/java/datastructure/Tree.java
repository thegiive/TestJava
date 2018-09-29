package datastructure;


import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Tree {


    public static String preOrder(Node root) {
        if(root == null) return "";
        String result = "";
        result += root.data+ " ";
        if(root.left != null) result+= preOrder(root.left);
        if(root.right!= null) result+= preOrder(root.right);
        return  result ;

    }

    public static String inOrder(Node root) {
        if(root == null) return "";
        String result = "";
        if(root.left != null) result+= inOrder(root.left);
        result += root.data+ " ";
        if(root.right!= null) result+= inOrder(root.right);
        return  result ;

    }

    public static String postOrder(Node root) {
        if(root == null) return "";
        String result = "";
        if(root.left != null) result+= postOrder(root.left);
        if(root.right!= null) result+= postOrder(root.right);
        result += root.data+ " ";
        return  result ;

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
        preOrder(root);
    }

}
