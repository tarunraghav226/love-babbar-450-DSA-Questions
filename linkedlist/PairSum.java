package linkedlist;

public class PairSum {
    static class Node{
        int data;
        Node next, prev;
    }

    static void pairSum( Node head, int x){
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }

        while(head!=last && head.prev!=last){
            int sum = head.data + last.data;
            if(sum == x){
                System.out.println("Found "+head.data+" "+last.data);
            }
            else if(sum < x){
                head = head.next;
            }
            else{
                last=last.prev;
            }
        }
    }
}
