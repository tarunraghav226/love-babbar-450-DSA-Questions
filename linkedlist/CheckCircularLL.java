package linkedlist;

public class CheckCircularLL {
    boolean isCircular(Node head){
        Node slow = head, fast = head.next;
        while(slow != null && fast != null && fast.next!=null){
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
