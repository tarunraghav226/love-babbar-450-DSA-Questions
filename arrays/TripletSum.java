import java.util.Arrays;

public class TripletSum {
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            for(int j=i+1, k=A.length-1;j<k;){
                if(X-A[i] == A[j]+A[k]){
                    return true;
                }
                else if(X-A[i] > A[j]+A[k]){
                    j++;
                }
                else if(X-A[i] < A[j]+A[k]){
                    k--;
                }
            }
        }
        return false;
     }
    public static void main(String[] args) {
        int[] A = {1, 4, 45, 6, 10, 8};
        System.out.println(find3Numbers(A, A.length, 13));
    }
}
