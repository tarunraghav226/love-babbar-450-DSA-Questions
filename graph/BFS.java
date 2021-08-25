public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[V];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int val = q.poll();
            ans.add(val);
            for(int key: adj.get(val)){
                if(vis[key]==0){
                    q.add(key);
                    vis[key]=1;
                }
            }
        }
        return ans;
    }
}
