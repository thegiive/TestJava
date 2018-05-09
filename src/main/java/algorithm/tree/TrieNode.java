package algorithm.tree;


public class TrieNode{
    TrieNode[] child_arr ;
    int count ;

    TrieNode(){
        child_arr = new TrieNode[26];
        count = 1;
    }

    public void insert(char c){
        if(this.child_arr[c-'a'] != null){
            this.child_arr[c-'a'].count ++ ;
        }else{
            this.child_arr[c-'a'] = new TrieNode();
        }
    }

    public void insert(String input){
        TrieNode tn = this ;
        for(char c: input.toCharArray()){
            tn.insert(c);
            tn = tn.getNode(c);
        }
    }

    public TrieNode getNode(char c){
        return this.child_arr[c-'a'];
    }

    public TrieNode getNode(String input){
        TrieNode tn = this ;
        for(char c : input.toCharArray()){
            if(tn.getNode(c) != null){
                tn = tn.getNode(c);
            }else{
                return null ;
            }
        }
        return tn ;
    }

    public int getCount(String input){
        TrieNode tn = this.getNode(input);
        if(tn != null){
            return tn.count;
        }else{
            return 0 ;
        }
    }


    public String toString(){
        String result =this.count+" ";
        TrieNode node = this ;
        for (int i = 0; i < node.child_arr.length; i++) {
            if (node.child_arr[i] != null) {
                char tmp = 'a';
                tmp += i;
                result += tmp + ":" + node.child_arr[i].count + " ";
            }
        }

        return result ;
    }

}
