public class MinSwaps {
    public static int minSwap (int arr[], int n, int k) {
        int min_swaps = Integer.MAX_VALUE;

        int good = 0;

        for(int i=0;i<n;i++){
            if(arr[i] <= k) good++;
        }

        int start =0, end = good-1;
        int bad = 0;
        while(end < n){
            bad = 0;
            for(int i=start;i<=end;i++){
                if(arr[i]>k) bad++;
            }
            min_swaps = min_swaps>bad?bad:min_swaps;
            start++;end++;
        }
        
        return min_swaps;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;
        int n = arr.length;
        System.out.println(minSwap(arr, n, k));
    }
}
