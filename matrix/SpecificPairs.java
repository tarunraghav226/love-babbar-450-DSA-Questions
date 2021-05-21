public class SpecificPairs {
    static int findMaxValue(int N,int mat[][]){
        int maxVal = Integer.MIN_VALUE;

        int[][] maxArr = new int[N][N];

        int maxv = mat[N-1][N-1];
        for(int i=N-2;i>=0;i--){
            if(maxv < mat[N-1][i])
                maxv = mat[N-1][i];
            maxArr[N-1][i] = maxv;
        }

        maxv = mat[N-1][N-1];
        for(int i=N-2;i>=0;i--){
            if(maxv < mat[i][N-1])
                maxv = mat[i][N-1];
            maxArr[i][N-1] = maxv;
        }

        for(int i=N-2;i>=0;i--){
            for(int j=N-2;j>=0;j--){
                if(maxArr[i+1][j+1]-mat[i][j] > maxVal)
                    maxVal = maxArr[i+1][j+1]-mat[i][j];
                maxVal = Math.max(mat[i][j], Math.max(maxArr[i+1][j], maxArr[i][j+1]));
            }
        }

        return maxVal;
    }
}
