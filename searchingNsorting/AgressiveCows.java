import java.util.Arrays;
import java.util.Scanner;

public class AgressiveCows{
    public static boolean canPlace(int[] arr, int n, int cows, int dist){
        int coord = arr[0], count=1;
        for(int i=1;i<n;i++){
            if(arr[i]-coord>=dist){
                count++;
                coord=arr[i];
            }
            if(count == cows) return true;
        }
        return false;
    }
    public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int c = scan.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++)
                arr[i] = scan.nextInt();
            Arrays.sort(arr);

            int low = 1;
            int high = arr[n-1]-arr[0];
            
            int res = -1;
            while(low<=high){
                int mid = (low+high)/2;
                if(canPlace(arr, n, c,mid)){
                    res = mid;
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            System.out.println(res);
        }
	}
}