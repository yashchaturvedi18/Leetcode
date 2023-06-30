public class PalindromicSubstrings {


    public static void main(String args[]){

            System.out.println(countSubstrings("abc"));
    }


    public static int countSubstrings(String s) {
        //a a b c
        int count = 0;
        int l=0,r=0;
        for(int i = 0;i<s.length();i++){

            l=i;
            r = i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){

                count ++ ;
                l--;
                r++;
            }

            l=i;
            r = i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){

                count ++ ;
                l--;
                r++;
            }
        }
        return  count;
    }


}
