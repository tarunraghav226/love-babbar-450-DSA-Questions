import java.util.Scanner;

public class KthMinElement{
    public static void heapify(int[] arr, int n, int j){
        int smallest = j;
        int left = (2*j)+1;
        int right = (2*j)+2;

        if(left<n && arr[left]<arr[smallest]) smallest = left;
        if(right<n && arr[right]<arr[smallest]) smallest = right;

        if(smallest != j){
            int temp = arr[j];
            arr[j] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }

    }

    public static void builHeap(int[] arr, int n){

        for(int j= (n-1)/2;j>=0;j--){
            heapify(arr,n,j);
        }
    }

    public static int extractMin(int[] arr, int k, int n){
        int val = 1231242;
        for(int i=n-1;i>=n-k;i--){
            val = arr[0];
            arr[0] = arr[i];
            heapify(arr, n, 0);
        }
        return val;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        builHeap(arr, n);
        System.out.println(extractMin(arr, k, n));
    }
}