import java.util.Collections;

public class ChocolateDistribution {
    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        int min = Integer.MAX_VALUE;
        int d =0;

        for(int i=0;i+m-1<a.size();i++){
            d = a.get(i+m-1)-a.get(i);
            if(d<min) d = min;
        }
        return min;
    }
}
