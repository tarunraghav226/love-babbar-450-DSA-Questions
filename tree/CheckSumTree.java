package tree;

public class CheckSumTree {
    class Flag{
        boolean flag;
        Flag(boolean flag){
            this.flag = flag;
        }
    }

    int solve(Node root, Flag flag){
        if(root == null)return 0;
        if(root.left==null && root.right==null){
            return root.data;
        }

        int leftMa = solve(root.left, flag);
        int rightMa = solve(root.right, flag);

        if(root.data != (leftMa+rightMa)) flag.flag = false;

        return root.data * 2;
    }

    boolean isSumTree(Node root){
        if(root==null) return true;

        Flag flag = new Flag(true);

        solve(root, flag);

        return flag.flag;
	}
}
