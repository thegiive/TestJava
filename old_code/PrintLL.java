package codes; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Node {
    int data;
    Node next;
 }

public class PrintLL {

    static void Print(Node head) {
         while(head != null ){
             System.out.println(head.data); 
             head = head.next; 
         }
    }

    static Node Insert(Node head,int data) {
        // This is a "method-only" submission. 
        // You only need to complete this method. 
        Node tmp = head; 
        while(tmp.next != null) tmp = tmp.next ; 
        Node t1 = new Node(); 
        t1.data = data ; 
        tmp.next = t1 ; 
        return head ; 
    }

    static Node InsertHead(Node head,int data) {
        Node t1 = new Node(); 
        t1.data = data ; 
        t1.next = head ; 
        return t1 ; 
    }
    
        
    static Node InsertNth(Node head, int data, int position) {        
        Node nodeToInsert = new Node(); nodeToInsert.data = data ; 
        if(head == null) return nodeToInsert ;
        if(position == 0 ){
            nodeToInsert.next = head ; 
            return nodeToInsert ; 
        }
        Node trackNode = head ;
        int tracePos = 0 ; 
        while(tracePos < position - 1 && head.next != null){
            head = head.next ; 
            tracePos ++ ; 
        }
        Node currentNode = head.next ; 
        head.next = nodeToInsert ; 
        nodeToInsert.next = currentNode ; 
         return trackNode ; 
     }
     

    public static void main(String[] args){
        // Node n1 = new Node(); 
        // Node n2 = new Node(); 
        // Node n3 = new Node(); 
        // n1.data = 1 ; 
        // n2.data = 2 ; 
        // n3.data = 3 ; 
        // n1.next = n2 ; 
        // n2.next = n3 ; 
        Node tmp = null ; 
        tmp = InsertNth(tmp, 3, 0);
        tmp = InsertNth(tmp, 5, 1);
        tmp = InsertNth(tmp, 4, 2   );
        tmp = InsertNth(tmp, 2, 3   );
        tmp = InsertNth(tmp, 10, 1   );
        // tmp = InsertNth(n1 , 100 , 1);
        // Insert(n1, 4); 
        // Node tmp = InsertHead(n1, 100); 

        Print(tmp);
        // LL.Print(n1);
    }
}