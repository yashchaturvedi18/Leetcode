public class LongestPalindromicSubstring {


    public static void main(String args[]){

        System.out.println(longestPalindrome("babad"));
    }

    public static  String longestPalindrome(String s) {

        String res = "";
        int maxLen = 0;
        int l = 0;
        int r = 0;
        for(int i = 0;i<s.length();i++){
            l = i;
            r = i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(((r-l)+1)>maxLen) {
                    res = s.substring(l, r + 1);
                    maxLen = r - l + 1;
                }
                        l--;
                        r++;



            }

            l = i;
            r = i + 1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(((r-l)+1)>maxLen) {
                    res = s.substring(l, r + 1);
                    maxLen = r - l + 1;
                }
                    l--;
                    r++;



            }

        }
    return  res;
    }

}
