package tree;

public class Tree2DLL {
    static Node prev;
        
    static void fixPrevptr(Node root) 
    {
        if (root == null)
            return;
 
        fixPrevptr(root.left);
        root.left = prev;
        prev = root;
        fixPrevptr(root.right);
 
    }
 
    static Node fixNextptr(Node root) 
    {        
        while (root.right != null)
            root = root.right;

        while (root != null && root.left != null) 
        {
            Node left = root.left;
            left.right = root;
            root = root.left;
        }

        return root;
    }
 
    static Node bToDLL(Node root) 
    {
        prev = null;
 
        fixPrevptr(root);
 
        return fixNextptr(root);
    }
}
