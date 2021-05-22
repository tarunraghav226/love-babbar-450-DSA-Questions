public class RotateMat {
    public void rotate(int[][] matrix) {
        int temp = -1;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int[] arr: matrix){
            for(int i=0, j=arr.length-1;i<=j;i++,j--){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
