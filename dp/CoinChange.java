package dp;

public class CoinChange {
    public long count(int S[], int m, int n) {
        long[][] dp = new long[m][n+1];
        for(int i=0;i<m;i++)
            for(int j=0;j<n+1;j++)
                dp[i][j] = -1;
        
        return countUtil(S, m-1, n, dp);
    }

    public long countUtil(int[] S, int m, int n, long[][] dp){
        if(m==-1 && n>0){
            return 0;
        }
        if(n==0) return 1;
        if(n<0) return 0;

        if(dp[m][n] != -1) return dp[m][n];
        return dp[m][n] = countUtil(S, m, n-S[m], dp) + countUtil(S, m-1, n, dp);        
    } 
}
