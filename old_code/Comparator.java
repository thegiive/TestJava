package codes; 
import java.util.*; 

public class Comparator{

    static class Player{
        String name;
        int score;
        
        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }
    
    public static int compare(Player o1 , Player o2){
        //Return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
        if(o1.score != o2.score) return o2.score - o1.score ; 

        // return o1.name.compareTo(o2.name); 
        char[] o1Char = o1.name.toCharArray(); 
        char[] o2Char = o2.name.toCharArray(); 
        for( int i = 0 ; i < Math.min(o1.name.length() , o2.name.length()) ; i++){
            if(o1Char[i] != o2Char[i]) return o1Char[i] - o2Char[i] ; 
        }
        return o1.name.length() - o2.name.length() ; 
    }

    public static void main(String[] args){
        Player p1 = new Player("abc", 123); 
        Player p2 = new Player("abc", 456); 
        Player p3 = new Player("bcd", 123); 
        Player p4 = new Player("0bcd", 123); 

        System.out.println(compare(p1, p2));
        System.out.println(compare(p1, p3));
        System.out.println(compare(p1, p4));

    }
}

