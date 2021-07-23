import java.util.Arrays;

public class MaximizeSum {
    public static long maximizeSum(long a[], int n, int k){
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]<0 && k>0){
                a[i] = -a[i];
                k--;
            }
        }
        long sum =0;
        long min = a[n-1];
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(min>a[i]) min =a[i];
        }
        if(k%2==1) sum-=2*min;
        return sum;
    }
}
