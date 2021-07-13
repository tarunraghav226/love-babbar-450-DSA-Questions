package bst;

public class MinVal {
    int minValue(Node root){
        if(root == null) return -1;
        Node temp = root;
        while(temp.left!=null){
            temp = temp.left;
        }
        return temp.data;
    }
}
