package linkedlist;

public class ReverseDLL {
    class Node{
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node reverseDLL(Node  head){
        if(head == null || head.next == null){
            return head;
        }

        Node curr = head;
        while(curr.next != null) curr=curr.next;

        head = curr;
        curr.next = curr.prev;
        curr.prev = null;
        curr = curr.next;

        while(curr.prev != null){
            Node temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = curr.next;
        }

        curr.prev = curr.next;
        curr.next = null;
        return head;
    }
}
