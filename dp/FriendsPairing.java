import java.util.*;

public class FriendsPairing{
    int mod = 1000000007;
    public long countFriendsPairings(int n) {
        long[] dp = new long[n+1];
        Arrays.fill(dp, -1);
        return count(n, dp)%mod;
    }

    public long count(int n, long[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        long a = count(n-1, dp)%mod;
        long b = (((n-1)%mod)*(count(n-2, dp)%mod))%mod;
        dp[n] = a+b;
        return a+b;
    }
}