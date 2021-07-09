package tree;

public class CheckLevel {
    int height(Node root){
        if(root == null) return 0;
        
        int leftMa = height(root.left);
        int rightMa = height(root.right);

        return Math.max(leftMa, rightMa) +1;
    }

    boolean checkUtil(Node node, int currHeight, int height){
        if(node == null) return true;

        if(node.left==null && node.right==null){
            return currHeight == height;
        }

        return checkUtil(node.left, currHeight+1, height) && checkUtil(node.right, currHeight+1, height);
    }

    boolean check(Node root){
        if(root == null) return true;
        int height = height(root);
        return checkUtil(root,1, height);
    }
}
