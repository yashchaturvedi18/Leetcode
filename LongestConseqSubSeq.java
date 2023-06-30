import java.util.*;

public class LongestConseqSubSeq {

    public static void main(String args[]){
        int arr[] = {1,9,10,3,4,20,2};
        System.out.println(findLongestCons(arr));

    }

    public static int findLongestCons(int a[]){
        int res = 0;
        Arrays.sort(a);
        int count = 0;
        for(int i = 0 ;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]+1){
                count++;
            }
            else{
                count=1;
            }
            res = Math.max(res,count);
        }
        return res ;
    }


}
