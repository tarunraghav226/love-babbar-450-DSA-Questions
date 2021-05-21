public class SearchElement {

    public boolean binSearch(int[] arr, int l, int h, int searchVal){
        if(l<=h){
            int m = (l+h)/2;
            if(arr[m] == searchVal) return true;
            if(arr[m] > searchVal) return binSearch(arr, l, m-1, searchVal);
            return binSearch(arr, m+1, h, searchVal); 
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix){
            if(arr[0] <= target || arr[arr.length-1] >= target){
                if(binSearch(arr,0,arr.length-1, target)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
