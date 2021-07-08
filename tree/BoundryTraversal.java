package tree;

import java.util.*;

public class BoundryTraversal {
    ArrayList <Integer> printBoundary(Node node){
	    ArrayList<Integer> arr = new ArrayList<>();
        if(node == null) return arr;

        arr.add(node.data);

        addLeftNode(node.left,arr);
        addLeafNode(node, arr);
        addRightNode(node.right, arr);

        return arr;
	}

    void addLeftNode(Node node, ArrayList<Integer> arr){
        if(node == null) return;
        if(node.left!=null){
            arr.add(node.data);
            addLeftNode(node.left, arr);
        }
        else if(node.right != null){
            arr.add(node.data);
            addLeftNode(node.right, arr);
        }
    }

    void addLeafNode(Node node , ArrayList<Integer> arr){
        if(node == null)return;

        addLeafNode(node.left, arr);
        if(node.left==null && node.right==null) arr.add(node.data);
        addLeafNode(node.right, arr);
    }

    void addRightNode(Node node, ArrayList<Integer> arr){
        if(node == null) return;

        if(node.right != null){
            addRightNode(node.right, arr);
            arr.add(node.data);
        }
        else if(node.left != null){
            addRightNode(node.left, arr);
            arr.add(node.data);
        }
    }
}
