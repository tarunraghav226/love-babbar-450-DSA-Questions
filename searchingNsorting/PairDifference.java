import java.util.*;

class PairDifference{
    public boolean findPair(int arr[], int size, int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(arr[i], 1);
        }
        
        for(int i=0;i<size;i++){
            if(map.containsKey(arr[i]+n)) return true;
        }
        return false;
    }
}