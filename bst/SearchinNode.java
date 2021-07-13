package bst;

public class SearchinNode {
    boolean isPresent(Node root, int key){
        if(root == null) return false;

        Node temp = root;
        while(temp!=null){
            if(temp.data == key) return true;
            else if (temp.data > key) temp = temp.left;
            else temp = temp.left;
        }
        return false;
    }
}
