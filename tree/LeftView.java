package tree;

import java.util.ArrayList;

public class LeftView {

    int height(Node node){
        if(node == null) return 0;
        int leftMa = height(node.left);
        int rightMa = height(node.right);
        return Math.max(leftMa, rightMa)+1;
    }

    void findLeftView(Node root, int[] visitedLevel, int currentLevel, ArrayList<Integer> arr){
        if(root == null) return;

        if(visitedLevel[currentLevel]==0){
            arr.add(root.data);
            visitedLevel[currentLevel] = 1;
        }

        findLeftView(root.left, visitedLevel, currentLevel+1, arr);
        findLeftView(root.right, visitedLevel, currentLevel+1, arr);
    }

    ArrayList<Integer> leftView(Node root){
        int depth = height(root);
        int[] visitedLevel = new int[depth];
        ArrayList<Integer> arr = new ArrayList<>();

        findLeftView(root, visitedLevel, 0, arr);
        return arr;
    }
}
