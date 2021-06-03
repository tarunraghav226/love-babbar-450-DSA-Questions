import java.util.ArrayList;

public class FirstLastPos {

    public void first(long[] arr, ArrayList<Long> pos, int x, int low, int high){
        int res = -1;
        while(low <= high){
            int mid = (low+high) /2;
            if(arr[mid] == x){
                res = mid;
                high = mid-1;
            }
            else if(arr[mid] > x){
                high = high-1;
            }
            else low += 1;
        }
        pos.set(0, (long)res);
    }

    public void last(long[] arr, ArrayList<Long> pos, int x, int low, int high){
        int res = -1;
        while(low <= high){
            int mid = (low+high) /2;
            if(arr[mid] == x){
                res = mid;
                low = low+1;
            }
            else if(arr[mid] > x){
                high = high-1;
            }
            else low += 1;
        }
        pos.set(1, (long)res);
    }

    ArrayList<Long> find(long arr[], int n, int x){

        ArrayList<Long>  pos = new ArrayList<>();
        pos.add((long)-1);
        pos.add((long)-1);

        first(arr, pos,x, 0, arr.length-1);
        last(arr, pos,x, 0, arr.length-1);

        return pos;

    }
}
