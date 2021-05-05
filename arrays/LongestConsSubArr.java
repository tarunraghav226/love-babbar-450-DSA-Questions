import java.util.Arrays;

public class LongestConsSubArr{
    static int findLongestConseqSubseq(int arr[], int N){
	   // add your code here
       int globalMax =0, currMax = 1;
       Arrays.sort(arr);
        for(int i=0;i<N-1;i++){
            if(arr[i]+1 == arr[i+1]){
                currMax += 1;
            }
            else{
                if(globalMax < currMax){
                    globalMax = currMax;
                }
                currMax = 1;
            }
        }
       return globalMax;
	}
    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        System.out.println(findLongestConseqSubseq(arr, arr.length));
    }
}