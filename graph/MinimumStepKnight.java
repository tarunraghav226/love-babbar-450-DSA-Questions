import java.util.*;

public class MinimumStepKnight {
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n){
        int[][] board = new int[n+1][n+1];
        boolean[][] visited = new boolean[n+1][n+1];
        Queue<Pair> q = new LinkedList<>();
        
        board[KnightPos[0]][KnightPos[1]] = 0;
        q.add(new Pair(KnightPos[0], KnightPos[1]));

        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };

        while(!q.isEmpty()){
            Pair coors = q.poll();
            visited[coors.x][coors.y] = true;
            if(coors.x==TargetPos[0]&&coors.y==TargetPos[1]) return board[coors.x][coors.y];
            for(int i=0;i<dx.length;i++){
                int x = dx[i]+coors.x;
                int y = dy[i]+coors.y;
                if(x>=1&&x<=n && y>=1&&y<=n && !visited[x][y]){
                    q.add(new Pair(x, y));
                    board[x][y] = board[coors.x][coors.y]+1;
                }
            }
        }
        return -1;
    }
}
