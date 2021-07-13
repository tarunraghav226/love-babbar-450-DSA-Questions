package bst;

class Node{
    int data;
    Node left ,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class Insert {
    Node insert(Node root, int Key){
        // your code here
        Node node = new Node(Key);
        if(root==null) {
            root=node;
            return root;
        }
        Node prev=null;
        Node temp = root;
        while(temp!=null){
            if(temp.data>Key){
                prev= temp;
                temp=temp.left;
            }
            else if(temp.data < Key){
                prev= temp;
                temp=temp.right;
            }
            else{
                return root;
            }
        }
        if(prev.data>Key){
            prev.left=node;
        }
        else prev.right=node;
        return node;
    }
}
