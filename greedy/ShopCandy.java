public class ShopCandy {
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        Arrays.sort(candies);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(findMin(candies, N, K));
        arr.add(findMax(candies, N, K));
        return arr;
    }
    static int findMin(int[] arr, int n, int k){
        int result = 0;
        for(int i=0;i<n;i++){
            result += arr[i];
            n = n-k;
        }
        return result;
    }
    static int findMax(int[] arr, int n, int k){
        int result = 0;
        int index=0;
        for(int i=n-1;i>=index;i--){
            result += arr[i];
            index+=k;
        }
        return result;
    }
}
