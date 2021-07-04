package linkedlist;

public class DeleteNoderight {
    Node reverse(Node root){
        if (root==null || root.next==null) return root;
        Node prev = null;
        Node curr = root;
        while(curr!=null){
            Node next=  curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    Node compute(Node head){
        if(head.next == null) return head;

        Node reversed = reverse(head);
        Node prev=reversed, curr=reversed.next;

        int ma = reversed.data;
        while(curr!=null){
            if(curr.data<ma){
                prev.next=curr.next;
            }
            else{
                ma = ma>curr.data?ma:curr.data;
                prev=curr;
            }
            curr=curr.next;
        }

        return reverse(reversed);
    }
}
