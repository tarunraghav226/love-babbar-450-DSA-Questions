package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TopView {
    static class QueueObj{
        Node node;
        int hd;
        QueueObj(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    static void findTopView(Node node, ArrayList<Integer> arr){
        if(node == null) return;

        Queue<QueueObj> queue = new LinkedList<QueueObj>();
        Map<Integer, Node> map = new TreeMap<Integer, Node>();

        queue.add(new QueueObj(node, 0));
        while(!queue.isEmpty()){
            QueueObj temp = queue.poll();
            if(!map.containsKey(temp.hd)){
                map.put(temp.hd, temp.node);
            }

            if(temp.node.left!=null){
                queue.add(new QueueObj(temp.node.left, temp.hd-1));
            }

            if(temp.node.right!=null){
                queue.add(new QueueObj(temp.node.right, temp.hd+1));
            }
        }
        for(Entry<Integer, Node> entry:map.entrySet()){
            arr.add(entry.getValue().data);
        }
    }

    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> arr = new ArrayList<>();

        findTopView(root, arr);
    
        return arr;
    }
}
