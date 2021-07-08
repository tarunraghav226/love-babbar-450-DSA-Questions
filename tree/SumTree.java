package tree;

public class SumTree {
    int solve(Node root){
        if(root == null) return 0;

        if(root.left==null && root.right==null){
            int temp = root.data;
            root.data=0;
            return temp;
        }

        int lA = solve(root.left);
        int rA = solve(root.right);
        int temp = lA+rA+root.data;
        root.data = (lA+rA);
        return temp;
    }
    public void toSumTree(Node root){
        if(root == null) return;
        
        solve(root);

   }
}
