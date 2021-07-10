package tree;

public class MaxSubtreeSum {
    static class INT{
        int v;
        INT(int a)
        {
            v = a;
        }
    }
    
    static int findLargestSubtreeSumUtil(Node root,INT ans){
        
        if (root == null)    
            return 0;
            
        int currSum = root.data +findLargestSubtreeSumUtil(root.left, ans) +findLargestSubtreeSumUtil(root.right, ans);
    
        ans.v = Math.max(ans.v, currSum);
    
        return currSum;
    }
    
    static int findLargestSubtreeSum(Node root){
        if (root == null)    
            return 0;
            
        INT ans = new INT(-9999999);
    
        findLargestSubtreeSumUtil(root, ans);
    
        return ans.v;
    }
}
