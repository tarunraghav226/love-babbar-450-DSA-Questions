public class CountSquares {
    static int countSquares(int N) {
        int l = 1;
        int r = N;
        while(l<=r){
            int mid = (l+r)/2;
            if(Math.pow(mid,mid) < N) return mid;
            else if(Math.pow(mid,mid) >= N) r = mid-1; 
        }
        return -1;
    }
}
