import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int index = -1;
        for(int i=N-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        if( index != -1){
            for(int i=N-1;i>=0;i--){
                if(arr[i] > arr[index]){
                    int t = arr[i];
                    arr[i] = arr[index];
                    arr[index] = t;
                    break;
                }
            }

            reverse(arr, index+1, arr.length-1);
        }
        else 
            Arrays.sort(arr);


        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++)
            list.add(arr[i]);

        return list;
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;

            start++;
            end--;
        }
    }
}
