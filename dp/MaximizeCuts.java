package dp;

import java.util.Arrays;

public class MaximizeCuts {
    int[] dp = new int[10005];
    public int maximizeCuts(int n, int x, int y, int z){
       Arrays.fill(dp, -1);
       int ans = find(n, x, y, z);
       if(ans < 0 )return 0;
       return ans;
    }

    public int find(int n, int x, int y, int z){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int ans1 = Integer.MIN_VALUE, ans2 = Integer.MIN_VALUE, ans3 = Integer.MIN_VALUE;
        if(n>=x) ans1 = find(n-x, x, y, z);
        if(n>=y) ans2 = find(n-y, x, y, z);
        if(n>=z) ans3 = find(n-z, x, y, z);
        dp[n] = 1+Math.max(ans1, Math.max(ans2, ans3));
        return dp[n];
    }
}
