package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class LevelOrder {
    static ArrayList <Integer> levelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if(node==null) return arr;

        queue.add(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            arr.add(temp.data);
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
        return arr;
    }
}
