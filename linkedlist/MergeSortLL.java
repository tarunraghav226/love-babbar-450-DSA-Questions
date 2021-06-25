package linkedlist;

public class MergeSortLL {

    static Node merge(Node left, Node right){
        if(left==null) return right;
        if(right==null) return left;

        Node ans = null;
        if(left.data <= right.data){
            ans = left;
            ans.next = merge(left.next, right);
        }
        else{
            ans=right;
            ans.next=merge(left, right.next);
        }
        return ans;
    }

    static Node breakLL(Node head){
        if(head==null || head.next==null) return head;
        Node fast=head.next;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    static Node sort(Node head){
        if(head == null || head.next == null) return head;

        Node middle = breakLL(head);
        Node second = middle.next;
        middle.next = null;
        
        head=sort(head);
        second=sort(second);
 
        Node sorted = merge(head, second);
        return sorted;
    }

    static Node mergeSort(Node head){
        return sort(head);
    }
}
