package dp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Knapsack {
    static int[][] dp;
    static int knapSack(int W, int wt[], int val[], int n) {
        dp = new int[n+1][W+1];
        for(int[] arr: dp)
            Arrays.fill(arr, -1);
        return knapsackUtil(W, wt, val, n);
    } 

    static int knapsackUtil(int w, int[] wt, int[] val, int n){
        if(n==0 || w==0){
            return 0;
        }

        if(dp[n][w]!=-1) return dp[n][w];

        if(wt[n-1]<=w){
            return dp[n][w] = Math.max(val[n-]+knapSack(w-wt[n-1], wt, val, n-1), knapSack(w, wt, val, n-1));
        }
        else {
            return dp[n][w] = knapSack(w, wt, val, n-1);
        }
    }
}
