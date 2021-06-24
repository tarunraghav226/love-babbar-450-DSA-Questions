package linkedlist;

import java.util.HashMap;

public class RemoveDuplicatesUnsorted {
    public Node removeDuplicates(Node head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Node temp = head;
        map.put(temp.data, 1);
        while(temp != null && temp.next != null){
            if(map.containsKey(temp.next.data)){
                temp.next = temp.next.next;
            }
            else{
                map.put(temp.next.data, 1);
                temp=temp.next;
            }
        }
        return head;
    }
}
