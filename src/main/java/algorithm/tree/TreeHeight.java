package algorithm.tree; 
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class TreeHeight{
	static int height(TreeNode root) {
        // Write your code here.
        if(root == null) return 0 ; 
        if(root.left == null && root.right == null) return 0 ; 
        return Math.max(height(root.left) , height(root.right)) + 1 ; 
  }

}