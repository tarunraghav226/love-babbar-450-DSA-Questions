package linkedlist;

public class DeleteNode {
    static Node deleteNode(Node head, int key){
        Node curr = head, prev = new Node(0);
        
        while(curr.data!=key){
            if(curr.next==head){
                System.out.println("Node not found");
                return head;
            }
            prev = curr;
            curr = curr.next;
        }

        if(curr==head && curr.next==head){
            return null;
        }

        if(curr==head){
            prev=curr;
            while(prev.next != curr){
                prev = prev.next;
            }
            head = curr.next;
            prev.next = head;
        }
        else if(curr.next == head){
            prev.next = head;
        }
        else{
            prev.next = curr.next;
        }
        return head;
    }
}
