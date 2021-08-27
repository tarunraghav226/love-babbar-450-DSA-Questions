public class FloodFill {
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        
        boolean[][] visited = new boolean[image.length][image[0].length];
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        
        int m=image.length;
        int n = image[0].length;
        
        while(!q.isEmpty()){
            Pair coors = q.poll();
            visited[coors.x][coors.y] = true;
            
            for(int i=0;i<4;i++){
                int x = coors.x+dx[i];
                int y = coors.y + dy[i];
                if(x>=0&&x<m && y>=0&&y<n && image[x][y]==image[coors.x][coors.y] && !visited[x][y]){
                    q.add(new Pair(x,y));
                }
            }
            image[coors.x][coors.y] = newColor;
        }
        return image;
    }
}
