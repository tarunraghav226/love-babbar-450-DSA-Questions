package bst;

public class DeleteNode {
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val > key){
            root.left = deleteNode(root.left, key);
            return root;
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
            return root;
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                TreeNode inOrSucc = succ(root);
                int temp = root.val;
                root.val = inOrSucc.val;
                inOrSucc.val = temp;
                root.right=deleteNode(root.right, key);
                return root;
            }
        }
    }
    TreeNode succ(TreeNode node){
        TreeNode temp = node.right;
        while(temp.left!=null) temp =temp.left;
        return temp;
    }
}
