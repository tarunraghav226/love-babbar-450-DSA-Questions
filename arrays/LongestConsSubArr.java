import java.util.Arrays;
import java.util.HashSet;

public class LongestConsSubArr{
    static int findLongestConseqSubseq(int arr[], int N){
	   // add your code here
       HashSet<Integer> set = new HashSet<>();
       for(int val: arr){
           set.add(val);
       }

       int longestSeq = 1;
       for(int val: arr){
           if(!set.contains(val-1)){
               int curNum = val;
               int curSeq = 1;

               while(set.contains(curNum+1)){
                   curNum += 1;
                   curSeq += 1;
               }

               longestSeq = Math.max(longestSeq, curSeq);
           }
       }
       return longestSeq;
	}
    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        System.out.println(findLongestConseqSubseq(arr, arr.length));
    }
}