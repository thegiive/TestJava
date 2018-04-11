import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ATaleOfTwoStack {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value); 
        }

        public void reFillOldestStack(){
            if(stackOldestOnTop.empty()){
                while(!stackNewestOnTop.empty()){
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

        public T peek() {
            reFillOldestStack();
            if(stackOldestOnTop.empty()){
                return null ; 
            }else{
                return stackOldestOnTop.peek();
            }
        }

        public T dequeue() {
            reFillOldestStack();
            if(stackOldestOnTop.empty()){
                return null ; 
            }else{
                return stackOldestOnTop.pop();
            }            
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        queue.enqueue(new Integer(1)) ; 
        queue.enqueue(new Integer(2)) ; 
        queue.enqueue(new Integer(3)) ; 
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        
        // for (int i = 0; i < n; i++) {
        //     int operation = scan.nextInt();
        //     if (operation == 1) { // enqueue
        //         queue.enqueue(scan.nextInt());
        //     } else if (operation == 2) { // dequeue
        //         queue.dequeue();
        //     } else if (operation == 3) { // print/peek
        //         System.out.println(queue.peek());
        //     }
        // }
        // scan.close();
    }
}
