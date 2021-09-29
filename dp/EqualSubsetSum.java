public class EqualSubsetSum {
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum =0;
        for(int i=0;i<N;i++) sum+=arr[i];
        
        if(sum%2 != 0) return 0;
        
        int reqSum =sum/2;
        return subSetSum(arr, reqSum, N)?1:0;
    }
    
    static boolean subSetSum(int[] arr, int sum, int n){
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=1;i<=sum;i++){
            dp[0][i] =false;
        }
        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = (dp[i-1][j-arr[i-1]] || dp[i-1][j]);
                }
                else 
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}
