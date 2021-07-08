package tree;

import java.util.*;

public class DiagonalTraversal {
    public ArrayList<Integer> diagonal(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            while(temp != null){
                arr.add(temp.data);
                if(temp.left!=null) queue.add(temp.left);
                temp=temp.right;
            }
        }
        return arr;
      }
}
