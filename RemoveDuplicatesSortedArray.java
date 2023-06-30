import java.util.*;
public class RemoveDuplicatesSortedArray {


    public static void main(String args[]){

    }

    public static int remdupes(int num[]){
    int k = 1;
    for(int i = 0; i<num.length-1;i++){
        if(num[i]!=num[i+1]){
            num[k] = num[i+1];
            k++;
        }
    }
    return k +1;
    }
}
