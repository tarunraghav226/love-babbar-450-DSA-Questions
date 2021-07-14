package bst;

public class PopulateSuccessor {
    class Node {
        int data;
        Node left, right,next;
        
        public Node(int data){
            this.data = data;
        }
    }
    Node prev;
    public void populateNextUtil(Node root){
        if(root == null) return;
        populateNextUtil(root.left);
        if(prev==null){
            prev = root;
        }
        else{
            prev.next = root;
            prev = root;
        }
        populateNextUtil(root.right);
    }

    public void populateNext(Node root){
        prev = null;
        populateNextUtil(root);
    }
}
