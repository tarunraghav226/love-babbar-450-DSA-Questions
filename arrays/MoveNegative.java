import java.util.Scanner;

public class MoveNegative {
        public static void move(int[] arr){
            int n = arr.length;

            int low = 0, mid = 0;
            while(mid<n){
                if(arr[mid] < 0){
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                }
                mid++;
            }
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++) arr[i] = scan.nextInt();

            move(arr);

            for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
            System.out.println();
        }
}
