import java.util.HashMap;


class addAndSearchWord {


    public static void main(String args[]){

    addAndSearchWord obj = new addAndSearchWord();
    obj.addWord("bad");
    obj.addWord("dad");
    obj.addWord("mad");
    //System.out.println(obj.search("pad"));
       // System.out.println(obj.search("bad"));
        //System.out.println(obj.search(".ad"));
        System.out.println(obj.search("b.."));

    }
    TNode root = null;
    public addAndSearchWord() {
            this.root = new TNode();
    }

    public void addWord(String word) {
            TNode current = this.root;
            for(int i = 0;i<word.length();i++){
                Character c = word.charAt(i);
                if(!current.children.containsKey(c)){
                    TNode newNode = new TNode();
                    current.children.put(c,newNode);
                    current = newNode;
                }
                else{
                    current = current.children.get(c);
                }
            }
            current.lastNode=true;
    }

    public boolean search(String word) {

            return dfs(this.root,word);

    }

    public  boolean dfs(TNode node,String sub){
        TNode current = node;
        for(int i =0;i<sub.length();i++){

            if(sub.charAt(i)=='.'){

                    for (Character c : current.children.keySet()) {
                        if (dfs(current.children.get(c), sub.substring(i + 1, sub.length()))) {
                            return true;
                        }
                    }
                    return false;

            }
            else{
                Character temp = sub.charAt(i);
                if(current.children.containsKey(temp)){
                    current = current.children.get(temp);
                }
                else{
                    return false;
                }
            }

        }
        return current.lastNode;

    }
}

class TNode{

    HashMap<Character,TNode> children = null;
    boolean lastNode = false;
    TNode(){
        this.children = new HashMap<Character,TNode>();
    }

}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */