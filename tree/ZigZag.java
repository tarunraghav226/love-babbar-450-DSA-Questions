package tree;

import java.util.ArrayList;
import java.util.*;

public class ZigZag {
    ArrayList<Integer> zigZagTraversal(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;

        Queue<Node> queue = new LinkedList<Node>();
        int f=1;
        queue.add(root);
        while(!queue.isEmpty()){
            int sz = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            while(sz-->0){
                Node tempNode = queue.poll();
                temp.add(tempNode.data);
                if(tempNode.left!=null) queue.add(tempNode.left);
                if(tempNode.right!=null) queue.add(tempNode.right);
            }
            if(f%2==0){
                Collections.reverse(temp);
                f=1;
            }else{
            f=2;
            }
            for(int i=0;i<temp.size();i++){
                arr.add(temp.get(i));
            }
        }
        return arr;
	}
}
