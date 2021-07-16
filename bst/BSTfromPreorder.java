package bst;

import linkedlist.SortLL;

public class BSTfromPreorder {
    
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

    class Index{
        int index;
    }

    public TreeNode solve(int[] preorder, Index index, int data, int min, int max, int size){
        if(index.index >= size) return null;

        TreeNode node = null;

        if(data>min && data<max){
            index.index = index.index+1;
            node = new TreeNode(data);
            
            if(index.index < size){
                node.left = solve(preorder, index, preorder[index.index], min, data, size);
            }
            if(index.index < size){
                node.right = solve(preorder, index, preorder[index.index], data, max, size);
            }
        }
        return node;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        Index index = new Index();
        index.index = 0;
        return solve(preorder, index, preorder[index.index], Integer.MIN_VALUE, Integer.MAX_VALUE, preorder.length);
    }
}
