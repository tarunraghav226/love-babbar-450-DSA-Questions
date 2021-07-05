package tree;

public class HeightOfTree {
    int height(Node node) {
        if(node == null) return 0;
        int leftMa = height(node.left);
        int rightMa = height(node.right);
        return Math.max(leftMa, rightMa)+1;
    }
}
