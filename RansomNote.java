import java.util.*;

public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>(); 
        noteMap = new HashMap<String, Integer>(); 

        for(String s: magazine.split(" ")){
            if(magazineMap.containsKey(s)){
                magazineMap.put(s ,  magazineMap.get(s) +1 );                 
            }else{
                magazineMap.put(s ,1);
            }
        }

        for(String s: note.split(" ")){
            if(noteMap.containsKey(s)){
                noteMap.put(s ,  noteMap.get(s) +1 );                 
            }else{
                noteMap.put(s ,1);
            }
        }

    }
    
    public boolean solve() {
        boolean result = true; 
        for (String name: noteMap.keySet()){
            if( magazineMap.containsKey(name)){
                if( magazineMap.get(name) < noteMap.get(name)){
                    result = false; 
                }
            }else{
                result = false ; 
            }
        } 

        return result ;         
    }

    public static void main(String[] args) {
        Solution s=  new Solution("aaa bbb ccc", "aaa bbb ddd");
        System.out.println(s.solve());
        // Scanner scanner = new Scanner(System.in);
        // int m = scanner.nextInt();
        // int n = scanner.nextInt();
        
        // // Eat whitespace to beginning of next line
        // scanner.nextLine();
        
        // Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        // scanner.close();
        
        // boolean answer = s.solve();
        // if(answer)
        //     System.out.println("Yes");
        // else System.out.println("No");
      
    }
}
