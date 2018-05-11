package algorithm.tree;

import java.util.Queue;

public class TreeSearch {

    public static String DFSSearch(Node node){
        if(node == null) return "";
        String result = "";
        result += node.value + " ";
        node.visited = true ;
        if(node.left != null && !node.left.visited) result += DFSSearch(node.left) ;
        if(node.right != null && !node.right.visited) result += DFSSearch(node.right) ;
        return result ;
    }

    public static String BFSSearch(Node node){
        MyQueue queue = new MyQueue();
        String result = "";
        node.visited = true ;
        result += node.value+" ";
        queue.enqueue(node);

        while(!queue.isEmpty()){
            Node tmp_root_node = queue.dequeue();
            if(tmp_root_node.left != null){
                Node tmp_node = tmp_root_node.left;
                if(tmp_node.visited == false){
                    result += tmp_node.value+" ";
                    tmp_node.visited = true ;
                    queue.enqueue(tmp_node);
                }
            }
            if(tmp_root_node.right != null){
                Node tmp_node = tmp_root_node.right;
                if(tmp_node.visited == false){
                    result += tmp_node.value+" ";
                    tmp_node.visited = true ;
                    queue.enqueue(tmp_node);
                }
            }

        }
        return result ;
    }


}
class Node{
    int value ;
    boolean visited ;
    Node left ;
    Node right ;
    public Node(int v){
        value = v ;
        visited = false ;
    }
}

class MyQueue{
    int queue_length ;
    Node[] queue ;
    public MyQueue(){
        queue = new Node[100];
        queue_length = 0 ;
    }

    public void enqueue(Node node){
        queue[queue_length++] = node;
    }

    public Node dequeue(){
        queue_length -- ;
        return queue[queue_length];
    }

    public boolean isEmpty(){
        return queue_length == 0 ;
    }

}
