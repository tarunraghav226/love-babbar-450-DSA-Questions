public class TripleSum {
    long countTriplets(long arr[], int n,int sum){
        long val = 0;
        Arrays.sort(arr);
        
        for(int i=0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                long tar = arr[i] + arr[l]+arr[r];
                if(tar < sum){
                    val += (r-l);
                    l++;
                    
                }
                else {
                    r--;
                }
            }
        }
        
        return val;
    }
}
