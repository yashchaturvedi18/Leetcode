import java.util.ArrayList;
import java.util.HashMap;

public class ImplementTrie {
}

class Trie {
    TrieNode root = null;
    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode curr = this.root;
        for(int i = 0;i<word.length();i++){
            Character c = word.charAt(i);
            if(!curr.children.containsKey(c))
            {
                TrieNode newNode = new TrieNode();
                curr.children.put(c,newNode);
                curr = newNode;
            }
            else{
                curr = curr.children.get(c);
            }
        }
        curr.lastNode = true;

    }

    public boolean search(String word) {
        TrieNode curr = this.root;
        for(int i = 0 ;i<word.length();i++){
            Character c = word.charAt(i);
            if(!curr.children.containsKey(c))
            {
                return false;
            }
            else{
                curr = curr.children.get(c);
            }
        }
        if(curr.lastNode==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = this.root;
        for(int i = 0 ;i<prefix.length();i++){
            Character c = prefix.charAt(i);
            if(!curr.children.containsKey(c))
            {
                return false;
            }
            else{
                curr = curr.children.get(c);
            }
        }
       return true;


    }
}

class TrieNode {
    HashMap<Character,TrieNode> children = new HashMap<Character,TrieNode>();

    boolean lastNode = false;
    TrieNode(){
      this.children = new HashMap<>();
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
