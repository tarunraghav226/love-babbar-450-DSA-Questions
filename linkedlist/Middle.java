package linkedlist;

public class Middle {
    public ListNode middleNode(ListNode head) {
        int n=0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        n=n/2;
        while(n!=0){
            head=head.next;
            n--;
        }
        return head;
    }
}
