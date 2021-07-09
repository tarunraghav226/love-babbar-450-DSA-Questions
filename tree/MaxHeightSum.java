package tree;

public class MaxHeightSum {
    int[] solve(Node node){
        if(node == null) return new int[]{0,0};
        int[] left = solve(node.left);
        int[] right = solve(node.right);

        if(left[0]>right[0]){
            return new int[] {left[0]+1, left[1]+node.data};
        }
        else if(right[0]> left[0]){
            return new int[] {right[0]+1, right[1]+node.data}
        }
        else{
            return new int[] {right[0]+1, Math.max(right[1],left[1])+node.data};
        }
    }
    public int sumOfLongRootToLeafPath(Node root){
        int[] arr = solve(root);
        return arr[1];
    }
}
