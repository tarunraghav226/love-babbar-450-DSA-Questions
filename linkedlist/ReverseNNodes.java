package linkedlist;

public class ReverseNNodes {
    static class Node{
        char data;
        Node prev;
        Node next;
    }

    static void rotate(Node head, int n){
        if(n==0) return;

        Node current = head;
        int count = 1;

        while(count<n && current!=null){
            current = current.next;
            count++;
        }

        if(current == null) return;

        Node nthNode = current;

        while(current.next!=null) current = current.next;

        current.next = head;
        head.prev = current;

        head = nthNode.next;
        head.prev = null;
        nthNode.next = null;

    }
}
