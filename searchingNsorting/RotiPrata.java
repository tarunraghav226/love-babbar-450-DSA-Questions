import java.util.Scanner;

public class RotiPrata {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-->0){
            int p = scan.nextInt();
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = scan.nextInt();

            int low=0, high=100000000;
            int ans = 0;

            while(low<high){
                int mid = low +(high-low)/2;
                if(canMake(arr,n,p,mid)){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            System.out.println(ans);
        }
	}
    public static boolean canMake(int[] arr, int n, int p, int reqTime){
        int time=0, paratas=0,j;
        for(int i=0;i<n;i++){
            time = arr[i];
            j=2;
            while(time<=reqTime){
                paratas++;
                time += (arr[i]*j);
                j++;
            }
            if(paratas >= p) return true;
        }
        return false;
    }
}
