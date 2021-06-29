package linkedlist;

public class TripletSum {
    class Node{
        int data;
        Node prev, next;
        Node(int val)
        {
            data = val;
            prev = null;
            next = null;
        }
    }

    static int countTriplets(Node head, int x){
        Node last = head;
        while(last.next != null) last = last.next;

        Node curr = head, first = null, second = null;
        int count = 0;

        while(curr!=null && curr.next!=null){
            first = curr.next;
            second = last;
            while(first != null && second != null && first != second && second.next != first){
                int sum = curr.data+first.data+second.data;
                if(sum == x){
                    count++;
                    first=first.next;
                    second=second.prev;
                }
                else if(sum<x){
                    first=first.next;
                }
                else{
                    second=second.prev;
                }
            }
        }
        return count;
    }
}
