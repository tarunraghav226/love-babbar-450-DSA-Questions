package graph;

import java.util.*;

public class BellmanFord {
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        //code here
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        for(int i=0;i<n-1;i++){
            for(int u=0;u<edges.length;u++){
                for(int v=0;v<edges[0].length;v++){
                    if(u!=v && edges[u][v] !=0){
                        int weight = edges[u][v];
                        if(dist[u]+weight<dist[v]){
                            dist[v]=dist[u]+weight;
                        }
                    }
                }
            }
        }
        
        for(int u=0;u<edges.length;u++){
                for(int v=0;v<edges[0].length;v++){
                    if(u!=v && edges[u][v] !=0){
                        int weight = edges[u][v];
                        if(dist[u]+weight<dist[v]){
                            return 0;
                        }
                    }
                }
            }
        return 1;
    }
}
