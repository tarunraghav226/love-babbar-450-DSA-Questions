package graph;

import java.util.*;

public class TopologicalSort {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> stack = new Stack<>();
        int[] visited = new int[V];
        
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                topo(stack, visited, adj, i);
            }
        }
        
        int[] topoArr = new int[V];
        int ind=0;
        while(!stack.isEmpty()){
            topoArr[ind++] = stack.pop();
        }
        return topoArr;
    }
    
    static void topo(Stack<Integer> stack, int[] visited, ArrayList<ArrayList<Integer>> adj, int v){
        visited[v]=1;
        for(int i: adj.get(v)){
            if(visited[i]==0){
                topo(stack, visited, adj, i);
            }
        }
        stack.push(v);
    }
}
