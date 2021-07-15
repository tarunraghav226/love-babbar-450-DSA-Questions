package bst;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryToBST {
    void findInOrder(Node node, ArrayList<Integer> arr){
        if(node == null) return;
        findInOrder(node.left, arr);
        arr.add(node.data);
        findInOrder(node.right, arr);
    }

    void convertTree(Node node, ArrayList<Integer> arr){
        if(node == null) return;
        convertTree(node.left, arr);
        node.data = arr.get(0);
        arr.remove(0);
        convertTree(node.right, arr);
    }
    Node binaryTreeToBST(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        findInOrder(root, arr);
        Collections.sort(arr);
        convertTree(root, arr);
        return root;
    }
}
