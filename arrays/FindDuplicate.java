import java.util.Scanner;

public class FindDuplicate {
    public static int findDuplicate(int[] arr){
        int hare = arr[arr[0]];
        int tortoise = arr[0];

        while(hare != tortoise){
            hare = arr[arr[hare]];
            tortoise = arr[tortoise];
        }

        tortoise = arr[0];
        while(tortoise != hare){
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        return tortoise;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = scan.nextInt();

        System.out.println(findDuplicate(arr));
    }
}
