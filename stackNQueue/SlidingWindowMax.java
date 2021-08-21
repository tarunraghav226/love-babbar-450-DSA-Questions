import java.util.*;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ri=0;
        Deque<Integer> q = new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        for(int i=0;i<n;i++){
            while(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                ans[ri++] = nums[q.peek()];
            }
        }
        return ans;
    }
}
