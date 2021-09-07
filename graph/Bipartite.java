package graph;

public class Bipartite {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color = new int[V];
        Arrays.fill(color, -1);
        
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(!bfs(i, adj, color)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean bfs(int v, ArrayList<ArrayList<Integer>>adj, int[] color){
        Queue<Integer> q = new LinkedList<Integer>();
        color[v] = 1;
        q.add(v);
        
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int it: adj.get(temp)){
                if(color[it]==-1){
                    color[it]=1-color[temp];
                    q.add(it);
                }
                else if(color[it]==color[temp]) return false;
            }
        }
        return true;
    }
}
