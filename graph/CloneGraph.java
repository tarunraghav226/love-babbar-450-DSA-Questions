package graph;

import java.util.*;

public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Node copy = new Node(node.val);
        Node[] vis = new Node[1001];
        dfs(node, copy, vis);
        return copy;
    }
    
    public void dfs(Node node, Node copy, Node[] vis){
        vis[copy.val] = copy;
        for(Node temp: node.neighbors){
            if(vis[temp.val]==null){
                Node newNode = new Node(temp.val);
                copy.neighbors.add(newNode);
                dfs(temp, newNode, vis);
            }
            else{
                copy.neighbors.add(vis[temp.val]);
            }
        }
    }
}
