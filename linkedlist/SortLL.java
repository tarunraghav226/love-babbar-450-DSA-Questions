package linkedlist;

public class SortLL {
    static Node segregate(Node head){
        if(head==null) return head;

        Node one = new Node(0), tempOne = one, zero=new Node(0), tempZero=zero, two=new Node(0), tempTwo=two;
        Node temp=head;
        
        while(temp!=null){
            if(temp.data == 0){
                tempZero.next=temp;
                tempZero = tempZero.next;
            }
            else if(temp.data==1){
                tempOne.next=temp;
                tempOne = tempOne.next;
            }
            else{
                tempTwo.next=temp;
                tempTwo = tempTwo.next;
            }
            temp=temp.next;
        }
        tempZero.next = one.next!=null?one.next:two.next;
        tempOne.next = two.next;
        tempTwo.next = null;
        head = zero.next;
        return head;
    }
}
