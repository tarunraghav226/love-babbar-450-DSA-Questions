import java.util.Arrays;

public class MinSwaps{
    static class Pair implements Comparable<Pair>{
        int val;
        int ind;

        @Override
        public int compareTo(MinSwaps.Pair o) {
            return this.val - o.val;
        }
    }

    public static int minSwaps(int nums[]){
        int n = nums.length;
        Pair[] pairs = new Pair[n];
        for(int i=0;i<n;i++){
            Pair pair = new Pair();
            pair.ind = i;
            pair.val = nums[i];
            pairs[i] = pair;
        }
        Arrays.sort(pairs);
        int swaps = 0;

        for(int i=0;i<n;i++){
            if(i != pairs[i].ind){
                swaps++;
                Pair temp = pairs[i];
                pairs[i] = pairs[temp.ind];
                pairs[temp.ind] = temp;
                i--;
            }
        }

        return swaps;
    }
}