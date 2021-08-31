package graph;

import java.util.*;

public class WeirdConnection {
    public int makeConnected(int n, int[][] connections) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(i, new ArrayList<Integer>());
        
        
        int edges = 0;
        for(int[] pair: connections){
            adj.get(pair[0]).add(pair[1]);
            adj.get(pair[1]).add(pair[0]);
            edges++;
        }
        
        boolean[] vis = new boolean[n];
        int components = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
            components++;
            dfs(adj, i, vis);
            }
        }
        
        if(edges<n-1) return -1;
        int redundant = edges-((n-1)-(components-1));
        if(redundant>=components-1) return components-1;
        return -1;
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> adj, int v, boolean[] vis){
        vis[v]=true;
        for(int i: adj.get(v)){
            if(!vis[i]){
                dfs(adj, i, vis);
            }
        }
    }
}
