import java.util.Scanner;

public class KadanesAlgo {
    public static int find(int[] arr, int n){
        int mSF =0, mEH =0;

        for(int i=0;i<n;i++){
            mEH += arr[i];

            if(mSF < mEH){
                mSF = mEH;
            }

            if(mEH<0){
                mEH = 0;
            }
        }
        return mSF==0?-1:mSF;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = scan.nextInt();

        System.out.println(find(arr, n));
    }    
}
