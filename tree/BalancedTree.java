package tree;

public class BalancedTree {

    class Answer{
        boolean ans;
        Answer(boolean ans){
            this.ans = ans;
        }
    }

    int solve(Node root, Answer answer){
        if(root==null){
            return 0;
        }

        int lMa = solve(root.left, answer);
        int rMa = solve(root.right, answer);

        if(Math.abs(lMa-rMa)>1){
            answer.ans= false;
        }

        return Math.max(lMa, rMa) + 1;
    }
    
    boolean isBalanced(Node root){
        Answer answer = new Answer(true);
        solve(root, answer);
        return answer.ans;
    }
}
