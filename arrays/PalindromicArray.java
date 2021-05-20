public class PalindromicArray {
    public static int findRev(int n){
        int rev = 0;
        while(n != 0){
            rev = (rev * 10) + (n%10);
            n /= 10;
        }
        return rev;
    }

    public static int palinArray(int[] a, int n){
        for(int i=0;i<n;i++){
            int revNum = findRev(a[i]);
            if (revNum != a[i]) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        System.out.println(palinArray(arr,arr.length));
    }
}
