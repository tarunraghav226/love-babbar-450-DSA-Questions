import java.util.Scanner;

public class Sort012{
    public static void sort(int[] arr){
        int low = 0, mid = 0;
        int high = arr.length-1;

        int n = arr.length;
        int temp = 123;

        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
            }   
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();

        sort(arr);

        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}