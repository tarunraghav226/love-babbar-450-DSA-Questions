package dp;

public class GoldMine {
    static int maxGold(int n, int m, int M[][]){
        for(int col=m-2;col>=0;col--){
            for(int row=0;row<n;row++){
                int right = M[row][col+1];
                int right_up = (row==0)?0:M[row-1][col+1];
                int right_down = (row==n-1)?0:M[row+1][col+1];
                M[row][col] += Math.max(right, Math.max(right_down, right_up));
            }
        }
        int res = M[0][0];
        for(int i=1;i<n;i++){
            res = Math.max(res, M[i][0]);
        }
        return res;
    }
}
