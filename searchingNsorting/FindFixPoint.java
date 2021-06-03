public class FindFixPoint {

    int search(int[] arr, int l, int high){
        int ind = -1;
        while(l<=high){
            if(arr[mid] == mid+1){
                ind = mid+1;
                break;
            }
            else if(arr[mid] < mid) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ind;
    }

    int solve(int[] arr){
        int ind = search(arr, 0, arr.length-1);
        return ind;
    }
}
