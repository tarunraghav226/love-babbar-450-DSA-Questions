public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i>=0 && nums[i+1] < nums[i]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(j>=0 && nums[j] <= nums[i]){
                j--;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        reverse(nums, i+1);
    }
    public static void reverse(int[] arr, int start){
        int end = arr.length-1;
        while(start<=end){
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,8,7,2,3,9,6,4,1};
        nextPermutation(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
