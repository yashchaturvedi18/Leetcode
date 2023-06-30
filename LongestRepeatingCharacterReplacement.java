import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {


    public static void main( String args[] ){

        System.out.println(characterReplacement("AABABBA",1));


    }

    public static int characterReplacement(String s, int k) {
        int res = 0;
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),(int)map.get(s.charAt(right))+1);
            }
            else{
                map.put(s.charAt(right),1);
            }
            int winL = right - left +1;
            int maxVal = 0;
            for(Character key:map.keySet()){
                maxVal = Math.max(maxVal,map.get(key));
            }
            if(winL - maxVal<=k){
                res = Math.max(res,winL);

            }
            else{
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            right++;
        }
        return res;

    }
}
