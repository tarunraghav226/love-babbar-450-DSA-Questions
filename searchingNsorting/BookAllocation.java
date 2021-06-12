public class BookAllocation{
    public static int findPages(int[]a,int n,int m){
        int res = -1;
        int low = 0;
        int high =0;
        for(int i=0;i<n;i++) high += a[i];
        while(low <= high){
            int mid = (low+high)/2;
            if(canAllocate(a, n, mid, m)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }

    public static boolean canAllocate(int[] arr, int n, int val, int students){
        int sum = 0, count=1;
        for(int i=0;i<n;i++){
            if(arr[i] > val) return false;
            if(sum+arr[i]<=val){
                sum+=arr[i];
            }
            else{
                sum = arr[i];
                count++;
                if(count > students) return false;
            }
        }
        return true;
    }
}