public class ClimbingStairs {

    public static void main(String args[]){
        climbStairs(5);
    }

    public static int climbStairs(int n) {
        if(n==0){
            return 1;
        }
        return helper(0,n);

    }

    public static int helper(int n , int last){
        int res = 0;
        if(n>=last){
            res =  1;
        }
        else{
            res = helper(n+1,last) + helper(n+2,last);
        }
        return res;
    }

}
