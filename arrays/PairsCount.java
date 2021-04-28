import java.util.HashMap;

public class PairsCount {
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
            hm.put(arr[i], hm.get(arr[i])+1);
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(hm.get(k-arr[i]) != null){
                count += hm.get(k-arr[i]);
            }

            if(k-arr[i] == arr[i])
                count --;
        }
        return count/2;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        System.out.println(getPairsCount(arr, arr.length, 6));
    }
}
