import java.util.*;

public class CombinationSum4
{

    public static void main(String args[]){



    }
    public int combinationSum4(int[] nums, int target) {
            String str = "ysh";
        int[] dp = new int[target+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        for(int i = 1;i<=target;i++){
            for(int j = 0;j<nums.length;j++){
                if(i-nums[j]>=0){
                    dp[i] = dp[i] + dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}
