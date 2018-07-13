package algorithm.heap; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinHeap1{

    public int[] tree ; 
    public int tree_length ; 

    public MinHeap1(int length){
        tree = new int[length]; 
        tree_length = 0 ; 
    }

    public void insert(int value){
        tree[tree_length++] = value ; 
        int target_index = tree_length - 1 ; 
        while( target_index > 0 ){
            int parent_index = target_index / 2 ; 
            if(tree[parent_index] > tree[target_index]){
                int tmp = tree[target_index]; 
                tree[target_index] = tree[parent_index]; 
                tree[parent_index] = tmp ; 
                target_index = parent_index ; 
            }else{
                break ; 
            }    
        } 
    }

    public int popMin(){
        int result = tree[0]; 
        tree[0] = tree[tree_length-1]; 
        tree_length -- ; 

        int target_index = 0 ; 
        while( target_index < tree_length ){
            // System.out.println(target_index+ " "+(target_index*2+1)+" "+(target_index*2+2));
            // System.out.println(this.toString());
            if(target_index * 2 + 1 >= tree_length ) break ; 
            int  leaf_min_index = target_index*2 + 1  ; 
            if(target_index * 2 + 2 < tree_length){
                if(tree[target_index*2+1] < tree[target_index*2+2]){
                    leaf_min_index = target_index*2+1 ; 
                }else{
                    leaf_min_index = target_index*2+2 ; 
                }
            }

            if(tree[target_index] > tree[leaf_min_index]){
                int tmp = tree[target_index] ; 
                tree[target_index] = tree[leaf_min_index] ; 
                tree[leaf_min_index] = tmp ; 
                target_index = leaf_min_index ; 
            }else{
                break ; 
            }
        } 

        return result ; 
    }

    public int getMin(){
        return tree[0]; 
    }

    public void balance(){

    }

    public String toString(){
        String result = ""; 
        for(int i = 0 ; i < tree_length ; i ++){
            result += tree[i]+" "; 
        }
        return result ; 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in); 
        int num_of_op = scanner.nextInt(); 
        MinHeap mh = new MinHeap(num_of_op); 
        for(int i = 0 ; i < num_of_op ; i++){
            int op = scanner.nextInt(); 
            if(op == 1){
                int value = scanner.nextInt(); 
                mh.insert(value);
            }else if(op == 2){
                int value = scanner.nextInt();
                mh.delete(value);
            }else{
                System.out.println(mh.getMin());
            }
        }
    }
}