import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencingProblem {
    class Job{
        int id, profit, deadline;
    }
    int[] JobScheduling(Job arr[], int n){
        int[] hash = new int[100];
        Arrays.sort(arr, (a,b)->b.profit-a.profit);
        int days = 0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=Math.min(n,arr[i].deadline-1);j>=0;j--){
                if(hash[j] == 0){
                    hash[j] = 1;
                    days++;
                    sum += arr[i].profit;
                    break;
                }
            }
        }
        return new int[]{days, sum};
    }
}
