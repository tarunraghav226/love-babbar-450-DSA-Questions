package tree;

import java.util.*;

public class BottomView {
    class QueueNode{
        Node node;
        int h;

        QueueNode(Node node, int h){
            this.node=node;
            this.h=h;
        }
    }

    void findBottomView(Node node, ArrayList<Integer> arr){
        Queue<QueueNode> queue = new LinkedList<QueueNode>();
        Map<Integer, Node> map = new TreeMap<Integer,Node>();
        queue.add(new QueueNode(node, 0));
        while(!queue.isEmpty()){
            QueueNode temp = queue.poll();
            map.put(temp.h, temp.node);
            if(temp.node.left != null){
                queue.add(new QueueNode(temp.node.left, temp.h-1));
            }

            if(temp.node.right!=null){
                queue.add(new QueueNode(temp.node.right, temp.h+1));
            }
        }

        for(Map.Entry<Integer, Node> entry: map.entrySet()){
            arr.add(entry.getValue().data);
        }
    }

    public ArrayList <Integer> bottomView(Node root){
        if(root == null) return null;

        ArrayList<Integer> arr = new ArrayList<>();
        findBottomView(root, arr);
        return arr;
    }
}
