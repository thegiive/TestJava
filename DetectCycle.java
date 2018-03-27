import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DetectCycle {
    static class Node {
        int data;
        Node next;
    }


    public static boolean hasCycle(Node head) {
        if(head == null )return false ;
        Set<Node>  s = new HashSet<Node>(); 
        while(head != null){
            if(s.contains(head)) return true ; 
            s.add(head); 
            head = head.next ; 
        }
        return false ;

    }

    // public static boolean hasCycle(Node head){
    //     if(head == null) return false ; 
    //     // if(head.next == null) return false ; 
    //     Node slow = head.next; 
    //     Node fast = head.next.next ; 

    //     while(slow != fast){
    //         if(fast == null) return false ; 
    //         if(fast.next == null) return false ; 
    //         slow = slow.next ; 
    //         head = head.next.next; 
    //     }
    //     return true; 
    // }

    // public static boolean hasCycle(Node head) {
    //     if (head == null) return false;
        
    //     Node slow = head;
    //     Node fast = head.next;
    //     while (slow != fast) {
    //         if (fast == null || fast.next == null) return false;
            
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
        
    //     return true;
    // }


    public static void main(String[] args) throws IOException {
        // Set<Node> s = new HashSet<Node>();
        Node n1 = new Node(); 
        n1.data = 1; 
        Node n2 = new Node(); 
        n2.data = 2 ; 
        Node n3 = new Node(); 
        n3.data = 3 ; 
        n1.next = n2 ;
        n2.next = n1; 
        
        // n2.next = n3 ; 
        // n3.next = n2 ;  
        // n2.next = n1 ; 
        // s.add(n1);
        System.out.println(hasCycle(n1));
        // System.out.println(s.contains(n2));

    }
}
