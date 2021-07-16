package bst;

import jdk.nashorn.api.tree.Tree;

public class KthSmallest {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class K{
        int k;
    }

    int solve(TreeNode node, K k){
        if(node == null) return 0;
        int left = solve(node.left, k);
        if(left != 0) return left;

        k.k = k.k-1;
        if(k.k==0){
            return node.val;
        }

        int right = solve(node.right, k);
        if(right != 0) return right;
        return 0;
    }

    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;

        K kI = new K();
        kI.k = k;
        return solve(root, kI);
    }
}
