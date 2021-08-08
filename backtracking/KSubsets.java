public class KSubsets {
    public boolean isKPartitionPossible(int a[], int n, int k)
    {
	    int sum =0;
	    for(int i=0;i<n;i++) sum+=a[i];
	    if(k==0 || sum%k != 0) return false;
	    return find(0,a,new boolean[n], k,0, sum/k);
    }
    
    boolean find(int start, int[] arr, boolean[] visited, int k, int currBuckSum, int tarSum){
        if(k==1) return true;
        if(currBuckSum == tarSum){
            return find(0, arr, visited, k-1, 0, tarSum);
        }
        for(int i=start; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                if(find(i+1, arr, visited, k, currBuckSum+arr[i], tarSum)){
                    return true;
                }
                visited[i] = false;
            }
        }
        return false;
    }
}
