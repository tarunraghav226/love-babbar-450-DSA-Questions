import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }

    class MyComparator implements Comparator<Item>{
        @Override
        public int compare(FractionalKnapsack.Item o1, FractionalKnapsack.Item o2) {
            double v1 = (double)o1.value/(double)o1.weight;
            double v2 = (double)o2.value/(double)o2.weight;
            if(v1>v2) return -1;
            else if (v2>v1) return 1;
            return 0;
        }
    }
    
    double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr, new MyComparator());
        int totalWeight =0;
        double ans = 0;
        for(int i=0;i<n;i++){
            if(totalWeight+arr[i].weight<=W){
                totalWeight += arr[i].weight;
                ans += arr[i].value;
            }
            else{
                int remain = W-totalWeight;
                ans += ((double)arr[i].value/(double)arr[i].weight)*(double)remain;
                break;
            }
        }
        return ans;
    }
}
