public class CountSquares {
    static int countSquares(int N) {
        if(N ==0) return 0;
        int l = 1;
        int r = N;
        int ans = 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(mid*mid < N) {
                ans=mid;
                l = mid+1;
            }
            else if(mid*mid >= N) r = mid-1; 
        }
        return ans;
    }
}
