package tree;

public class LCA {
    Node lca(Node root, int n1,int n2){
        if(root == null) return root;
        if(root.data == n1 || root.data == n2) return root;
        Node lLCA = lca(root.left, n1, n2);
        Node rLCA = lca(root.right, n1, n2);
        
        if(lLCA != null && rLCA != null) return root;
        if(lLCA!=null) return lLCA;
        return rLCA; 
	}
}
