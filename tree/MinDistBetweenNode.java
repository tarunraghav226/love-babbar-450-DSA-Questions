package tree;

public class MinDistBetweenNode {
    Node lca(Node root, int n1,int n2){
        if(root == null) return root;
        if(root.data == n1 || root.data == n2) return root;
        Node lLCA = lca(root.left, n1, n2);
        Node rLCA = lca(root.right, n1, n2);
        
        if(lLCA != null && rLCA != null) return root;
        if(lLCA!=null) return lLCA;
        return rLCA; 
	}

    int distance(Node node, int val){
        if( node == null) return 0;
        if(node.data==val) return 1;
        int left = distance(node.left, val);
        int right = distance(node.right, val);
        if(left==0 && right==0) return 0;
        return left+right+1;
    }

    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca = lca(root, a, b);
        int left = distance(lca, a);
        int right = distance(lca, b);
        return left+right-2;
    }
}
