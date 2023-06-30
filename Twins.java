import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Twins {


    public static void main(String args[]){
        int[] arr = {1,1,2,3,3,4,4};
        funcTwins(arr);
    }

    public static void  funcTwins(int[] inputArr) {
        // Write your code here

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i =0;i<inputArr.length;i++) {
            if (set.contains(inputArr[i])) {
                set.remove(inputArr[i]);
            } else {
                set.add(inputArr[i]);
            }
        }
            int min = Integer.MAX_VALUE;
            for(int x : set){
                if(x<min){
                    min = x;
                }
            }


        System.out.println(min);
    }


    }
