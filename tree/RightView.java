package tree;

import java.util.ArrayList;

public class RightView {
    int height(Node node){
        if(node == null) return 0;
        int leftMa = height(node.left);
        int rightMa = height(node.right);
        return Math.max(leftMa, rightMa)+1;
    }

    void findRightView(Node root, int[] visitedLevel, int currentLevel, ArrayList<Integer> arr){
        if(root == null) return;

        if(visitedLevel[currentLevel]==0){
            arr.add(root.data);
            visitedLevel[currentLevel] = 1;
        }

        findRightView(root.right, visitedLevel, currentLevel+1, arr);
        findRightView(root.left, visitedLevel, currentLevel+1, arr);
    }

    ArrayList<Integer> rightView(Node root){
        int depth = height(root);
        int[] visitedLevel = new int[depth];
        ArrayList<Integer> arr = new ArrayList<>();

        findRightView(root, visitedLevel, 0, arr);
        return arr;
    }
}
