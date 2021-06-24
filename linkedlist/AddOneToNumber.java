package linkedlist;

public class AddOneToNumber {
    public static Node addOne(Node head) {
        if(head == null) return head;
        
        if(head.next == null) {
            head.data += 1;
            return head;
        }

        Node next = addOne(head.next);
        if(next.data > 9) {
            next.data= 0;
            head.data+=1;
        }
        return head;
    }
}
