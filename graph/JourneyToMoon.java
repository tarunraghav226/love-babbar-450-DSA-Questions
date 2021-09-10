package graph;

import java.util.*;

public class JourneyToMoon {
    static class Count{
        int count = 0;
    }
    
    public static int journeyToMoon(int n, List<List<Integer>> astronaut) {
    // Write your code here
        long total = combinations(n);
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n; i++) graph.add(new ArrayList<>());
        for(List<Integer> pair: astronaut){
            graph.get(pair.get(0)).add(pair.get(1));
            graph.get(pair.get(1)).add(pair.get(0));
        }
        
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                Count count = new Count();
                int nodes = dfs(i, visited, graph, count);
                total -= (combinations(nodes));
            }
        }
        return (int)total;
    }
    
    static int dfs(int v, boolean[] visited, ArrayList<ArrayList<Integer>> graph, Count count){
        visited[v]=true;
        count.count += 1;
        for(int it: graph.get(v)){
            if(!visited[it]){
                dfs(it, visited, graph, count);
            }
        }
        return count.count;
    }
    
    public static long combinations(int n){
        return (fact(n)/(2*fact(n-2)));
    }
    
    public static long fact(int v){
        if(v<=1) return 1;
        return v * fact(v-1);
    }
}
