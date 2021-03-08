import java.util.Scanner;

public class FindUnion {
    public static int doUnion(int[] arr1, int n, int[] arr2, int m){
        int count = 0;

        int a1 = arr1[arr1.length-1];
        int a2 = arr2[arr2.length-1];

        int max = (a1>a2)?a1:a2;

        int[] map = new int[max+1];

        ++map[arr1[0]];
        count++;

        for(int i=1;i<n;i++) {
            if(arr1[i] != arr1[i-1]){
                count++;
                ++map[arr1[i]];
            }
        }
        for(int i=0;i<m;i++){
            if(map[arr1[i]]==0){
                count++;
                ++map[arr1[i]];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) arr1[i] = scan.nextInt();

        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) arr2[i] = scan.nextInt();

        System.out.println(doUnion(arr1, n, arr2, m));
    }
}
