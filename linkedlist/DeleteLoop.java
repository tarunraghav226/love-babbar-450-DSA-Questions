package linkedlist;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class DeleteLoop {
    public static Node deleteLoop(Node node){
        Node slow=node, fast=node;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(slow==node){
            while(fast.next!=slow) fast = fast.next;
            fast.next=null;
        }
        else{
            fast=node;
            while(fast.next!=slow.next){
                fast=fast.next;
                slow=slow.next;
            }
            fast.next=null;
        }
        return node;
    }
}
