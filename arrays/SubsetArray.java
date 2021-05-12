import java.util.Arrays;

public class SubsetArray {
    public static boolean found(long[] arr, long val, int low, int high){
        if(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == val) return true;
            else if(arr[mid] > val) return found(arr, val, low, mid-1);
            else return found(arr, val, mid+1, high);
        }
        return false;
    }

    public static String isSubset( long a1[], long a2[], long n, long m) {
        for(long val2: a2){
            if(!found(a1,val2, 0, a1.length-1)) return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) {
        long[] a1 = {1, 2, 3, 4, 5, 6};
        long[] a2 = {1, 2, 4};

        Arrays.sort(a1);
        System.out.println(isSubset(a1, a2, a1.length, a2.length));
    }
}
