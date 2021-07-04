package linkedlist;

public class Segregate {
    Node divide(int N, Node head){
        Node evenHead = new Node(0), even = evenHead;
        Node oddHead = new Node(0), odd = oddHead;

        while(head!=null){
            if(head.data%2==0){
                even.next=head;
                even=even.next;
            }
            else{
                odd.next=head;
                odd=odd.next;
            }
            head = head.next;
        }
        odd.next=null;
        even.next=oddHead.next;
        return evenHead.next;
    }
}
