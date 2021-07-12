package tree;

import java.util.*;

public class DuplicateSubtrees {
    public String inorder(Node node,ArrayList<Node> arr, HashMap<String, Integer> m)
    {
        if (node == null)
            return "";
      
        String str = "(";
        str += inorder(node.left, arr, m);
        str += Integer.toString(node.data);
        str += inorder(node.right, arr, m);
        str += ")";
        
        if (m.get(str) != null && m.get(str)==1 )
            System.out.print( node.data + " ");
      
        if (m.containsKey(str)){
            if(m.get(str)==1){ arr.add(node);}
            m.put(str, m.get(str) + 1);
        }
        else
            m.put(str, 1);
         
        
        return str;
    }
     
    public List<Node>  printAllDups(Node root)
    {
        HashMap<String, Integer> m = new HashMap<>();
        ArrayList<Node> arr = new ArrayList<Node>();
        inorder(root, arr, m);
        return arr;
    }
}
