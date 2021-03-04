import java.util.Scanner;

public class CyclicallyRotate {
    public static void rotate(int[] arr, int n){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        rotate(arr, n);

        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println("");
    }    
}
