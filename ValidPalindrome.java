public class ValidPalindrome {

    public static void main(String args[]){

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {

        String str = "";
        for(int i = 0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){

                str = str + s.charAt(i);
            }
        }

        String lower = str.toLowerCase();
        StringBuilder builder = new StringBuilder();
        builder.append(lower);
        builder.reverse();
        if(lower.equals(builder.toString())){
            return  true;
        }
        else {
            return  false;
        }
    }

}
