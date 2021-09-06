package graph;

import java.util.*;

public class SnakesAndLadder {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int steps = 0;
        visited[n-1][0]=true;
        q.add(1);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int val = q.poll();
                if(val==n*n) return steps;
                for(int k=1;k<=6;k++){
                    if(k+val>n*n) break;
                    int[] coors = findCoordinates(val+k, n);
                    int r = coors[0];
                    int c = coors[1];
                    if(visited[r][c]) continue;
                    visited[r][c] = true;
                    if(board[r][c]==-1){
                        q.add(k+val);
                    }
                    else q.add(board[r][c]);
                }
            }
            steps++;
        }
        return -1;
    }

    int[] findCoordinates(int v, int n){
        int r = n - (v-1)/n -1;
        int c = (v-1)%n;
        if (r % 2 == n % 2) {
            return new int[]{r, n - 1 - c};
        } else {
            return new int[]{r, c};
        }
    }
}
