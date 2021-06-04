public class SearchWithK {
    int solve(int[] arr, int x, int k, int n){
        int i=0;
        while(i<n){
            if(arr[i] == x) return i;
            i =Math.max(1, Math.abs(arr[i] - x)/k);
        }
        return -1;
    }
}
