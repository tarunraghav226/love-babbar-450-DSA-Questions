package linkedlist;

public class MoveLastToFirst {
    public Node move(Node head){
        Node last = null, temp= head;
        while(temp!=null && temp.next!=null){
            if(temp.next.next == null){
                last = temp.next;
                temp.next = null;
                break;
            }
            temp=temp.next;
        }
        last.next = head;
        head = last;
        return head;
    }
}
