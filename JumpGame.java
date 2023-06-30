import java.util.HashMap;

class JumpGame {

    public static void main(String args[]){
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
    static HashMap map = new HashMap();

    public static boolean canJump(int[] nums) {
        return helper(nums,0);
    }

    public static boolean helper(int[] nums, int i ){
        //[2,3,1,1,4]
        if(map.containsKey(i)){
            return (boolean) map.get(i);
        }
        if(i>nums.length-1){
            return false;

        }
        if(i!=nums.length-1 && nums[i]==0){
            return false;
        }

        if(i == nums.length-1){
            return true;
        }
        boolean got =false;
        for(int j = 1;j<=nums[i];j++){
            got = helper(nums, i+j);
            if(got){
                break;
            }
        }
        map.put(i,got);
        return got;
    }

}