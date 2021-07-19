package bst;

public class LargestBST {
    static int[] solve(Node node){
        if(node == null) return new int[] {1, 0, Integer.MAX_VALUE, Integer.MIN_VALUE};
        if(node.left==null && node.right==null) return new int[] {1, 1, node.data, node.data};

        int[] left = solve(node.left);
        int[] right = solve(node.right);

        if(left[0]==1 && right[0]==1){
            if(node.data > left[3] && node.data<right[2]){
                int tl = left[3];
                int tr = right[2];
                if(tl == Integer.MIN_VALUE) tl = node.data;
                if(tr == Integer.MAX_VALUE) tr = node.data;
                return new int[]{1, left[1]+right[1]+1, tl, tr};
            }
        }
        return new int[]{0, Math.max(left[1], right[1]), 0,0};
    }
    static int largestBst(Node root){
        int[] ans = solve(root);
        return ans[1];        
    }
}
