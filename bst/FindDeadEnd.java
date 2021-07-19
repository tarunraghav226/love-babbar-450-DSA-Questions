package bst;

public class FindDeadEnd {
    static boolean solve(Node node, int min, int max){
        if(node == null) return false;
        if(min == max) return true;
        return solve(node.left, min, node.data-1) || solve(node.right, node.data+1, max); 
    }

    public static boolean isDeadEnd(Node root){
        return solve(root, 1, Integer.MAX_VALUE);
    }
}
