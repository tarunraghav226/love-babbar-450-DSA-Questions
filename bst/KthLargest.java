package bst;

public class KthLargest {
    class K{
        int k;
    }
    int solve(Node root, K k){
        if(root == null) return 0;
        int right = solve(root.right, k);
        if(right != 0)return right;

        k.k = k.k-1;
        if(k.k==0) return root.data;

        int left = solve(root.left, k);
        if(left != 0) return left;
        
        return 0;
    }

    public int kthLargest(Node root,int K){
        K k = new K();
        k.k = K;
        return solve(root, k);
    }
}
