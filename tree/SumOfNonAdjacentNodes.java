package tree;

import java.util.HashMap;

public class SumOfNonAdjacentNodes {
    public static int sumOfGrandChildren(Node node, HashMap<Node,Integer> mp)
    {
        int sum = 0;
        
        if (node.left!=null)
            sum += getMaxSumUtil(node.left.left, mp) +
                   getMaxSumUtil(node.left.right, mp);
   
        if (node.right!=null)
            sum += getMaxSumUtil(node.right.left, mp) +
                   getMaxSumUtil(node.right.right, mp);
        return sum;
    }
 
    public static int getMaxSumUtil(Node node, HashMap<Node,Integer> mp)
    {
        if (node == null)
            return 0;
   
        if(mp.containsKey(node))
            return mp.get(node);
   
        int incl = node.data + sumOfGrandChildren(node, mp);
   
        int excl = getMaxSumUtil(node.left, mp) +
                   getMaxSumUtil(node.right, mp);
   
        mp.put(node,Math.max(incl, excl));
   
        return mp.get(node);
    }
 
    public static int getMaxSum(Node node)
    {
        if (node == null)
            return 0;
        HashMap<Node,Integer> mp=new HashMap<>();
        return getMaxSumUtil(node, mp);
    }
 
}
