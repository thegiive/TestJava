package algorithm.search; 

public class BinarySearch{
    public static boolean search(int[] arr, int value){
        int start_index = 0 , end_index = arr.length -1 ; 
        while(start_index <= end_index) {
            int current_index = start_index + (end_index - start_index ) / 2 ;
            if(arr[current_index] == value){
                return true ; 
            }else if(arr[current_index] > value){
                end_index = current_index - 1 ;
            }else{
                start_index = current_index + 1 ;
            }
        }
        return false ; 
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        search(arr,4) ;
    }
}