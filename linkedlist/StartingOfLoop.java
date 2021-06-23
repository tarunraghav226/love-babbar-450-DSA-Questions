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

public class StartingOfLoop {
    public Node startOfLoop(Node head){
        Node fast=head, slow=head;
        while(slow!=null && fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) break;
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }   
}
