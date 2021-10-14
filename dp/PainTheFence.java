package dp;

public class PainTheFence {
    long countWays(int n,int k){
        int mod = 1000000007;
        if(n==0) return 0;
        if(n==1) return k;
        long same = k%mod;
        long diff = (k*(k-1))%mod;
        long total = (same+diff)%mod;
        for(int i=3;i<=n;i++){
            same = diff;
            diff = (total * (k-1)%mod)%mod;
            total = (same+diff)%mod;
        }
        return total%mod;
    }
}
