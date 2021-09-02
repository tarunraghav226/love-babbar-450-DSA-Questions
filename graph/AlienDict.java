package graph;

import java.util.*;

public class AlienDict {
    public String findOrder(String [] dict, int N, int K){   
        String ans = "";
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        Collections.fill(graph, new ArrayList<>());
        for(int i=0;i<N-1;i++){
            String w1 = dict[i];
            String w2 = dict[i+1];

            for(int j=0;j<Math.min(w1.length(), w2.length()); j++){
                if(w1.charAt(j)!=w2.charAt(j)){
                    graph.get(w1.charAt(j)-'a').add(w2.charAt(j)-'a');
                }
            }
        }

        int[] vis = new int[K];
        for(int i=0;i<K;i++){
            if(vis[i]==0){
                dfs(i,vis, graph, ans);
            }
        }
        return ans;
    }
    
    public void dfs(int i, int[] vis, ArrayList<ArrayList<Integer>> graph, String ans){
        vis[i] = 1;
        for(int k:graph.get(i)){
            if(vis[k]==0){
                dfs(k,vis, graph, ans);
            }
        }
        char ch = (char)('a'+i);
        ans = ch+ans;
    }

}
