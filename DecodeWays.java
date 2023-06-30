import java.util.HashMap;

public class DecodeWays {

    int res = 0;

    public static void main(String args[]){

    System.out.println(numDecodings("123"));

    }


    public static int numDecodings(String s) {
        return 1;
    }
    HashMap map = new HashMap();
    public int helper(String s ,int i ){
//123

        if(i>=s.length()){
            return 1 ;
        }
        if(s.charAt(i)=='0'){
            return 0 ;
        }
        if(map.containsKey(i)){
            return (int) map.get(i);
        }
        int ways = helper(s,i+1);
        if(i+2<=s.length() && Integer.parseInt(s.substring(i,i+2))<=26){
            ways = ways + helper(s,i+2);
        }
        map.put(i,ways);
        return ways;

    }
}
