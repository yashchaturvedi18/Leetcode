import java.util.*;
public class wordBreak {

    public static void main(String args[]){

        ArrayList arr = new ArrayList();
        arr.add("leet");
        arr.add("code");
        System.out.println(wordBreak("leetcode",arr));
    }

    public static boolean wordBreak(String s, List<String> wordDict){

        int[] pos = new int[s.length()+1];
        Arrays.fill(pos, -1);

        pos[0]=0;

        for(int i=0; i<s.length(); i++){
            if(pos[i]!=-1){
                for(int j=i+1; j<=s.length(); j++){
                    String sub = s.substring(i, j);
                    if(wordDict.contains(sub)){
                        pos[j]=i;
                    }
                }
            }
        }

        return pos[s.length()]!=-1;

}
}



