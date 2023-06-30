public class UniquePaths {


    public static void main(String args[]){

        System.out.println(uniquePaths(3,2));
    }

    public static int  uniquePaths(int m, int n) {
        int r = m-1;
        int c = n-1;
        int[][] arr = new int[m][n];
        arr[r][c] = 1;
        return 0;
    }

    public static int helper(int i ,int j , int m , int n){
        if(i>m-1 || j >n-1){
            return 0;
        }
        if(i==m-1 && j == n-1){
            return 1;
        }
        int res = helper( i+1,j,m,n);
        res = res + helper(i,j+1,m,n);
        return res;
    }

}
