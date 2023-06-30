import java.util.*;

public class ThreeSum {


    public static void main(String args[]){
        List res = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(res);

    }


    public static  List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        /*for(int x : nums){
            System.out.print(x+" ");
        }*/
        List<List<Integer>> res = new ArrayList();
        for( int i = 0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1 ;
            int right = nums.length-1;
            while(left<right){
                int temp = 0 - nums[i];
                //System.out.println("left = "+nums[left]+"right = "+nums[right]);
                //System.out.println("nums[left] + nums[right] +nums[i] = "+(nums[left] + nums[right] +nums[i]));
                int sum = nums[left] + nums[right] +nums[i];
                if(sum == 0){
                    List found = new ArrayList();
                    Collections.addAll(found,nums[i],nums[left],nums[right]);
                    res.add(found);
                    left++;
                    while(nums[left]==nums[left-1] && left<right){
                        left++;
                    }
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }

            }
        }
        return res;
    }


}
