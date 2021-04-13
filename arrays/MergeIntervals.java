import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a,b)->{return Integer.compare(a[0], b[0]);});  
         LinkedList<int[]> mergeList = new LinkedList<>();

         for(int[] interval: intervals){
             if(mergeList.isEmpty() || mergeList.getLast()[1] < interval[0]){
                 mergeList.add(interval);
             }
             else{
                 mergeList.getLast()[1] = Math.max(interval[1], mergeList.getLast()[1]);
             }
         }

         return mergeList.toArray(new int [mergeList.size()][]);
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };
        int[][] mergedArr = merge(arr);

        for(int[] interval: mergedArr){
            System.out.println(interval[0]+" "+interval[1]);
        }
    }
}
