package codes; 
import java.util.*;

public class Fibonacci {

    public static int[] tmp = new int[65536];  
    
    public static int fibonacci(int n) {
        // Complete the function.
        if(n ==0) return 0 ; 
        if(n ==1) return 1 ; 
        if(tmp[n] != 0) return tmp[n];
        tmp[n]  = fibonacci(n-1)+fibonacci(n-2); 
        return tmp[n];
    }
    

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // scanner.close();
        // System.out.println(fibonacci(n));
        System.out.println(fibonacci(6));
    }
}
