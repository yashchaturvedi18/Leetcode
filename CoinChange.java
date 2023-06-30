import java.util.Arrays;
public class CoinChange {

    public static void main(String args[]){
        int[] arr = {2};
        coinChange(arr,3);
    }

    public static int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount+1];
        Arrays.fill(arr,amount+1);
        arr[0] = 0 ;
        for(int i = 1;i<=amount;i++){
            for(int j = 0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    arr[i] = Math.min(arr[i], 1 + arr[i-coins[j]]);
                }
            }
        }
        if(arr[amount]==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return arr[amount];
        }
    }
}
