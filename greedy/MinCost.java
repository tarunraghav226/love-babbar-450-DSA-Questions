import java.util.Comparator;
import java.util.PriorityQueue;

public class MinCost {
    class MyComparator implements Comparator<Long>{
        @Override
        public int compare(Long o1, Long o2) {
            // TODO Auto-generated method stub
            return (o1-o2)>0?1:-1;
        }
    }
    long minCost(long arr[], int n){
        PriorityQueue<Long> pq = new PriorityQueue<>(new MyComparator());
        for(int i=0;i<n;i++) pq.add(arr[i]);
        long sum = 0;
        while(pq.size()>1){
            long x = pq.poll();
            long y = pq.poll();
            sum += (x+y);
            pq.add(x+y);
        }
        return sum;
    }
}
