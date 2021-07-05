package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseLevelOrder {
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(node == null) return arr;
        
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            arr.add(temp.data);
            if(temp.right!=null) queue.add(temp.right);
            if(temp.left!=null) queue.add(temp.left);
        }

        Collections.reverse(arr);

        return arr;

    }
}
