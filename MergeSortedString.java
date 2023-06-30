public class MergeSortedString {

    public static void main(){
    int a[]={1,2,3,0,0,0};
    int b[]={2,5,6};
    merge(a,a.length,b,b.length);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m-1;
    int j = m+n-1;
    int k = n-1;
    while(k!=0 && i!=0 ){
        if(nums1[i]>=nums2[k]){
            nums1[j] = nums1[i];
            j--;
            i--;
        }
        else if(nums1[i]<nums2[k]){
            nums1[j] = nums2[k];
            j--;
            k--;
        }
    }
    System.out.println(" nums1 "+nums1);

    }
}
