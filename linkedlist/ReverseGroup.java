package linkedlist;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class ReverseGroup {
    public static Node reverse(Node node, int k){
        int cnt = 0;
        Node next=null, prev = null, curr=node;
        while(curr != null && cnt < k){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
            cnt++;
        }
        if(next!=null)
            node.next=reverse(next, k);
        return prev;
    }
}
