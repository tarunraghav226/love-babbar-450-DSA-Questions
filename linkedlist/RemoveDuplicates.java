package linkedlist;

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

public class RemoveDuplicates {
    Node removeDuplicates(Node head){
        if(head == null )return head;
        Node temp = head, curr = head;
        while(curr != null && curr.next != null && temp != null && temp.next!=null){
            if(temp.next.data == curr.data){
                temp=temp.next;
            }
            else{
                curr.next = temp.next;
                curr = temp.next;
                temp=curr;
            }
        }
        return head;
    }
}
