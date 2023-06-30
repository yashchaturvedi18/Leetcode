public class HouseRobber2 {


    public static void main(String args[]){
        int[] ar = {2,3,2};
        System.out.println(houseRobber2(ar));
    }


    public static int houseRobber2(int[] arr){

        if(arr.length == 1){
            return arr[0];
        }
        if(arr.length ==2){
            return Math.max(arr[0],arr[1]);
        }
        int[] arr1 = new int[arr.length - 1];
        int[] arr2 = new int[arr.length - 1];
        for(int i =0;i<arr.length-1;i++){
            arr1[i] =arr[i];
        }
        for(int i =1;i<arr.length;i++){
            int temp = i-1;
            arr2[temp] =arr[i];
        }
        int res = Math.max(houseRobber1(arr1),houseRobber1(arr2));
        return  res;

    }

    public static int houseRobber1(int[] arr){

        //[1,2,3,1]
        if(arr.length == 1){
            return arr[0];
        }
        if(arr.length ==2){
            return Math.max(arr[0],arr[1]);
        }
        int[] dp = new int[arr.length];
        dp[0]= arr[0];
        dp[1]= Math.max(arr[0],arr[1]);
        for(int i =2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        return dp[arr.length-1  ];



    }

}
