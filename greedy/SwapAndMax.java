import java.util.ArrayList;
import java.util.Arrays;

public class SwapAndMax {
    long maxSum(long arr[] ,int n){
        ArrayList<Long> temp = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            temp.add(arr[i]);
            temp.add(arr[n-i-1]);
        }
        if(n%2==1){
            temp.add(arr[n/2]);
        }
        long sum =0;
        for(int i=0;i<n-1;i++){
            sum += (Math.abs(temp.get(i)-temp.get(i+1)));
        }
        sum+=(Math.abs(temp.get(n-1)-temp.get(0)));
        return sum;
    }
}
