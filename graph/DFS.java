public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean[] vis = new boolean[V];
        dfs(0,vis,adj, ans);
        return ans;
    }
    
    public void dfs(int i, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans){
        ans.add(i);
        vis[i] = true;
        for(int key: adj.get(i)){
            if(!vis[key]){
                dfs(key, vis, adj, ans);
            }
        }
    }
}
