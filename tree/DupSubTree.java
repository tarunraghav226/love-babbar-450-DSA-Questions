package tree;

import java.util.HashMap;

public class DupSubTree {
    String solve(Node node, HashMap<String, Integer> map){
        if(node == null) return "$";
        if(node.left==null && node.right==null){
            String st = ""+node.data;
            return st;
        }
        String s="";
        s= s+node.data;
        s = s+solve(node.left, map);
        s= s+solve(node.right, map);
        map.put(s, map.containsKey(s)?map.get(s)+1:1);
        return s;
    }

    int dupSub(Node root) {
        HashMap<String, Integer> map = new HashMap<>();
        solve(root, map);
        for(int v: map.values()){
            if(v>=2) return 1;
        }
        return 0;
    }
}
