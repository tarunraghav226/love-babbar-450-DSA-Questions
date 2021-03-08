import java.util.Arrays;
import java.util.Scanner;

public class MinimizeHeight {
    public static int minimize(int[] arr, int n, int k){
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int smallest = arr[0] + k, largest = arr[n-1]-k;
        for(int i = 0; i < n-1; i++){
            int min = Math.min(smallest, arr[i+1]-k);
            int max = Math.max(largest, arr[i]+k);
            if(min < 0) 
                continue;
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = scan.nextInt();

        System.out.println(minimize(arr, n, k));
    }
}
