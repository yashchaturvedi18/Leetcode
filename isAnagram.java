import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class isAnagram {


    public static void main(String args[]){

        System.out.println(check("anagram","nagaram"));

    }

    public static boolean check(String a , String b){
        char[] atemp = a.toCharArray();
        char[] btemp = b.toCharArray();
        Arrays.sort(atemp);
        Arrays.sort(btemp);


        List<Character> a1 = new ArrayList<>();
        List<Character> a2 = new ArrayList<>();
        for(Character c:atemp){
            a1.add(c);
        }
        for(Character c:btemp){
            a2.add(c);
        }

        if(a1.equals(a2)){
            return true;
        }
        else{
            return false;
        }

    }

    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
}
