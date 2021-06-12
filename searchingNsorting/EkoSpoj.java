import java.util.Scanner;

public class EkoSpoj {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        int high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
            if(high < arr[i]) high= arr[i];
        }

        int low = 0;

        int val = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isFeasible(arr, n, mid, m)){
                val = mid;
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(val);
    }

    public static boolean isFeasible(int[] arr, int n, int mid, int m){
        long cut = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>mid) cut += (arr[i]-mid);
        }
        return cut>=m;
    }
}
