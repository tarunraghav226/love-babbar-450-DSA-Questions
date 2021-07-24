import java.util.Arrays;

public class MaxArrPro {
    int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum = (sum%1000000007 + (arr[i]%1000000007 * i%1000000007))%1000000007;

        return sum;   
    }   
}
