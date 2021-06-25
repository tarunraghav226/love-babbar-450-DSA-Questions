package linkedlist;

public class SplitCircularLL {
    void splitList(Node head){
        Node fast = head;
        Node slow = head;

        if(head == null || head.next==null) return;

        while(fast.next!=head && fast.next.next!=head){
            fast=fast.next.next;
            slow=slow.next;
        }

        if(fast.next.next == head) fast=fast.next;

        Node head1 = head;

        Node head2 = null;
        if(head.next!=head) head2=slow.next;

        fast.next = slow.next;

        slow.next=head1;

	 }
}
