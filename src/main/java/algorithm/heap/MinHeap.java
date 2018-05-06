package algorithm.heap; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinHeap{

    private int[] heap_tree ; 
    private int current_length ; 

    MinHeap(int length){
        heap_tree = new int[length]; 
        current_length = 0 ; 
    }

    public void insert(int value){
        heap_tree[current_length] = value ; 
        int compare_index = current_length ; 
        while(compare_index > 0 ){
            int root_index = compare_index % 2  == 1 ? compare_index / 2 : compare_index / 2 - 1  ; 
            if(heap_tree[compare_index] < heap_tree[root_index]){
                int t = heap_tree[compare_index] ; 
                heap_tree[compare_index] = heap_tree[root_index] ; 
                heap_tree[root_index] = t ; 
                compare_index = root_index ; 
            }else{
                break ; 
            }
        }
        current_length++ ; 
    }

    public int getMin(){
        return heap_tree[0] ; 
    }

    public void delete(int value){
        int compare_index = -1; 
        for(int i = 0 ; i < current_length ; i++){
            if(heap_tree[i] == value){
                compare_index = i ; 
                heap_tree[compare_index] = heap_tree[current_length-1]; 
                current_length -- ;
            }
        }
        if(compare_index == -1 )return ; 

        balanceMinHeap(compare_index);
    }

    private void balanceMinHeap(int compare_index){
        while(compare_index * 2 + 1 < current_length ){
            if(compare_index * 2 + 2 == current_length){
                //only one leaf
                if(heap_tree[compare_index] > heap_tree[compare_index*2+1] ){
                    int t = heap_tree[compare_index]; 
                    heap_tree[compare_index] = heap_tree[compare_index*2+1]; 
                    heap_tree[compare_index*2+1] = t ; 
                    compare_index = compare_index*2+1 ; 
                }else{
                    break ; 
                }
            }else{
                // two leaf 
                int min_leaf_index = 0 ; 
                if(heap_tree[compare_index*2+1] < heap_tree[compare_index*2+2]){
                    min_leaf_index = compare_index*2+1; 
                }else{
                    min_leaf_index = compare_index * 2 + 2 ; 
                }
                if(heap_tree[compare_index] > heap_tree[min_leaf_index]){
                    int t = heap_tree[compare_index]; 
                    heap_tree[compare_index] = heap_tree[min_leaf_index]; 
                    heap_tree[min_leaf_index] = t ; 
                    compare_index = min_leaf_index ;                     
                }else{
                    break ; 
                }
            }
        }

    }

    public void deleteMin(){
        heap_tree[0] = heap_tree[current_length-1] ;
        current_length -- ; 
        balanceMinHeap(0);
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