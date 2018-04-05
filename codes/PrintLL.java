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


    public static void main(String[] args){
        Node n1 = new Node(); 
        Node n2 = new Node(); 
        Node n3 = new Node(); 
        n1.data = 1 ; 
        n2.data = 2 ; 
        n3.data = 3 ; 
        n1.next = n2 ; 
        n2.next = n3 ; 

        PrintLL LL = new PrintLL();
        LL.Print(n1);
    }
}