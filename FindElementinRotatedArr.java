import java.io.*;
import java.util.*;

class FindElementinRotatedArr {

    static int shiftedArrSearch(int[] shiftArr, int num) {

        // your code goes here
        int pivot = findPivot(shiftArr);
        int res = 0;
        if(num>shiftArr[0] && num<=shiftArr[pivot]){
            //search in first half
            res = binarySearch(shiftArr, 0 , pivot,num);
        }
        else{
            //seacrh in second half
            res = binarySearch(shiftArr, pivot+1 , shiftArr.length-1,num);
        }

        return res;
    }
    //9 12 17 18 4 5
    static int findPivot(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }


    static int binarySearch(int[] arr, int l, int r,int target){
        int mid =0;
        while(l<=r){
            mid = (l+r) / 2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }


        }
        return mid;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 12, 17, 2, 4, 5,6};
        int res =shiftedArrSearch(numbers,17);
        System.out.println(res);
    }

}