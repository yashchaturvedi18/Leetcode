import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String args[]){

        System.out.println("result "+lengthOfLongestSubstring("pwwkew"));

    }


    public static int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;

        int max = 0;
        HashSet set = new HashSet();
        //abcabcbb
        while(j<s.length()){

            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;

            }
            else{
                set.add(s.charAt(j));
                max = Math.max(max, set.size());
                j++;
            }

        }


        return max;


    }


}
