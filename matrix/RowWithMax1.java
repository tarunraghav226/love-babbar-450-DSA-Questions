public class RowWithMax1{
    int rowWithMax1s(int arr[][], int n, int m) {
        int max_one = -1;

        int j = m-1;

        for(int i=0; i<n; i++){
            while(j>=0 && arr[i][j] == 1){
                j -= 1;
                max_one = i;
            }
        }

        return max_one;
    }
}