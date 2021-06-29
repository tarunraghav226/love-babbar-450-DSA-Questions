package linkedlist;

public class ReverseInNGroup {
    class Node{
        int data;
        Node next, prev;
    }

    static Node push(Node head, Node newNode){
        newNode.next = head;
        newNode.prev = null;

        if(head!=null){
            head.prev = newNode;
        }

        head = newNode;
        return head;
    }

    static Node revListInGroupOfGivenSize(Node head, int k){
        int count = 0;
        Node newHead=null, current=head, next=null;

        while(current!=null && count<k){
            next = current.next;
            newHead = push(newHead, current);
            current = next;
            count++;
        }

        if(next != null){
            head.next = revListInGroupOfGivenSize(next, k);
            head.next.prev=head;
        }

        return newHead;
    }
}
