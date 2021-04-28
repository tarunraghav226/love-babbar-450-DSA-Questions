import java.util.Arrays;

public class CountInversion {
    static long merge(long[] arr, int l, int m, int r){
        long[] left = Arrays.copyOfRange(arr, l, m+1);
        long[] right = Arrays.copyOfRange(arr, m+1, r+1);

        long count = 0;
        
        int i =0, j=0, k=l;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                count += ((m+1)-(l+i));
            }
        }

        while(i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length){
            arr[k++] = right[j++];
        }

        return count;
    }

    static long calc(long[] arr, int l, int h){
        long count = 0;
        if(l<h){
            int m = (l+h)/2;
            count += calc(arr, l, m);
            count += calc(arr, m+1, h);
            count += merge(arr, l, m, h);
        }
        return count;
    }

    static long inversionCount(long arr[], long N){
        // Your Code Here
        return calc(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        long[] arr = {2,4,1,3,5};
        System.out.println(inversionCount(arr, 5));
    }
}
