package linkedlist;

public class FlattenLL {
    class Node{
        int data;
        Node next;
        Node bottom;
        
        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }

    Node flatten(Node root){
        if(root == null || root.next == null) return root;

        root.next = flatten(root.next);

        root = mergeLL(root, root.next);

        return root;
    }

    Node mergeLL(Node first, Node second){
        if(first==null) return second;
        if(second==null) return first;

        Node temp = new Node(0);
        Node res = temp;

        while(first!=null && second!=null){
            if(first.data<second.data){
                temp.bottom = first;
                first = first.bottom;
                temp = temp.bottom;
            }
            else{
                temp.bottom = second;
                second = second.bottom;
                temp = temp.bottom;
            }
        }
        if(first==null) temp.bottom=second;
        else temp.bottom=first;
        return res.bottom;
    }
}
